package io.github.randomusert.mods.tincraft_reborn.client;

import com.mojang.logging.LogUtils;
import io.github.randomusert.mods.tincraft_reborn.Tincraft_reborn;
import io.github.randomusert.mods.tincraft_reborn.client.screens.UltraCraftingScreen;
import io.github.randomusert.mods.tincraft_reborn.init.TCRMenuTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.VillagerProfessionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
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

    @SubscribeEvent // on the mod event bus only on the physical client
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(TCRMenuTypes.ULTRA_CRAFTING_MENU.get(), UltraCraftingScreen::new);
    }
}
