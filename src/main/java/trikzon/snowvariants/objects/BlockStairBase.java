package trikzon.snowvariants.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.compat.ModChecker;
import trikzon.snowvariants.compat.Gingerbread;
import trikzon.snowvariants.init.ModBlocks;

import java.util.Random;

public class BlockStairBase extends BlockStairs {
	public BlockStairBase(Block block, String name, SoundType soundType) {
		super(block.getDefaultState());

		this.setUnlocalizedName(SnowVariants.MODID + "." + name);
		this.setRegistryName(name);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.AIR;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		if(state.getBlock().getDefaultState().equals(ModBlocks.stairsOakSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.OAK_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsCobblestoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.BRICK_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsStoneBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_BRICK_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsNetherBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.NETHER_BRICK_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsSandstoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SANDSTONE_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsSpruceSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SPRUCE_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsBirchSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.BIRCH_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsJungleSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.JUNGLE_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsQuartzSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.QUARTZ_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsAcaciaSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.ACACIA_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsDarkOakSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.DARK_OAK_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsRedSandstoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.RED_SANDSTONE_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsPurpurSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.PURPUR_STAIRS), 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}
		if(ModChecker.isGingerbreadLoaded) {
			if(state.getBlock().getDefaultState().equals(ModBlocks.stairsGingerbreadSnow.getDefaultState())) {
				if(Gingerbread.stairsGingerbreadGingerbread==null) ModChecker.printErrorMessageStairsGingerbreadGingerbread();
				else drops.add(new ItemStack(Item.getItemFromBlock(Gingerbread.stairsGingerbreadGingerbread), 1));
				drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
			}
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		if(target.sideHit.equals(EnumFacing.UP))
			return new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER));
		if(state.getBlock().getDefaultState().equals(ModBlocks.stairsOakSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.OAK_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsCobblestoneSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsBrickSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.BRICK_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsStoneBrickSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_BRICK_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsNetherBrickSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.NETHER_BRICK_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsSandstoneSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.SANDSTONE_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsSpruceSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.SPRUCE_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsBirchSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.BIRCH_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsJungleSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.JUNGLE_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsQuartzSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.QUARTZ_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsAcaciaSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.ACACIA_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsDarkOakSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.DARK_OAK_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsRedSandstoneSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.RED_SANDSTONE_STAIRS));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.stairsPurpurSnow.getDefaultState())) {
			return new ItemStack(Item.getItemFromBlock(Blocks.PURPUR_STAIRS));
		}else if(ModChecker.isGingerbreadLoaded)
			if(state.getBlock().getDefaultState().equals(ModBlocks.stairsGingerbreadSnow.getDefaultState()))
				if(Gingerbread.stairsGingerbreadGingerbread==null) ModChecker.printErrorMessageStairsGingerbreadGingerbread();
				else return new ItemStack(Item.getItemFromBlock(Gingerbread.stairsGingerbreadGingerbread), 1, 0);
		return super.getPickBlock(state, target, world, pos, player);
	}
}
