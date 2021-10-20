package org.siscode.illiteracymod.mixin;

import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(AnvilBlock.class)
public class AnvilBlock_nobreakMixin {

    @Overwrite
    public static @Nullable BlockState getLandingState(BlockState fallingState) {
        return fallingState;
    }
}
