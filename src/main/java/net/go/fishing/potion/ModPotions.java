package net.go.fishing.potion;

import net.go.fishing.GoFishing;
import net.go.fishing.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    /*
    public static final RegistryEntry<Potion> DARKNESS_IMMUNE_POTION = registerPotion1("darkness_immune_potion",
            new Potion(new StatusEffectInstance(ModEffects.DARKNESS_IMMUNE, 3600, 0)));
    public static final RegistryEntry<Potion> DARKNESS_IMMUNE_POTION_L = registerPotion1("darkness_immune_potion_l",
            new Potion(new StatusEffectInstance(ModEffects.DARKNESS_IMMUNE, 9600, 0)));
     */

    public static RegistryEntry<Potion> registerPotion1(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(GoFishing.MOD_ID, name), potion);
    }

    public static void registerPotions(){
        GoFishing.LOGGER.info("Registering Mod Potions for " + GoFishing.MOD_ID);
    }
}
