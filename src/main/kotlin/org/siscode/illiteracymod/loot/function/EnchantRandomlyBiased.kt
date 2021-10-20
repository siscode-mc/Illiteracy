package org.siscode.illiteracymod.loot.function

import com.google.common.collect.Lists
import com.google.gson.*
import net.minecraft.enchantment.Enchantment
import net.minecraft.enchantment.EnchantmentLevelEntry
import net.minecraft.enchantment.Enchantments
import net.minecraft.item.EnchantedBookItem
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.loot.condition.LootCondition
import net.minecraft.loot.context.LootContext
import net.minecraft.loot.function.ConditionalLootFunction
import net.minecraft.loot.function.EnchantRandomlyLootFunction
import net.minecraft.util.Identifier
import net.minecraft.util.JsonHelper
import net.minecraft.util.registry.Registry

class EnchantRandomlyBiased(
    lootConditions: Array<out LootCondition>?,
    enchantments: Collection<Enchantment>,
    val mendingBias: Float
) : ConditionalLootFunction(lootConditions) {

    val enchantments: List<Enchantment> = enchantments.toMutableList()
    val delegate = EnchantRandomlyLootFunction.Builder().build()

    override fun getType() = ENCHANT_RANDOMLY_BIASED

    override fun process(stack_: ItemStack, context: LootContext): ItemStack {
        if (context.random.nextFloat() < mendingBias) {
            var stack = stack_
            if (stack.isOf(Items.BOOK)) {
                stack = ItemStack(Items.ENCHANTED_BOOK)
                stack.addEnchantment(Enchantments.MENDING, 1)
            } else {
                stack.addEnchantment(Enchantments.MENDING, 1)
            }
            return stack
        } else {
            return delegate.apply(stack_, context)
        }
    }

    object Serializer : ConditionalLootFunction.Serializer<EnchantRandomlyBiased>() {
        override fun toJson(json: JsonObject, lootfunc: EnchantRandomlyBiased, context: JsonSerializationContext) {
            super.toJson(json, lootfunc, context)
            if (!lootfunc.enchantments.isEmpty()) {
                val jsonArray = JsonArray()
                for (enchantment in lootfunc.enchantments) {
                    val identifier = Registry.ENCHANTMENT.getId(enchantment)
                        ?: throw IllegalArgumentException("Don't know how to serialize enchantment $enchantment")
                    jsonArray.add(JsonPrimitive(identifier.toString()) as JsonElement)
                }
                json.add("enchantments", jsonArray)
            }
            json.add("mending_bias", JsonPrimitive(lootfunc.mendingBias))
        }

        override fun fromJson(
            json: JsonObject,
            context: JsonDeserializationContext?,
            conditions: Array<out LootCondition>?
        ): EnchantRandomlyBiased {
            val list: MutableList<Enchantment> = Lists.newArrayList()
            var bias: Float = 0.2f
            if (json.has("enchantments")) {
                val jsonArray = JsonHelper.getArray(json, "enchantments")
                val var6: Iterator<*> = jsonArray.iterator()
                while (var6.hasNext()) {
                    val jsonElement = var6.next() as JsonElement
                    val string = JsonHelper.asString(jsonElement, "enchantment")
                    val enchantment = Registry.ENCHANTMENT.getOrEmpty(Identifier(string)).orElseThrow {
                        JsonSyntaxException("Unknown enchantment '$string'")
                    } as Enchantment
                    list.add(enchantment)
                }
            }
            if (json.has("mending_bias")) {
                bias = json.get("mending_bias").asFloat;
            }
            return EnchantRandomlyBiased(conditions, list, bias)
        }
    }
}