package net.redstone233.template.mod.blocks;

import net.redstone233.template.mod.TemplateMod;
import net.redstone233.template.mod.blocks.custom.FireReforgedBlock;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
// import net.minecraft.block.Block;
// import net.minecraft.block.BlockSetType;
// import net.minecraft.block.Blocks;
// import net.minecraft.block.ButtonBlock;
// import net.minecraft.block.DoorBlock;
// import net.minecraft.block.FenceBlock;
// import net.minecraft.block.FenceGateBlock;
// import net.minecraft.block.PressurePlateBlock;
// import net.minecraft.block.SlabBlock;
// import net.minecraft.block.StairsBlock;
// import net.minecraft.block.TrapdoorBlock;
// import net.minecraft.block.WallBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block REFORGED_BLOCK = 
        registerBlocks("reforged_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block FIRE_REFORGED_BLOCK = 
        registerBlocks("fire_reforged_block", 
            new FireReforgedBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    private static Block registerBlocks(String name,Block block) {
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK, 
            new Identifier(TemplateMod.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name,Block block) {
        return Registry.register(Registries.ITEM,
            new Identifier(TemplateMod.MOD_ID, name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
