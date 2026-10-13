package com.maximilianjanzen2.lootsecretsmod.blocks;

import com.maximilianjanzen2.lootsecretsmod.LootSecretsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LOOT_SECRET_BLOCK = new Block(Block.Settings.copy(Blocks.STONE));

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(LootSecretsMod.MOD_ID, "loot_secret_block"), LOOT_SECRET_BLOCK);
    }
}