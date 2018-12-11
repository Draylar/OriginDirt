package com.github.draylar.origindirt;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

public class Items
{
    public static Item itemOriginDirt = new ItemBlock(Blocks.originDirt).setRegistryName("origin_dirt");

    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                itemOriginDirt
        );

        registerModels();
    }

    public static void registerModels()
    {
        OriginDirt.proxy.registerItemRenderer(itemOriginDirt, 0, "origin_dirt");
    }
}
