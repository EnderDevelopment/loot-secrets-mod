package com.maximilianjanzen2.lootsecretsmod.items;

import com.maximilianjanzen2.lootsecretsmod.LootSecretsMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LOOT_SECRET_ITEM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(LootSecretsMod.MOD_ID, "loot_secret_item"), LOOT_SECRET_ITEM);
    }
}