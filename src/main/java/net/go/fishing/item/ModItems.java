package net.go.fishing.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.go.fishing.GoFishing;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_BLUE_FISH = registerItem("raw_blue_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "raw_blue_fish")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoFishing.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoFishing.LOGGER.info("Registering Mod Items for " + GoFishing.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(RAW_BLUE_FISH);

        });
    }
}
