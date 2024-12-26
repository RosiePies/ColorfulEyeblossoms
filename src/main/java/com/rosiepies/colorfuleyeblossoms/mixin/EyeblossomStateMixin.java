package com.rosiepies.colorfuleyeblossoms.mixin;

import com.rosiepies.colorfuleyeblossoms.ColorfulEyeblossoms;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.EyeblossomBlock.EyeblossomState;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EyeblossomState.class)
public abstract class EyeblossomStateMixin {

    @Shadow @Final
    boolean open;

    @Inject(at = @At("HEAD"), method = "getBlock", cancellable = true)
    public void getBlockState(CallbackInfoReturnable<Block> cir) {
        Random random = Random.create();

        cir.setReturnValue(this.open ? randomOpenEyeblossom(random) : Blocks.CLOSED_EYEBLOSSOM);
    }

    @Unique
    private static Block randomOpenEyeblossom(Random random) {
        if (random.nextBetween(0, 100) >= 85) {
            int randomInteger = random.nextBetween(1, 15);

            switch(randomInteger)
            {
                case 1: {return ColorfulEyeblossoms.Blocks.BLACK_OPEN_EYEBLOSSOM;}
                case 2: {return ColorfulEyeblossoms.Blocks.BLUE_OPEN_EYEBLOSSOM;}
                case 3: {return ColorfulEyeblossoms.Blocks.BROWN_OPEN_EYEBLOSSOM;}
                case 4: {return ColorfulEyeblossoms.Blocks.CYAN_OPEN_EYEBLOSSOM;}
                case 5: {return ColorfulEyeblossoms.Blocks.GRAY_OPEN_EYEBLOSSOM;}
                case 6: {return ColorfulEyeblossoms.Blocks.GREEN_OPEN_EYEBLOSSOM;}
                case 7: {return ColorfulEyeblossoms.Blocks.LIGHT_BLUE_OPEN_EYEBLOSSOM;}
                case 8: {return ColorfulEyeblossoms.Blocks.LIGHT_GRAY_OPEN_EYEBLOSSOM;}
                case 9: {return ColorfulEyeblossoms.Blocks.LIME_OPEN_EYEBLOSSOM;}
                case 10: {return ColorfulEyeblossoms.Blocks.MAGENTA_OPEN_EYEBLOSSOM;}
                case 11: {return ColorfulEyeblossoms.Blocks.PINK_OPEN_EYEBLOSSOM;}
                case 12: {return ColorfulEyeblossoms.Blocks.PURPLE_OPEN_EYEBLOSSOM;}
                case 13: {return ColorfulEyeblossoms.Blocks.RED_OPEN_EYEBLOSSOM;}
                case 14: {return ColorfulEyeblossoms.Blocks.WHITE_OPEN_EYEBLOSSOM;}
                case 15: {return ColorfulEyeblossoms.Blocks.YELLOW_OPEN_EYEBLOSSOM;}
            }
        }
        return Blocks.OPEN_EYEBLOSSOM;
    }


}
