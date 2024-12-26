package com.rosiepies.colorfuleyeblossoms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                offerSingleOutputShapelessRecipe(Items.BLACK_DYE, Blocks.BLACK_OPEN_EYEBLOSSOM, "black_dye");
                offerSingleOutputShapelessRecipe(Items.BLUE_DYE, Blocks.BLUE_OPEN_EYEBLOSSOM, "blue_dye");
                offerSingleOutputShapelessRecipe(Items.BROWN_DYE, Blocks.BROWN_OPEN_EYEBLOSSOM, "brown_dye");
                offerSingleOutputShapelessRecipe(Items.CYAN_DYE, Blocks.CYAN_OPEN_EYEBLOSSOM, "cyan_dye");
                offerSingleOutputShapelessRecipe(Items.GRAY_DYE, Blocks.GRAY_OPEN_EYEBLOSSOM, "gray_dye");
                offerSingleOutputShapelessRecipe(Items.GREEN_DYE, Blocks.GREEN_OPEN_EYEBLOSSOM, "green_dye");
                offerSingleOutputShapelessRecipe(Items.LIGHT_BLUE_DYE, Blocks.LIGHT_BLUE_OPEN_EYEBLOSSOM, "light_blue_dye");
                offerSingleOutputShapelessRecipe(Items.LIGHT_GRAY_DYE, Blocks.LIGHT_GRAY_OPEN_EYEBLOSSOM, "light_gray_dye");
                offerSingleOutputShapelessRecipe(Items.LIME_DYE, Blocks.LIME_OPEN_EYEBLOSSOM, "lime_dye");
                offerSingleOutputShapelessRecipe(Items.MAGENTA_DYE, Blocks.MAGENTA_OPEN_EYEBLOSSOM, "magenta_dye");
                offerSingleOutputShapelessRecipe(Items.PINK_DYE, Blocks.PINK_OPEN_EYEBLOSSOM, "pink_dye");
                offerSingleOutputShapelessRecipe(Items.PURPLE_DYE, Blocks.PURPLE_OPEN_EYEBLOSSOM, "purple_dye");
                offerSingleOutputShapelessRecipe(Items.RED_DYE, Blocks.RED_OPEN_EYEBLOSSOM, "red_dye");
                offerSingleOutputShapelessRecipe(Items.WHITE_DYE, Blocks.WHITE_OPEN_EYEBLOSSOM, "white_dye");
                offerSingleOutputShapelessRecipe(Items.YELLOW_DYE, Blocks.YELLOW_OPEN_EYEBLOSSOM, "yellow_dye");
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
