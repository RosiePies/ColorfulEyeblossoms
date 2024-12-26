package com.rosiepies.colorfuleyeblossoms.datagen;

import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //addDrop(Blocks.BAMBOO_BLOCK);
        addDrop(ColorfulEyeblossoms.Blocks.BLACK_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.BLUE_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.BROWN_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.CYAN_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.GRAY_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.GREEN_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.LIGHT_BLUE_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.LIGHT_GRAY_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.LIME_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.MAGENTA_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.PINK_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.PURPLE_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.RED_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.WHITE_OPEN_EYEBLOSSOM);
        addDrop(ColorfulEyeblossoms.Blocks.YELLOW_OPEN_EYEBLOSSOM);

        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_BLACK_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_BLUE_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_BROWN_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_CYAN_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_GRAY_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_GREEN_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_LIGHT_BLUE_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_LIGHT_GRAY_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_LIME_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_MAGENTA_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_PINK_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_PURPLE_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_RED_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_WHITE_OPEN_EYEBLOSSOM);
        addPottedPlantDrops(ColorfulEyeblossoms.Blocks.POTTED_YELLOW_OPEN_EYEBLOSSOM);
    }
}
