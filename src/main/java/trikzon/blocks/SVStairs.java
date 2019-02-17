package trikzon.blocks;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import trikzon.SnowVariants;
import trikzon.init.EnumMaterials;

import javax.annotation.Nullable;

public class SVStairs extends BlockStairs implements IBucketPickupHandler, ILiquidContainer {
    private final EnumMaterials enumMaterials;

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public SVStairs(EnumMaterials enumMaterials) {
        super(enumMaterials.getBlockOrigin().getDefaultState(), Properties.create(enumMaterials.getMaterial()));
        this.enumMaterials = enumMaterials;

        this.setRegistryName(SnowVariants.MODID, enumMaterials.getName());
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, EntityPlayer player) {
        if(!target.sideHit.equals(EnumFacing.UP))
            return new ItemStack(enumMaterials.getStairsOrigin());
        else return new ItemStack(Blocks.SNOW);
    }

    @Override
    public void getDrops(IBlockState state, NonNullList<ItemStack> drops, World world, BlockPos pos, int fortune) {
        drops.add(new ItemStack(enumMaterials.getStairsOrigin(), 1));
        drops.add(new ItemStack(Blocks.SNOW, 1));
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(IBlockState state) {
        return enumMaterials.getToolType();
    }

    @Override
    public float getBlockHardness(IBlockState blockState, IBlockReader worldIn, BlockPos pos) {
        return enumMaterials.getHardness();
    }

    @Override
    public float getExplosionResistance() {
        return enumMaterials.getResistance();
    }

    @Override
    public SoundType getSoundType(IBlockState state, IWorldReader world, BlockPos pos, @Nullable Entity entity) {
        return soundType;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
