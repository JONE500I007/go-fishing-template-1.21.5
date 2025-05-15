package net.go.fishing.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.go.fishing.villager.ModVillagers;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin {
    @ModifyConstant(method = "fillRecipes", constant = @Constant(intValue = 2))
    private int changeTradeCount(int original, @Local VillagerData villagerData) {
        /*
        if (villagerData.profession().matchesKey(VillagerProfession.FARMER) && villagerData.level() == 1) {
            return Integer.MAX_VALUE;
        }
         */
        if (villagerData.profession().matchesKey(ModVillagers.FISHING_MASTER_KEY) && villagerData.level() == 1) {
            return Integer.MAX_VALUE;
        }
        return original;
    }
}
