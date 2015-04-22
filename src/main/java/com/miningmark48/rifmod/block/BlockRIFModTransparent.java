package com.miningmark48.rifmod.block;


import com.miningmark48.rifmod.creativetab.CreativeTabRIFMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRIFModTransparent extends Block {

    public BlockRIFModTransparent(Material material){
        super(material);
        this.setHardness(2.0F);
        this.setResistance(99999.9F);
        this.setCreativeTab(CreativeTabRIFMod.RIFMod_TAB);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

}
