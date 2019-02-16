package trikzon.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trikzon.SnowVariants;
import trikzon.util.EnumMaterials;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RightClickHandler {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onItemRightClick(PlayerInteractEvent.RightClickBlock event) {
        World worldIn = event.getWorld();
        EntityPlayer playerIn = event.getEntityPlayer();

        RayTraceResult rayTraceResult = this.getRaytraceResult(playerIn, worldIn);
        if(rayTraceResult == null)
            return;
        if(rayTraceResult.type == RayTraceResult.Type.BLOCK) {
            if(rayTraceResult.sideHit.equals(EnumFacing.UP)) {
                ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
                BlockPos blockPos = rayTraceResult.getBlockPos();

                System.out.println(item);
                System.out.println(new ItemStack(Blocks.SNOW));
                System.out.println(new ItemStack(item.getItem()).toString().equals(new ItemStack(Blocks.SNOW).toString()));
                if(new ItemStack(item.getItem()).toString().equals(new ItemStack(Blocks.SNOW).toString())) {
                    List<Block> originStairValues = Stream.of(EnumMaterials.values()).map(EnumMaterials::getStairsOrigin).collect(Collectors.toList());
                    SnowVariants.LOGGER.error(originStairValues.size());
                    for (Block i:originStairValues) {
                        if(!worldIn.getBlockState(blockPos).getBlock().equals(i)) continue;
                        System.out.println("This Is It!!!");
                    }
                }
            }
        }
    }
    
/**Old Code, don't uncomment. Instead rewrite*/
//    public void convertStair(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, Block snowVariant) {
//        if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
//            if (worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
//                ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
//                worldIn.setBlockState(blockPos, snowVariant.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
//                worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
//                if (!playerIn.isCreative())
//                    item.shrink(1);
//            }
//        }
//    }
//
//    public void convertSlab(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, Block snowVariant) {
//        if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
//            if(worldIn.getBlockState(blockPos).getValue(BlockSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
//                ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
//                worldIn.setBlockState(blockPos, snowVariant.getDefaultState());
//                worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
//                if (!playerIn.isCreative())
//                    item.shrink(1);
//            }
//        }
//    }
//
//    public void convertSlabWithVariant(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, PropertyEnum variantType, String variant, Block snowVariant) {
//        if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
//            if(worldIn.getBlockState(blockPos).getValue(BlockSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
//                if(worldIn.getBlockState(blockPos).getValue(variantType).toString().equals(variant)) {
//                    ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
//                    worldIn.setBlockState(blockPos, snowVariant.getDefaultState());
//                    worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
//                    if (!playerIn.isCreative())
//                        item.shrink(1);
//                }
//            }
//        }
//    }

    public RayTraceResult getRaytraceResult(EntityPlayer playerIn, World worldIn) {
        float f1 = playerIn.prevRotationPitch + (playerIn.rotationPitch - playerIn.prevRotationPitch) * 1.0F;
        float f2 = playerIn.prevRotationYaw + (playerIn.rotationYaw - playerIn.prevRotationYaw) * 1.0F;
        double d0 = playerIn.prevPosX + (playerIn.posX - playerIn.prevPosX) * 1.0D;
        double d1 = playerIn.prevPosY + (playerIn.posY - playerIn.prevPosY) * 1.0D + (double)playerIn.getEyeHeight();
        double d2 = playerIn.prevPosZ + (playerIn.posZ - playerIn.prevPosZ) * 1.0D;
        Vec3d vec3d = new Vec3d(d0, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.017453292F - (float)Math.PI);
        float f4 = MathHelper.sin(-f2 * 0.017453292F - (float)Math.PI);
        float f5 = -MathHelper.cos(-f1 * 0.017453292F);
        float f6 = MathHelper.sin(-f1 * 0.017453292F);
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        Vec3d vec3d1 = vec3d.add((double)f7 * 5.0D, (double)f6 * 5.0D, (double)f8 * 5.0D);
        RayTraceResult raytraceresult = worldIn.rayTraceBlocks(vec3d, vec3d1, RayTraceFluidMode.NEVER);
        return raytraceresult;
    }
}
