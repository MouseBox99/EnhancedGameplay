package net.mousebox.enhanced_gameplay.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mousebox.enhanced_gameplay.EnhancedGameplay;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENHANCED_GAMEPLAY = Registry.register(Registries.ITEM_GROUP, new Identifier(EnhancedGameplay.MOD_ID, "enhanced_gameplay"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enhanced_gameplay"))
                    .icon(() -> new ItemStack(ModItems.JADE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.JADE_SHARD);

                    }).build());

    public static void registerItemGroups() {
        EnhancedGameplay.LOGGER.info("Registering Modded Item Groups For Enhanced Gameplay");
  }
}
