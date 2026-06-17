package io.github.randomusert.mods.tincraft_reborn;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import io.github.randomusert.mods.tincraft_reborn.init.*;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Tincraft_reborn.MODID)
public class Tincraft_reborn {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "tincraft_reborn";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    private static final Registrate REGISTRATE = Registrate.create(MODID)
            .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public Tincraft_reborn(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        TCRBlocks.register(modEventBus);

        TCRItems.register(modEventBus);
        TCRBlockEntities.register();

        TCRCreativeModeTabs.register(modEventBus);
        TCRVillagers.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    public static Registrate registrate() {
        return REGISTRATE;
    }

}
