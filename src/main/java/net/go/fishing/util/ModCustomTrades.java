package net.go.fishing.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.go.fishing.GoFishing;
import net.go.fishing.item.ModItems;
import net.go.fishing.villager.ModVillagers;
import net.go.fishing.villager.ModVillagers3;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        GoFishing.LOGGER.info("Registering Villager Trades From " + GoFishing.MOD_ID);

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Items.WHEAT, 10),
                    10, 2, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 9),
                    new ItemStack(Items.EMERALD, 2),
                    16, 20, 0.05f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FISHING_MASTER_KEY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Items.COAL_BLOCK, 10),
                    10, 2, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 9),
                    new ItemStack(Items.DIAMOND, 2),
                    16, 20, 0.05f
            ));
        });
    }
}
