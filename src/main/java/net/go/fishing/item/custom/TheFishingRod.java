package net.go.fishing.item.custom;

import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

public class TheFishingRod extends FishingRodItem {
    public TheFishingRod(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        return super.finishUsing(stack, world, user);
    }

    @Override
    public ItemStack getDefaultStack() {
        return super.getDefaultStack();
    }

    @Override
    public boolean canBeEnchantedWith(ItemStack stack, RegistryEntry<Enchantment> enchantment, EnchantingContext context) {
        return enchantment.matchesKey(Enchantments.LUCK_OF_THE_SEA)
                || enchantment.matchesKey(Enchantments.LURE)
                || enchantment.matchesKey(Enchantments.MENDING)
                || enchantment.matchesKey(Enchantments.UNBREAKING)
                || enchantment.matchesKey(Enchantments.VANISHING_CURSE);
    }
}