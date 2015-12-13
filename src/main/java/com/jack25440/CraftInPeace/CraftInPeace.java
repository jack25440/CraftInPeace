package com.jack25440.CraftInPeace;
import com.jack25440.CraftInPeace.Configuation.ConfigurationHandler;
import com.jack25440.CraftInPeace.init.Recipes;
import com.jack25440.CraftInPeace.reference.Reference;
import com.jack25440.CraftInPeace.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class CraftInPeace
{
    @Mod.Instance(Reference.MOD_ID)
    public static CraftInPeace instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("PreInitialization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization Complete.");
    }
}
