package org.siscode.illiteracymod.mixin;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.ForgingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AnvilScreenHandler.class)
public abstract class AnvilScreenHandler_freeRepairMixin extends ForgingScreenHandler {
    @Shadow private int repairItemUsage;

    public AnvilScreenHandler_freeRepairMixin(@Nullable ScreenHandlerType<?> screenHandlerType, int i, PlayerInventory playerInventory, ScreenHandlerContext screenHandlerContext) {
        super(screenHandlerType, i, playerInventory, screenHandlerContext);
    }

    @Inject(method = "updateResult", at=@At("RETURN"))
    public void cancelPriorWorkIfRepair(CallbackInfo ci) {
        if (this.repairItemUsage > 0) {
            int repaircost = this.input.getStack(0).getRepairCost();
            this.output.getStack(0).setRepairCost(repaircost);
        }
    }
}
