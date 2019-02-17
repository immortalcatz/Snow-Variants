package trikzon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
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
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import trikzon.SnowVariants;
import trikzon.util.EnumMaterials;

import javax.annotation.Nullable;

public class StairsSnow extends BlockStairs {
    private static Block stairsOrigin;
    private static Float hardness, resistance;
    private static SoundType soundType;
    private static ToolType toolType;

    public StairsSnow(EnumMaterials enumMaterials) {
        super(enumMaterials.getBlockOrigin().getDefaultState(), Properties.create(enumMaterials.getMaterial()));
        this.stairsOrigin = enumMaterials.getStairsOrigin();
        this.hardness = enumMaterials.getHardness();
        this.resistance = enumMaterials.getResistance();
        this.soundType = enumMaterials.getSoundType();
        this.toolType = enumMaterials.getToolType();

        this.setRegistryName(SnowVariants.MODID, enumMaterials.getName());
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, EntityPlayer player) {
        if(!target.sideHit.equals(EnumFacing.UP))
            return new ItemStack(stairsOrigin);
        else return new ItemStack(Blocks.SNOW);
    }

    @Override
    public void getDrops(IBlockState state, NonNullList<ItemStack> drops, World world, BlockPos pos, int fortune) {
        drops.add(new ItemStack(stairsOrigin, 1));
        drops.add(new ItemStack(Blocks.SNOW, 1));
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(IBlockState state) {
        return toolType;
    }

    @Override
    public float getBlockHardness(IBlockState blockState, IBlockReader worldIn, BlockPos pos) {
        return hardness;
    }

    @Override
    public float getExplosionResistance() {
        return resistance;
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
