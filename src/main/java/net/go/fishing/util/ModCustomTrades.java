package net.go.fishing.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.go.fishing.GoFishing;
import net.go.fishing.item.ModItems;
import net.go.fishing.villager.ModVillagers;
import net.go.fishing.villager.ModVillagers3;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
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
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 7),
                    new ItemStack(Items.DIAMOND, 1),
                    16, 20, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.GOLD_INGOT, 5),
                    new ItemStack(ModItems.COOKED_BLUE_FISH, 1),
                    10, 15, 0.1f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FISHING_MASTER_KEY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Items.WHEAT, 10),
                    10, 2, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 1500),
                    new ItemStack(Items.EMERALD, 2),
                    16, 20, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 7),
                    new ItemStack(Items.DIAMOND, 1),
                    16, 20, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.GOLD_INGOT, 5),
                    new ItemStack(ModItems.COOKED_BLUE_FISH, 1),
                    10, 15, 0.1f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FISHING_MASTER_KEY, 2, factories -> {
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
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.FISHING_COIN, 7),
                    new ItemStack(Items.DIAMOND, 1),
                    16, 20, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.GOLD_INGOT, 5),
                    new ItemStack(ModItems.FISHING_COIN, 1),
                    10, 15, 0.1f
            ));
        });
        /*
        TradeOfferHelper.registerWanderingTraderOffers(factories ->{
            factories.addAll(TradeOfferHelper.WanderingTraderOffersBuilder.BUY_ITEMS_POOL,
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.FISHING_COIN, 64),
                            new ItemStack(Items.BEDROCK, 1),10,2,0.2f
                    ));
        });

         */

        /*
        TradeOfferHelper.registerWanderingTraderOffers(builder -> {
            builder.addAll(Identifier.of(GoFishing.MOD_ID, "custom_trades"), new TradeOffers.Factory() {
                @Override
                public TradeOffer create(Entity entity, Random random) {
                    return new TradeOffer(
                            new TradedItem(ModItems.FISHING_COIN, 200),
                            new ItemStack(ModItems.BAMBOO_FISHING_ROD, 1),
                            10, 2, 0.2f
                    );
                }
            });
        });
         */
    }
}
