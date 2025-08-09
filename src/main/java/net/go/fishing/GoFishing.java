package net.go.fishing;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.go.fishing.block.ModBlocks;
import net.go.fishing.effect.ModEffects;
import net.go.fishing.item.ModItemGroups;
import net.go.fishing.item.ModItems;
import net.go.fishing.util.*;
import net.go.fishing.villager.ModVillagers;
import net.go.fishing.villager.ModVillagers2;
import net.go.fishing.villager.ModVillagers3;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoFishing implements ModInitializer {
	public static final String MOD_ID = "go-fishing";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		//ModVillagers3.registerVillagers();
		ModCustomTrades.registerCustomTrades();
		//ModCustomTrades2.registerCustomTrades();
		//ModCustomTrades3.registerCustomTrades();
		ModCustomTrades4.registerCustomTrades();

		ModEffects.registerEffects();

		//ModVillagers2.registerVillagers();

		/*
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD,ModItems.BLACK_CARD_FISH, ModEffects.DARKNESS_IMMUNE);
		});
		 */

		LOGGER.info("Hello Fabric world!");

	}
}