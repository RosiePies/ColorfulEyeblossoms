package com.rosiepies.colorfuleyeblossoms;

import com.rosiepies.colorfuleyeblossoms.datagen.ModBlockTagProvider;
import com.rosiepies.colorfuleyeblossoms.datagen.ModItemTagProvider;
import com.rosiepies.colorfuleyeblossoms.datagen.ModLootTableProvider;
import com.rosiepies.colorfuleyeblossoms.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ColorfulEyeblossomsDataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
