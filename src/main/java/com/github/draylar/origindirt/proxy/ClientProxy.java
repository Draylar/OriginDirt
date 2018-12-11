package com.github.draylar.origindirt.proxy;

import com.github.draylar.origindirt.OriginDirt;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preinit(FMLPreInitializationEvent event)
    {
        super.preinit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postinit(FMLPostInitializationEvent event)
    {
        super.postinit(event);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String name)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(OriginDirt.MOD_ID + ":" + name, "inventory"));
    }
}
