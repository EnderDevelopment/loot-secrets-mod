package com.maximilianjanzen2.lootsecretsmod.structures;

import com.maximilianjanzen2.lootsecretsmod.LootSecretsMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

public class ModStructures {
    public static final StructureType<?> LOOT_SECRET_STRUCTURE_TYPE = () -> LOOT_SECRET_STRUCTURE;
    public static final Structure LOOT_SECRET_STRUCTURE = new Structure(LOOT_SECRET_STRUCTURE_TYPE);

    public static void register() {
        Registry.register(Registries.STRUCTURE_TYPE, new Identifier(LootSecretsMod.MOD_ID, "loot_secret_structure"), LOOT_SECRET_STRUCTURE_TYPE);
        Registry.register(Registries.STRUCTURE, new Identifier(LootSecretsMod.MOD_ID, "loot_secret_structure"), LOOT_SECRET_STRUCTURE);
    }
}