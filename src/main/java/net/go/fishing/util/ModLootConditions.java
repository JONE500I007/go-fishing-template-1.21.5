package net.go.fishing.util;

import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.go.fishing.GoFishing.MOD_ID;

public class ModLootConditions {
    public static final LootConditionType ANGLER_HAS_EFFECT =
            Registry.register(Registries.LOOT_CONDITION_TYPE,
                    Identifier.of(MOD_ID, "angler_has_effect"),
                    new LootConditionType(AnglerHasEffectCondition.CODEC));

    public static void init() {
    }
}
