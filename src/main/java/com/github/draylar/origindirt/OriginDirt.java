package com.github.draylar.origindirt;

import com.github.draylar.origindirt.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;

@Mod(
        modid = OriginDirt.MOD_ID,
        name = OriginDirt.MOD_NAME,
        version = OriginDirt.VERSION
)
public class OriginDirt
{

    public static final String MOD_ID = "origin-dirt";
    public static final String MOD_NAME = "BlockOriginDirt";
    public static final String VERSION = "1.0-SNAPSHOT";


    @Mod.Instance(MOD_ID)
    public static OriginDirt INSTANCE;

    @SidedProxy(clientSide = "com.github.draylar.origindirt.proxy.ClientProxy", serverSide = "com.github.draylar.origindirt.proxy.CommonProxy")
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        proxy.preinit(event);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }


    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        proxy.postinit(event);
    }
}
