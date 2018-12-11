package com.github.draylar.origindirt.proxy;

import com.github.draylar.origindirt.Blocks;
import com.github.draylar.origindirt.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy
{
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }


    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }

    public void registerItemRenderer(Item item, int meta, String name)
    {
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler
    {

        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event)
        {
            Items.registerItems(event);
        }


        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event)
        {
            Blocks.registerBlocks(event);
        }
    }
}
