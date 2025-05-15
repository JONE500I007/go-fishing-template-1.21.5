package net.go.fishing.mixin;

import net.minecraft.entity.passive.WanderingTraderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WanderingTraderEntity.class)
public abstract class WanderingTraderMixin {
    // dont work for 1.21.5 for now
    @ModifyConstant(method = "fillRecipes", constant = @Constant(intValue = 5))
    private int changeTradeCount(int original) {
        return 20;
    }
}
