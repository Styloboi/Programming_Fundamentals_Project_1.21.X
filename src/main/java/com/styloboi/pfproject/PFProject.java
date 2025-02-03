package com.styloboi.pfproject;

import com.styloboi.pfproject.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PFProject implements ModInitializer {
	public static final String MOD_ID = "pfproject";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}