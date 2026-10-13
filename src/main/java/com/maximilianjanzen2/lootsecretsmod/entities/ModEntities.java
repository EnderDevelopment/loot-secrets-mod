package com.maximilianjanzen2.lootsecretsmod.entities;

import com.maximilianjanzen2.lootsecretsmod.LootSecretsMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MobEntity> LOOT_SECRET_MOB = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(LootSecretsMod.MOD_ID, "loot_secret_mob"),
            EntityType.Builder.create(MobEntity::new, SpawnGroup.MONSTER).build("loot_secret_mob"));

    public static void register() {
        // Registration is done in the declaration
    }
}