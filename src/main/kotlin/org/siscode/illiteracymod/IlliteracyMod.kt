package org.siscode.illiteracymod;

import net.fabricmc.api.ModInitializer
import org.siscode.illiteracymod.loot.function.loadLootFunctionTypes

object IlliteracyMod : ModInitializer {
    override fun onInitialize() {
        overwriteTradeOffers()
        loadLootFunctionTypes()
    }
}
