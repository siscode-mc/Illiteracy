package org.siscode.illiteracymod.loot.function

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import net.minecraft.enchantment.Enchantment
import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.enchantment.EnchantmentLevelEntry
import net.minecraft.enchantment.Enchantments
import net.minecraft.item.EnchantedBookItem
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.loot.condition.LootCondition
import net.minecraft.loot.context.LootContext
import net.minecraft.loot.function.ConditionalLootFunction
import net.minecraft.loot.function.EnchantWithLevelsLootFunction
import net.minecraft.loot.provider.number.LootNumberProvider
import net.minecraft.util.JsonHelper

class EnchantWithLevelsBiased(
    lootConditions: Array<out LootCondition>?,
    val range: LootNumberProvider,
    val mendingBias: Float
) : ConditionalLootFunction(lootConditions) {
    override fun getType() = ENCHANT_WITH_LEVELS_BIASED

    val delegate = EnchantWithLevelsLootFunction.Builder(range).allowTreasureEnchantments().build()

    override fun process(stack: ItemStack, context: LootContext): ItemStack {
        var result: ItemStack = stack
        if (context.random.nextFloat() < mendingBias) {
            if (context.random.nextFloat() < mendingBias) result = delegate.apply(stack, context)
            if (EnchantmentHelper.getLevel(Enchantments.MENDING, result) > 0) return result
            if (stack.isOf(Items.BOOK)) {
                result = ItemStack(Items.ENCHANTED_BOOK)
                result.addEnchantment(Enchantments.MENDING, 1)
            } else {
                stack.addEnchantment(Enchantments.MENDING, 1)
                result = stack
            }
        } else {
            result = delegate.apply(stack, context)
        }
        return result
    }

    object Serializer : ConditionalLootFunction.Serializer<EnchantWithLevelsBiased>() {
        override fun toJson(json: JsonObject, lootfunc: EnchantWithLevelsBiased, context: JsonSerializationContext) {
            super.toJson(json, lootfunc, context)
            json.add("levels", context.serialize(lootfunc.range))
            json.add("mending_bias", JsonPrimitive(lootfunc.mendingBias))
        }

        override fun fromJson(
            json: JsonObject,
            context: JsonDeserializationContext,
            conditions: Array<out LootCondition>
        ): EnchantWithLevelsBiased {
            val range = JsonHelper.deserialize(json, "levels", context, LootNumberProvider::class.java)
            val bias: Float = JsonHelper.getFloat(json, "mending_bias", 0.2f)
            return EnchantWithLevelsBiased(conditions, range, bias)
        }
    }
}