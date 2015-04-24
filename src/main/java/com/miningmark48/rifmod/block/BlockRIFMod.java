package com.miningmark48.rifmod.block;

import com.miningmark48.rifmod.creativetab.CreativeTabRIFMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRIFMod extends Block {

    public BlockRIFMod(Material material){
        super(material);
        this.setHardness(5.5F);
        this.setResistance(99999.9F);
        this.setCreativeTab(CreativeTabRIFMod.RIFMod_TAB);
    }

}
