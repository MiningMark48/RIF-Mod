package com.miningmark48.rifmod;

import com.miningmark48.rifmod.init.ModBlocks;
import com.miningmark48.rifmod.init.ModItems;
import com.miningmark48.rifmod.proxy.IProxy;
import com.miningmark48.rifmod.reference.Reference;
import com.miningmark48.rifmod.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class RIFMod {

    @Mod.Instance(Reference.MOD_ID)
    public static RIFMod instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModBlocks.init();
        ModItems.init();

        LogHelper.info("PreInit Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("PostInit Complete!");
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event){

        LogHelper.info("Server load complete!");
    }

}
