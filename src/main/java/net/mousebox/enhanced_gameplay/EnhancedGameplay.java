package net.mousebox.enhanced_gameplay;

import net.fabricmc.api.ModInitializer;

import net.mousebox.enhanced_gameplay.item.ModItemGroups;
import net.mousebox.enhanced_gameplay.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancedGameplay implements ModInitializer {
	public static final String MOD_ID = "enhanced_gameplay";
    public static final Logger LOGGER = LoggerFactory.getLogger("enhanced-gameplay");

	@Override
	public void onInitialize() {
		LOGGER.info("Prepeare for Enhanced Gameplay!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}