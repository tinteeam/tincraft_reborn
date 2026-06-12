package io.github.randomusert.mods.tincraft_reborn.datagen;


import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Tincraft_reborn.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        event.createProvider(ModBlockLootTableProvider::new);
    }
}
