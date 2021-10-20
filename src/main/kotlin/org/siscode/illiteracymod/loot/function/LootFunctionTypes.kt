package org.siscode.illiteracymod.loot.function

import net.minecraft.loot.function.LootFunction
import net.minecraft.loot.function.LootFunctionType
import net.minecraft.util.Identifier
import net.minecraft.util.JsonSerializer
import net.minecraft.util.registry.Registry

val ENCHANT_RANDOMLY_BIASED = register("illiteracy:enchant_randomly_biased", EnchantRandomlyBiased.Serializer)
val ENCHANT_WITH_LEVELS_BIASED = register("illiteracy:enchant_with_levels_biased", EnchantWithLevelsBiased.Serializer)

private fun register(id: String, jsonSerializer: JsonSerializer<out LootFunction?>): LootFunctionType {
    return Registry.register(
        Registry.LOOT_FUNCTION_TYPE,
        Identifier(id), LootFunctionType(jsonSerializer)
    )
}

/** just for the class loader, no body needed */
fun loadLootFunctionTypes() {}