package net.pretzel.auraandkarma;

import net.fabricmc.api.ModInitializer;

import net.pretzel.auraandkarma.block.ModBlocks;
import net.pretzel.auraandkarma.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuraKarma implements ModInitializer {
	public static final String MOD_ID = "auraandkarma";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}