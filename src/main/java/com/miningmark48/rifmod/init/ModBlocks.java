package com.miningmark48.rifmod.init;

import com.miningmark48.rifmod.block.BlockRIFMod;
import com.miningmark48.rifmod.creativetab.CreativeTabRIFMod;
import com.miningmark48.rifmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final Block rifDirt = new BlockRIFMod(Material.grass).setBlockName("rifDirt").setBlockTextureName(Reference.MOD_ID + ":rifDirt").setCreativeTab(CreativeTabRIFMod.RIFMod_TAB);

    public static void init(){
        GameRegistry.registerBlock(rifDirt, "rifDirt");
    }

}
