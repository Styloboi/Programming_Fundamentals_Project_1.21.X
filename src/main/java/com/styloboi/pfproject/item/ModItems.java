package com.styloboi.pfproject.item;

import com.styloboi.pfproject.PFProject;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SQUID_CARD = registerItem("squid_card", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PFProject.MOD_ID, name), item);
    }
    public static void registerModItems(){
        PFProject.LOGGER.info("Registering Mod Items for " + PFProject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(SQUID_CARD);
        });
    }
}
