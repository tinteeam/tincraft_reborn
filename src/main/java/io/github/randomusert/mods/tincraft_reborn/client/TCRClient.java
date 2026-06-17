package io.github.randomusert.mods.tincraft_reborn.client;

import com.mojang.logging.LogUtils;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.VillagerProfessionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@EventBusSubscriber(modid = Tincraft_reborn.MODID, value = Dist.CLIENT)
public class TCRClient {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        LOGGER.info("HELLO FROM CLIENT SETUP");
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
