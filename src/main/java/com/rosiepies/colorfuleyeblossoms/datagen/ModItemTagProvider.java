package com.rosiepies.colorfuleyeblossoms.datagen;

import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //getOrCreateTagBuilder(ItemTags.AXES).add(Items.ACACIA_BUTTON);
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ColorfulEyeblossoms.Items.BLACK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.BROWN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.CYAN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.GREEN_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.LIGHT_BLUE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.LIGHT_GRAY_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.LIME_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.MAGENTA_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.PINK_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.PURPLE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.RED_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.WHITE_OPEN_EYEBLOSSOM)
                .add(ColorfulEyeblossoms.Items.YELLOW_OPEN_EYEBLOSSOM);
    }
}
