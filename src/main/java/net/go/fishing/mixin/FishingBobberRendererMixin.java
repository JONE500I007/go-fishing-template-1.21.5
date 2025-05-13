package net.go.fishing.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.go.fishing.item.ModItems;
import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FishingBobberEntityRenderer.class)
public abstract class FishingBobberRendererMixin {
    @ModifyExpressionValue(
            method = "getArmHoldingRod",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;getMainHandStack()Lnet/minecraft/item/ItemStack;")
    )
    private static ItemStack addCustomFishingRodToFishingRodCheck(ItemStack original) {
        if (original.isOf(ModItems.BAMBOO_FISHING_ROD)) {
            return new ItemStack(Items.FISHING_ROD);
        }
        return original;
    }
}