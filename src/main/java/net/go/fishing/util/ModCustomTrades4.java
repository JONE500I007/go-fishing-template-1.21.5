package net.go.fishing.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.go.fishing.GoFishing;
import net.go.fishing.item.ModItems;
import net.go.fishing.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades4 {
    public static void registerCustomTrades() {
        GoFishing.LOGGER.info("Registering Villager Trades From " + GoFishing.MOD_ID);

        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(TradeOfferHelper.WanderingTraderOffersBuilder.BUY_ITEMS_POOL,
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.FISHING_COIN, 99),
                            new ItemStack(ModItems.BAMBOO_FISHING_ROD, 1),
                            10, 2, 0.2f
                    ),
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.RED_CARD_FISH, 1),
                            new ItemStack(ModItems.FISHING_COIN, 99),
                            16, 20, 0.05f
                    ),
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.BLACK_CARD_FISH, 1),
                            new ItemStack(ModItems.FISHING_COIN, 99),
                            16, 20, 0.05f
                    )
            );
        });

        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(TradeOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL,
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.FISHING_COIN, 99),
                            new ItemStack(Items.DIAMOND_BLOCK, 1),
                            10, 2, 0.2f
                    ),
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.RAW_GREEDILY_FISH, 1),
                            new ItemStack(ModItems.FISHING_COIN, 99),
                            16, 20, 0.05f
                    ),
                    (entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.BURNED_BLACK_CARD_FISH, 1),
                            new ItemStack(ModItems.FISHING_COIN, 99),
                            16, 20, 0.05f
                    )
            );
        });
    }
}
