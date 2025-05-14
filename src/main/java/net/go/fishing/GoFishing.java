package net.go.fishing;

import net.fabricmc.api.ModInitializer;

import net.go.fishing.block.ModBlocks;
import net.go.fishing.item.ModItemGroups;
import net.go.fishing.item.ModItems;
import net.go.fishing.util.ModCustomTrades;
import net.go.fishing.util.ModTags2;
import net.go.fishing.villager.ModVillagers;
import net.go.fishing.villager.ModVillagers2;
import net.go.fishing.villager.ModVillagers3;
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

		//ModVillagers2.registerVillagers();

		LOGGER.info("Hello Fabric world!");

	}
}