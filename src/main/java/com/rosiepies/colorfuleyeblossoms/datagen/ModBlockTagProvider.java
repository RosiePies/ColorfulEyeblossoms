package com.rosiepies.colorfuleyeblossoms.datagen;

import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(Blocks.GLASS);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ColorfulEyeblossoms.Blocks.BLACK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.BROWN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.CYAN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.GREEN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.LIGHT_BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.LIGHT_GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.LIME_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.MAGENTA_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.PINK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.PURPLE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.RED_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.WHITE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.YELLOW_OPEN_EYEBLOSSOM);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ColorfulEyeblossoms.Blocks.POTTED_BLACK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_BROWN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_CYAN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_GREEN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_LIGHT_BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_LIGHT_GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_LIME_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_MAGENTA_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_PINK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_PURPLE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_RED_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_WHITE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Blocks.POTTED_YELLOW_OPEN_EYEBLOSSOM);
    }
}
