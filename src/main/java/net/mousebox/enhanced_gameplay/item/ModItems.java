package net.mousebox.enhanced_gameplay.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.mousebox.enhanced_gameplay.EnhancedGameplay;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item JADE_SHARD = registerItem("jade_shard", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnhancedGameplay.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EnhancedGameplay.LOGGER.info("Registering Modded Items For Enhanced Gameplay");

    }
}
