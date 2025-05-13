package net.go.fishing.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.go.fishing.GoFishing;
import net.go.fishing.item.custom.TheFishingRod;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FISHING_COIN = registerItem("fishing_coin",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "fishing_coin")))
                    .maxCount(2000)));
    public static final Item RAW_BLUE_FISH = registerItem("raw_blue_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "raw_blue_fish")))));
    public static final Item COOKED_BLUE_FISH = registerItem("cooked_blue_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "cooked_blue_fish")))));
    public static final Item RAW_GREEDILY_FISH = registerItem("raw_greedily_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "raw_greedily_fish")))));
    public static final Item BLACK_CARD_FISH = registerItem("black_card_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "black_card_fish")))));
    public static final Item BURNED_BLACK_CARD_FISH = registerItem("burned_black_card_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "burned_black_card_fish")))));
    public static final Item RED_CARD_FISH = registerItem("red_card_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "red_card_fish")))));
    public static final Item BURNED_RED_CARD_FISH = registerItem("burned_red_card_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "burned_red_card_fish")))));

    public static final Item BAMBOO_FISHING_ROD = registerItem("bamboo_fishing_rod",
            new TheFishingRod(new Item.Settings()
                    .enchantable(3)
                    .maxDamage(64)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "bamboo_fishing_rod")))));

    public static final Item PEARL = registerItem("pearl",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "pearl")))));
    public static final Item PEARL_2 = registerItem("pearl_2",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "pearl_2")))));

    public static final Item PEARL_3 = registerItem("pearl_3",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, "pearl_3")))
                    .attributeModifiers(AttributeModifiersComponent.builder()
                    .add(EntityAttributes.LUCK,
                            new EntityAttributeModifier(Identifier.of(GoFishing.MOD_ID), 10,
                                    EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoFishing.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoFishing.LOGGER.info("Registering Mod Items for " + GoFishing.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(FISHING_COIN);
            entries.add(RAW_BLUE_FISH);
            entries.add(COOKED_BLUE_FISH);
            entries.add(RAW_GREEDILY_FISH);
            entries.add(BLACK_CARD_FISH);
            entries.add(BURNED_BLACK_CARD_FISH);
            entries.add(RED_CARD_FISH);
            entries.add(BURNED_RED_CARD_FISH);
        });
    }
}
