package trikzon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import trikzon.SnowVariants;
import trikzon.init.EnumMaterials;

import javax.annotation.Nullable;

public class SVSlab extends Block {

    private final EnumMaterials enumMaterials;

    public SVSlab(EnumMaterials enumMaterials) {
        super(Properties.create(enumMaterials.getMaterial()));
        this.enumMaterials = enumMaterials;

        setRegistryName(SnowVariants.MODID, enumMaterials.getName());
    }

    @Override
    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        return VoxelShapes.create(0, 0, 0, 1, 0.5, 1);
    }

    @Override
    public boolean isTopSolid(IBlockState state, IWorldReader world, BlockPos pos) {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockReader worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        if(!face.equals(EnumFacing.DOWN)) return BlockFaceShape.UNDEFINED;
        else return BlockFaceShape.SOLID;

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

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
