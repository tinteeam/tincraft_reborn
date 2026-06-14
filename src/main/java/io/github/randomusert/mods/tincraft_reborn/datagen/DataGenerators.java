package io.github.randomusert.mods.tincraft_reborn.datagen;


import java.util.List;
import java.util.Set;

import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Tincraft_reborn.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        //recipe data generator
        event.createProvider(TCRRecipeProvider.Runner::new);
        
        //block tag data generator
        event.createProvider(TCRBlockTagProvider::new);

        // model data generator
        event.createProvider(TCRItemModelProvider::new);

        //block loot table data generator
        event.createProvider((output, lookupProvider) -> new LootTableProvider(
        output,
        Set.of(),
        List.of(new SubProviderEntry(TCRBlockLootTableProvider::new, LootContextParamSets.BLOCK)),
        lookupProvider
    ));
        
    }
}
