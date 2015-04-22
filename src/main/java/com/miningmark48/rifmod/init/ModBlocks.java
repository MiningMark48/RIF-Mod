package com.miningmark48.rifmod.init;

import com.miningmark48.rifmod.block.BlockRIFMod;
import com.miningmark48.rifmod.block.BlockRIFModTransparent;
import com.miningmark48.rifmod.creativetab.CreativeTabRIFMod;
import com.miningmark48.rifmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final Block obsidianFrame = new BlockRIFModTransparent(Material.iron).setBlockName("obsidianFrame").setBlockTextureName(Reference.MOD_ID + ":obsidianFrame");
    public static final Block rifDirt = new BlockRIFMod(Material.grass).setBlockName("rifDirt").setBlockTextureName(Reference.MOD_ID + ":rifDirt");
    public static final Block rifStone = new BlockRIFMod(Material.rock).setBlockName("rifStone").setBlockTextureName(Reference.MOD_ID + ":rifStone");

    public static void init(){

        GameRegistry.registerBlock(obsidianFrame, "obsidianFrame");
        GameRegistry.registerBlock(rifDirt, "rifDirt");
        GameRegistry.registerBlock(rifStone, "rifStone");
    }

}
