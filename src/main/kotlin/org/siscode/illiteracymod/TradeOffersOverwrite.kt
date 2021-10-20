package org.siscode.illiteracymod

import net.minecraft.village.TradeOffers
import net.minecraft.village.VillagerProfession
import org.siscode.illiteracymod.TradeOffersOverwrite.*

fun overwriteTradeOffers() {
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.LIBRARIAN] = librarianMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.ARMORER] = armorerMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.WEAPONSMITH] = weaponsmithMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.TOOLSMITH] = toolsmithMap
}