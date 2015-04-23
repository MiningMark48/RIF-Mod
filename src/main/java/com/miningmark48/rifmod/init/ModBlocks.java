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
    public static final Block rifBookshelf = new BlockRIFMod(Material.wood).setBlockName("rifBookshelf").setBlockTextureName(Reference.MOD_ID + ":rifBookshelf");
    public static final Block rifBrick = new BlockRIFMod(Material.rock).setBlockName("rifBrick").setBlockTextureName(Reference.MOD_ID + ":rifBrick");
    public static final Block rifClay = new BlockRIFMod(Material.grass).setBlockName("rifClay").setBlockTextureName(Reference.MOD_ID + ":rifClay");
    public static final Block rifCoalBlock = new BlockRIFMod(Material.rock).setBlockName("rifCoalBlock").setBlockTextureName(Reference.MOD_ID + ":rifCoalBlock");
    public static final Block rifCoalOre = new BlockRIFMod(Material.rock).setBlockName("rifCoalOre").setBlockTextureName(Reference.MOD_ID + ":rifCoalOre");
    public static final Block rifCobblestone = new BlockRIFMod(Material.rock).setBlockName("rifCobblestone").setBlockTextureName(Reference.MOD_ID + ":rifCobblestone");
    public static final Block rifDiamondBlock = new BlockRIFMod(Material.rock).setBlockName("rifDiamondBlock").setBlockTextureName(Reference.MOD_ID + ":rifDiamondBlock");
    public static final Block rifDiamondOre = new BlockRIFMod(Material.rock).setBlockName("rifDiamondOre").setBlockTextureName(Reference.MOD_ID + ":rifDiamondOre");
    public static final Block rifEmeraldBlock = new BlockRIFMod(Material.rock).setBlockName("rifEmeraldBlock").setBlockTextureName(Reference.MOD_ID + ":rifEmeraldBlock");
    public static final Block rifEmeraldOre = new BlockRIFMod(Material.rock).setBlockName("rifEmeraldOre").setBlockTextureName(Reference.MOD_ID + ":rifEmeraldOre");
    public static final Block rifEndStone = new BlockRIFMod(Material.rock).setBlockName("rifEndStone").setBlockTextureName(Reference.MOD_ID + ":rifEndStone");
    public static final Block rifGlass = new BlockRIFModTransparent(Material.glass).setBlockName("rifGlass").setBlockTextureName(Reference.MOD_ID + ":rifGlass");

    public static void init(){

        GameRegistry.registerBlock(obsidianFrame, "obsidianFrame");
        GameRegistry.registerBlock(rifDirt, "rifDirt");
        GameRegistry.registerBlock(rifStone, "rifStone");
        GameRegistry.registerBlock(rifBookshelf, "rifBookshelf");
        GameRegistry.registerBlock(rifBrick, "rifBrick");
        GameRegistry.registerBlock(rifClay, "rifClay");
        GameRegistry.registerBlock(rifCoalBlock, "rifCoalBlock");
        GameRegistry.registerBlock(rifCoalOre, "rifCoalOre");
        GameRegistry.registerBlock(rifCobblestone, "rifCobblestone");
        GameRegistry.registerBlock(rifDiamondBlock, "rifDiamondBlock");
        GameRegistry.registerBlock(rifDiamondOre, "rifDiamondOre");
        GameRegistry.registerBlock(rifEmeraldBlock, "rifEmeraldBlock");
        GameRegistry.registerBlock(rifEmeraldOre, "rifEmeraldOre");
        GameRegistry.registerBlock(rifEndStone, "rifEndStone");
        GameRegistry.registerBlock(rifGlass, "rifGlass");
    }

}
