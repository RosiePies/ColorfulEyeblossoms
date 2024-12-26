package com.rosiepies.colorfuleyeblossoms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorfulEyeblossoms implements ModInitializer {
    public static final String MOD_ID = "colorful_eyeblossoms";
    private static final Logger LOGGER = LoggerFactory.getLogger(ColorfulEyeblossoms.MOD_ID);
    public static Logger getLogger() {
        return LOGGER;
    }

    public static RegistryKey<Item> getItemRegistryKey(String path) {
        return RegistryKey.of(RegistryKeys.ITEM, id(path));
    }

    public static RegistryKey<Block> getBlockRegistryKey(String path) {
        return RegistryKey.of(RegistryKeys.BLOCK, id(path));
    }

    public static Identifier id(String path) {
        return Identifier.of(ColorfulEyeblossoms.MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        Blocks.init();
        Items.init();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.BLACK_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.BLUE_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.BROWN_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.CYAN_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.GRAY_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.GREEN_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.LIGHT_BLUE_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.LIGHT_GRAY_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.LIME_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addBefore(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.MAGENTA_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addAfter(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.PINK_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addAfter(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.PURPLE_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addAfter(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.RED_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addAfter(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.WHITE_OPEN_EYEBLOSSOM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.addAfter(net.minecraft.item.Items.OPEN_EYEBLOSSOM, Items.YELLOW_OPEN_EYEBLOSSOM));
    }

    public static class Blocks {
        public static Block registerEyeBlossom(String path) {
            RegistryKey<Block> keyBlock = getBlockRegistryKey(path);
            RegistryKey<Block> keyBlockPotted = getBlockRegistryKey("potted_" + path);

            RegistryKey<Item> keyItem = getItemRegistryKey(path);


            Block BLOCK = Registry.register(Registries.BLOCK, keyBlock, new EyeblossomBlock(true, AbstractBlock.Settings.create().mapColor(net.minecraft.block.Blocks.PALE_OAK_LEAVES.getDefaultMapColor()).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY).ticksRandomly()
                    .registryKey(keyBlock)));
            Block BLOCK_POTTED = Registry.register(Registries.BLOCK, keyBlockPotted, new FlowerPotBlock(BLOCK, net.minecraft.block.Blocks.createFlowerPotSettings().ticksRandomly()
                    .registryKey(keyBlockPotted)));
            Item ITEM = Registry.register(Registries.ITEM, keyItem, new BlockItem(BLOCK, new Item.Settings().useBlockPrefixedTranslationKey()
                    .registryKey(keyItem)));

            return BLOCK;
        }

        public static final Block RED_OPEN_EYEBLOSSOM = registerEyeBlossom("red_open_eyeblossom");
        public static final Block PINK_OPEN_EYEBLOSSOM = registerEyeBlossom("pink_open_eyeblossom");
        public static final Block YELLOW_OPEN_EYEBLOSSOM = registerEyeBlossom("yellow_open_eyeblossom");
        public static final Block LIME_OPEN_EYEBLOSSOM = registerEyeBlossom("lime_open_eyeblossom");
        public static final Block GREEN_OPEN_EYEBLOSSOM = registerEyeBlossom("green_open_eyeblossom");
        public static final Block LIGHT_BLUE_OPEN_EYEBLOSSOM = registerEyeBlossom("light_blue_open_eyeblossom");
        public static final Block CYAN_OPEN_EYEBLOSSOM = registerEyeBlossom("cyan_open_eyeblossom");
        public static final Block BLUE_OPEN_EYEBLOSSOM = registerEyeBlossom("blue_open_eyeblossom");
        public static final Block MAGENTA_OPEN_EYEBLOSSOM = registerEyeBlossom("magenta_open_eyeblossom");
        public static final Block PURPLE_OPEN_EYEBLOSSOM = registerEyeBlossom("purple_open_eyeblossom");
        public static final Block BROWN_OPEN_EYEBLOSSOM = registerEyeBlossom("brown_open_eyeblossom");
        public static final Block GRAY_OPEN_EYEBLOSSOM = registerEyeBlossom("gray_open_eyeblossom");
        public static final Block LIGHT_GRAY_OPEN_EYEBLOSSOM = registerEyeBlossom("light_gray_open_eyeblossom");
        public static final Block BLACK_OPEN_EYEBLOSSOM = registerEyeBlossom("black_open_eyeblossom");
        public static final Block WHITE_OPEN_EYEBLOSSOM = registerEyeBlossom("white_open_eyeblossom");

        public static final Block POTTED_RED_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_red_open_eyeblossom"));
        public static final Block POTTED_PINK_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_pink_open_eyeblossom"));
        public static final Block POTTED_YELLOW_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_yellow_open_eyeblossom"));
        public static final Block POTTED_LIME_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_lime_open_eyeblossom"));
        public static final Block POTTED_GREEN_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_green_open_eyeblossom"));
        public static final Block POTTED_CYAN_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_cyan_open_eyeblossom"));
        public static final Block POTTED_LIGHT_BLUE_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_light_blue_open_eyeblossom"));
        public static final Block POTTED_BLUE_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_blue_open_eyeblossom"));
        public static final Block POTTED_MAGENTA_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_magenta_open_eyeblossom"));
        public static final Block POTTED_PURPLE_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_purple_open_eyeblossom"));
        public static final Block POTTED_BROWN_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_brown_open_eyeblossom"));
        public static final Block POTTED_GRAY_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_gray_open_eyeblossom"));
        public static final Block POTTED_LIGHT_GRAY_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_light_gray_open_eyeblossom"));
        public static final Block POTTED_BLACK_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_black_open_eyeblossom"));
        public static final Block POTTED_WHITE_OPEN_EYEBLOSSOM = Registries.BLOCK.get(id("potted_white_open_eyeblossom"));

        public static void init() {
        }
    }

    public static class Items {
        public static final Item RED_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("red_open_eyeblossom"));
        public static final Item PINK_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("pink_open_eyeblossom"));
        public static final Item YELLOW_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("yellow_open_eyeblossom"));
        public static final Item LIME_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("lime_open_eyeblossom"));
        public static final Item GREEN_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("green_open_eyeblossom"));
        public static final Item LIGHT_BLUE_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("light_blue_open_eyeblossom"));
        public static final Item CYAN_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("cyan_open_eyeblossom"));
        public static final Item BLUE_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("blue_open_eyeblossom"));
        public static final Item MAGENTA_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("magenta_open_eyeblossom"));
        public static final Item PURPLE_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("purple_open_eyeblossom"));
        public static final Item BROWN_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("brown_open_eyeblossom"));
        public static final Item GRAY_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("gray_open_eyeblossom"));
        public static final Item LIGHT_GRAY_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("light_gray_open_eyeblossom"));
        public static final Item BLACK_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("black_open_eyeblossom"));
        public static final Item WHITE_OPEN_EYEBLOSSOM = Registries.ITEM.get(id("white_open_eyeblossom"));

        public static void init() {

        }
    }
}
