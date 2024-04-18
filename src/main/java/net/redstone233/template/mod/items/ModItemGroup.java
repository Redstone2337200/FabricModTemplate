package net.redstone233.template.mod.items;

import net.redstone233.template.mod.TemplateMod;
import net.redstone233.template.mod.items.ModItems;
import net.redstone233.template.mod.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    @SuppressWarnings("unused")
    private static final ItemGroup ITEM_GROUP = 
        Registry.register(Registries.ITEM_GROUP, 
        new Identifier(TemplateMod.MOD_ID, "trsm_group"), 
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.PROSPECTOR))
                .displayName(Text.translatable("itemGroup.tlm_group"))
                .entries((context, entries) -> {
                    entries.add(ModBlocks.REFORGED_BLOCK);
                    entries.add(ModBlocks.FIRE_REFORGED_BLOCK);
                    entries.add(ModItems.PROSPECTOR);
                    
                })
                .build());

    public static void registerModItemGroup() {
        
    }
}

// C:\Users\Redstone\.gradle\wrapper\dists\gradle-8.6-bin\afr5mpiioh2wthjmwnkmdsd5w\gradle-8.6
