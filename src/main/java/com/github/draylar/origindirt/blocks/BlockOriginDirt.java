package com.github.draylar.origindirt.blocks;

import com.github.draylar.origindirt.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOriginDirt extends Block
{

    public BlockOriginDirt()
    {
        super(Material.GROUND);
        setTranslationKey("origin_dirt");
        setRegistryName("origin_dirt");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }


    /**
     * Spawn a dirt item above the block when it's broken. Helps to prevent dirt falling into the void.
     * @param worldIn
     * @param pos
     * @param state
     */
    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        super.breakBlock(worldIn, pos, state);

        // spawn item above block
        EntityItem spawnedDirt = new EntityItem(worldIn, pos.getX() + .5, pos.getY() + 1.2f, pos.getZ() + .5);
        spawnedDirt.setVelocity(0, 0, 0);
        spawnedDirt.setItem(new ItemStack(net.minecraft.init.Blocks.DIRT));
        worldIn.spawnEntity(spawnedDirt);

        // replace block
        worldIn.setBlockState(pos, Blocks.originDirt.getDefaultState());
    }

    @Override
    public SoundType getSoundType()
    {
        return SoundType.GROUND;
    }

    @Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return 0.5f;
    }
}
