package com.rosiepies.colorfuleyeblossoms.client;

import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms.Blocks.*;

public class ColorfulEyeblossomsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                RED_OPEN_EYEBLOSSOM,
                PINK_OPEN_EYEBLOSSOM,
                YELLOW_OPEN_EYEBLOSSOM,
                LIME_OPEN_EYEBLOSSOM,
                GREEN_OPEN_EYEBLOSSOM,
                LIGHT_BLUE_OPEN_EYEBLOSSOM,
                CYAN_OPEN_EYEBLOSSOM,
                BLUE_OPEN_EYEBLOSSOM,
                MAGENTA_OPEN_EYEBLOSSOM,
                PURPLE_OPEN_EYEBLOSSOM,
                BROWN_OPEN_EYEBLOSSOM,
                GRAY_OPEN_EYEBLOSSOM,
                LIGHT_GRAY_OPEN_EYEBLOSSOM,
                BLACK_OPEN_EYEBLOSSOM,
                WHITE_OPEN_EYEBLOSSOM,
                POTTED_RED_OPEN_EYEBLOSSOM,
                POTTED_PINK_OPEN_EYEBLOSSOM,
                POTTED_YELLOW_OPEN_EYEBLOSSOM,
                POTTED_LIME_OPEN_EYEBLOSSOM,
                POTTED_GREEN_OPEN_EYEBLOSSOM,
                POTTED_CYAN_OPEN_EYEBLOSSOM,
                POTTED_LIGHT_BLUE_OPEN_EYEBLOSSOM,
                POTTED_BLUE_OPEN_EYEBLOSSOM,
                POTTED_MAGENTA_OPEN_EYEBLOSSOM,
                POTTED_PURPLE_OPEN_EYEBLOSSOM,
                POTTED_BROWN_OPEN_EYEBLOSSOM,
                POTTED_GRAY_OPEN_EYEBLOSSOM,
                POTTED_LIGHT_GRAY_OPEN_EYEBLOSSOM,
                POTTED_BLACK_OPEN_EYEBLOSSOM,
                POTTED_WHITE_OPEN_EYEBLOSSOM
        );
    }
}
