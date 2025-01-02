package net.pretzel.auraandkarma.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pretzel.auraandkarma.AuraKarma;

public class ModItems {
    public static final Item AERIALITE_INGOT = registerItem("aerialite_ingot", new Item(new Item.Settings()));
    public static final Item SUNPLATE_INGOT = registerItem("sunplate_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(AuraKarma.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AuraKarma.LOGGER.info("Registering Mod Items for " + AuraKarma.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AERIALITE_INGOT);
            entries.add(SUNPLATE_INGOT);
        });
    }
}
