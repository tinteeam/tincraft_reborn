package io.github.randomusert.mods.tincraft_reborn.init;

import com.google.common.collect.ImmutableSet;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jspecify.annotations.NonNull;

import java.util.Map;

public class TCRVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, Tincraft_reborn.MODID);

    public static final DeferredRegister<VillagerProfession> PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, Tincraft_reborn.MODID);


    public static final DeferredHolder<PoiType, PoiType> CUSTOM_JOB_POI = POI_TYPES.register("custom_job_poi",
            () -> new PoiType(ImmutableSet.copyOf(TCRBlocks.TIN_UPGRADE_TRADING_STATION.get().getStateDefinition().getPossibleStates()),
                    1, 1));


    public static final DeferredHolder<VillagerProfession, VillagerProfession> CUSTOM_PROFESSION = PROFESSIONS.register("tin_upgrader",
            () -> {
                Int2ObjectMap<ResourceKey<TradeSet>> tradesMap = new Int2ObjectOpenHashMap<>();

                tradesMap.put(1, ResourceKey.create(Registries.TRADE_SET,
                        Identifier.fromNamespaceAndPath(Tincraft_reborn.MODID, "tin_upgrader/level_1")));
                tradesMap.put(2, ResourceKey.create(Registries.TRADE_SET,
                        Identifier.fromNamespaceAndPath(Tincraft_reborn.MODID, "tin_upgrader/level_2")));

                return  new VillagerProfession(
                        Component.translatable("entity.minecraft.villager.tincraft_reborn.tin_upgrader"),
                        holder -> holder.is(CUSTOM_JOB_POI.getKey()),
                        holder -> holder.is(CUSTOM_JOB_POI.getKey()),
                        ImmutableSet.of(TCRItems.TIN_INGOT.get()),
                        ImmutableSet.of(),
                        SoundEvents.VILLAGER_WORK_ARMORER,
                        tradesMap
                );
            });

    public static void register(IEventBus modEventBus) {
        POI_TYPES.register(modEventBus);
        PROFESSIONS.register(modEventBus);
    }
}
