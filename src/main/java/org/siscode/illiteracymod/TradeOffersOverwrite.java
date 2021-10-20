package org.siscode.illiteracymod;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;

public class TradeOffersOverwrite {
    public static final Int2ObjectMap<TradeOffers.Factory[]> librarianMap = new Int2ObjectOpenHashMap(ImmutableMap.builder()
            .put(1, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.PAPER, 24, 16, 2),
                    // new TradeOffers.EnchantBookFactory(1),
                    new TradeOffers.SellItemFactory(Blocks.BOOKSHELF, 9, 1, 12, 1)})
            .put(2, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.BOOK, 4, 12, 10),
                    // new TradeOffers.EnchantBookFactory(5),
                    new TradeOffers.SellItemFactory(Items.LANTERN, 1, 1, 5)})
            .put(3, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.INK_SAC, 5, 12, 20),
                    // new TradeOffers.EnchantBookFactory(10),
                    new TradeOffers.SellItemFactory(Items.GLASS, 1, 4, 10)})
            .put(4, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.WRITABLE_BOOK, 2, 12, 30),
                    // new TradeOffers.EnchantBookFactory(15),
                    new TradeOffers.SellItemFactory(Items.CLOCK, 5, 1, 15),
                    new TradeOffers.SellItemFactory(Items.COMPASS, 4, 1, 15)})
            .put(5, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(Items.NAME_TAG, 20, 1, 30)})
            .build()
    );

    public static final Int2ObjectMap<TradeOffers.Factory[]> armorerMap = new Int2ObjectOpenHashMap<>(ImmutableMap.of(
            1, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_LEGGINGS), 7, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_BOOTS), 4, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_HELMET), 5, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_CHESTPLATE), 9, 1, 12, 1, 0.2F)},
            2, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.CHAINMAIL_BOOTS), 1, 1, 12, 5, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.CHAINMAIL_LEGGINGS), 3, 1, 12, 5, 0.2F)},
            3, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.LAVA_BUCKET, 1, 12, 20),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.CHAINMAIL_HELMET), 1, 1, 12, 10, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.CHAINMAIL_CHESTPLATE), 4, 1, 12, 10, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.SHIELD), 5, 1, 12, 10, 0.2F)},
            4, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_LEGGINGS), 14, 1, 3, 15, 0.05f),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_BOOTS), 8, 1, 3, 15, 0.05f),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_HORSE_ARMOR), 25, 1, 3, 15, 0.05f),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_HORSE_ARMOR), 35, 1, 3, 15, 0.05f)},
            5, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_HELMET), 8, 1, 3, 30, 0.05f),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_CHESTPLATE), 16, 1, 3, 30, 0.05f),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.TURTLE_HELMET), 32, 1, 3, 30, 0.05f)})
    );


    public static final Int2ObjectMap<TradeOffers.Factory[]> weaponsmithMap = new Int2ObjectOpenHashMap<>(ImmutableMap.of(
            1, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_AXE), 3, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_SWORD), 2, 1, 3, 1)},
            2, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)},
            3, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.FLINT, 24, 12, 20)},
            4, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_AXE), 12, 1, 3, 15, 0.2F)},
            5, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_SWORD), 8, 1, 3, 30, 0.2F)}
    ));


    public static final Int2ObjectMap<TradeOffers.Factory[]> toolsmithMap = new Int2ObjectOpenHashMap<>(ImmutableMap.of(
            1, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.COAL, 15, 16, 2),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.STONE_AXE), 1, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.STONE_SHOVEL), 1, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.STONE_PICKAXE), 1, 1, 12, 1, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.STONE_HOE), 1, 1, 12, 1, 0.2F)},
            2, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.IRON_INGOT, 4, 12, 10),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)},
            3, new TradeOffers.Factory[]{
                    new TradeOffers.BuyForOneEmeraldFactory(Items.FLINT, 30, 12, 20),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_AXE), 1, 1, 3, 10, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_SHOVEL), 2, 1, 3, 10, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.IRON_PICKAXE), 3, 1, 3, 10, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_HOE), 4, 1, 3, 10, 0.2F)},
            4, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_AXE), 12, 1, 3, 15, 0.2F),
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_SHOVEL), 5, 1, 3, 15, 0.2F)},
            5, new TradeOffers.Factory[]{
                    new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_PICKAXE), 13, 1, 3, 30, 0.2F)}
    ));

}
