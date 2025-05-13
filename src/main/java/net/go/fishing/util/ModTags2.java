package net.go.fishing.util;

import net.go.fishing.GoFishing;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags2 {
    public static class Blocks {


        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(GoFishing.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOD_FISH_ITEMS = createTag("mod_fish_items");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(GoFishing.MOD_ID, name));
        }
    }
    /*

    public static class PointOfInterestType {
        public static final TagKey<net.minecraft.world.poi.PointOfInterestType> ACQUIRABLE_JOB_SITE = createTag("acquirable_job_site");

        public static TagKey<net.minecraft.world.poi.PointOfInterestType> createTag(String name) {
            return TagKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(GoFishing.MOD_ID, name));
        }
    }
     */
}
