package net.go.fishing.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.go.fishing.GoFishing;
import net.go.fishing.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;

public class ModCustomTrades3 {
    //not yet used but if you want to use just register in GoFishing.java
    public static void registerCustomTrades() {
        GoFishing.LOGGER.info("Registering Villager Trades From " + GoFishing.MOD_ID);

        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.pool(Identifier.of(GoFishing.MOD_ID, "custom_trades3"),2,
                    new TradeOffers.Factory() {
                        public TradeOffer create(Entity entity, Random random) {
                            return new TradeOffer(
                                    new TradedItem(ModItems.FISHING_COIN, 50),
                                    new ItemStack(ModItems.BAMBOO_FISHING_ROD, 1),
                                    10, 2, 0.2f
                            );
                        }
                    },
                    new TradeOffers.Factory() {
                        public TradeOffer create(Entity entity, Random random) {
                            return new TradeOffer(
                                    new TradedItem(ModItems.FISHING_COIN, 50),
                                    new ItemStack(ModItems.PEARL, 1),
                                    10, 2, 0.2f
                            );
                        }
                    },
                    new TradeOffers.Factory() {
                        public TradeOffer create(Entity entity, Random random) {
                            return new TradeOffer(
                                    new TradedItem(ModItems.FISHING_COIN, 50),
                                    new ItemStack(ModItems.RAW_GREEDILY_FISH, 1),
                                    10, 2, 0.2f
                            );
                        }
                    }
            );
        });
    }
}
