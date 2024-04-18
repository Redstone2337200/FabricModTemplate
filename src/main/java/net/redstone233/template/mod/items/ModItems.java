package net.redstone233.template.mod.items;

import net.redstone233.template.mod.TemplateMod;
import net.redstone233.template.mod.items.custom.Prospectetor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PROSPECTOR = registerItems("prospector", 
        new Prospectetor(new FabricItemSettings().maxDamage(1000)));

    private static Item registerItems(String name,Item item) {
        return Registry.register(Registries.ITEM,
            new Identifier(TemplateMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
