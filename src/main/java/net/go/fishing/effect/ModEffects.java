package net.go.fishing.effect;

import net.go.fishing.GoFishing;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> DARKNESS_IMMUNE = registerStatusEffect("darkness_immune",
            new DarknessImmuneEffect(StatusEffectCategory.NEUTRAL, 0xF5C827));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(GoFishing.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        GoFishing.LOGGER.info("Registering Mod Effects for +" + GoFishing.MOD_ID);
    }
}
