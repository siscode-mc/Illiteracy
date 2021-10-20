package org.siscode.illiteracymod

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import net.minecraft.block.Blocks
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.village.TradeOffers
import net.minecraft.village.VillagerProfession


fun <T> int2ObjectMapOf(vararg pairs: Pair<Int, T>) = Int2ObjectOpenHashMap(mapOf(*pairs))

val librarianMap = int2ObjectMapOf(
    1 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.PAPER, 24, 16, 2),
        // TradeOffers.EnchantBookFactory(1),
        TradeOffers.SellItemFactory(Blocks.BOOKSHELF, 9, 1, 12, 1)
    ),
    2 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.BOOK, 4, 12, 10),
        // TradeOffers.EnchantBookFactory(5),
        TradeOffers.SellItemFactory(Items.LANTERN, 1, 1, 5)
    ),
    3 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.INK_SAC, 5, 12, 20),
        // TradeOffers.EnchantBookFactory(10),
        TradeOffers.SellItemFactory(Items.GLASS, 1, 4, 10)
    ),
    4 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.WRITABLE_BOOK, 2, 12, 30),
        // TradeOffers.EnchantBookFactory(15),
        TradeOffers.SellItemFactory(Items.CLOCK, 5, 1, 15),
        TradeOffers.SellItemFactory(Items.COMPASS, 4, 1, 15)
    ),
    5 to arrayOf(
        TradeOffers.SellItemFactory(Items.NAME_TAG, 20, 1, 30)
    )
)

val armorerMap = int2ObjectMapOf(
    1 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_LEGGINGS), 7, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_BOOTS), 4, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_HELMET), 5, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_CHESTPLATE), 9, 1, 12, 1, 0.2F)
    ),
    2 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
        TradeOffers.SellItemFactory(ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.CHAINMAIL_BOOTS), 1, 1, 12, 5, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.CHAINMAIL_LEGGINGS), 3, 1, 12, 5, 0.2F)
    ),
    3 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.LAVA_BUCKET, 1, 12, 20),
        TradeOffers.SellItemFactory(ItemStack(Items.CHAINMAIL_HELMET), 1, 1, 12, 10, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.CHAINMAIL_CHESTPLATE), 4, 1, 12, 10, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.SHIELD), 5, 1, 12, 10, 0.2F)
    ),
    4 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_LEGGINGS), 14, 1, 3, 15, 0.05f),
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_BOOTS), 8, 1, 3, 15, 0.05f),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_HORSE_ARMOR), 25, 1, 3, 15, 0.05f),
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_HORSE_ARMOR), 35, 1, 3, 15, 0.05f)
    ),
    5 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_HELMET), 8, 1, 3, 30, 0.05f),
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_CHESTPLATE), 16, 1, 3, 30, 0.05f),
        TradeOffers.SellItemFactory(ItemStack(Items.TURTLE_HELMET), 32, 1, 3, 30, 0.05f)
    )
)


val weaponsmithMap = int2ObjectMapOf(
    1 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_AXE), 3, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_SWORD), 2, 1, 3, 1)
    ),
    2 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
        TradeOffers.SellItemFactory(ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)
    ),
    3 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.FLINT, 24, 12, 20)
    ),
    4 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_AXE), 12, 1, 3, 15, 0.2F)
    ),
    5 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_SWORD), 8, 1, 3, 30, 0.2F)
    )
)


val toolsmithMap = int2ObjectMapOf(
    1 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
        TradeOffers.SellItemFactory(ItemStack(Items.STONE_AXE), 1, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.STONE_SHOVEL), 1, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.STONE_PICKAXE), 1, 1, 12, 1, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.STONE_HOE), 1, 1, 12, 1, 0.2F)
    ),
    2 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
        TradeOffers.SellItemFactory(ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)
    ),
    3 to arrayOf(
        TradeOffers.BuyForOneEmeraldFactory(Items.FLINT, 30, 12, 20),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_AXE), 1, 1, 3, 10, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_SHOVEL), 2, 1, 3, 10, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.IRON_PICKAXE), 3, 1, 3, 10, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_HOE), 4, 1, 3, 10, 0.2F)
    ),
    4 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_AXE), 12, 1, 3, 15, 0.2F),
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_SHOVEL), 5, 1, 3, 15, 0.2F)
    ),
    5 to arrayOf(
        TradeOffers.SellItemFactory(ItemStack(Items.GOLDEN_PICKAXE), 13, 1, 3, 30, 0.2F)
    )
)

fun overwriteTradeOffers() {
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.LIBRARIAN] = librarianMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.ARMORER] = armorerMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.WEAPONSMITH] = weaponsmithMap
    TradeOffers.PROFESSION_TO_LEVELED_TRADE[VillagerProfession.TOOLSMITH] = toolsmithMap
}