package com.miningmark48.rifmod.creativetab;

import com.miningmark48.rifmod.init.ModBlocks;
import com.miningmark48.rifmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabRIFMod {

    public static final CreativeTabs RIFMod_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Items.iron_ingot;
        }
    };
}
