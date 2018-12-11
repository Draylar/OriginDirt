package com.github.draylar.origindirt;

import com.github.draylar.origindirt.blocks.BlockOriginDirt;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class Blocks
{
    public static BlockOriginDirt originDirt = new BlockOriginDirt();

    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                originDirt
        );
    }
}
