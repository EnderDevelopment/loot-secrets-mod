package com.maximilianjanzen2.lootsecretsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LootSecretsMod implements ModInitializer {
    public static final String MOD_ID = "lootsecretsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("LootSecretsMod has been initialized!");
    }
}