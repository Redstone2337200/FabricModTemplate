package net.redstone233.template.mod.datagen;

import net.redstone233.template.mod.blocks.ModBlocks;
import net.redstone233.template.mod.items.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModlesProvider extends FabricModelProvider {

    public ModModlesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //throw new UnsupportedOperationException("Unimplemented method 'generateBlockStateModels'");
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_REFORGED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFORGED_BLOCK);
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //throw new UnsupportedOperationException("Unimplemented method 'generateItemModels'");
        itemModelGenerator.register(ModItems.PROSPECTOR, Models.GENERATED);

    }

}
