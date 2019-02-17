package trikzon.handlers;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trikzon.init.EnumMaterials;

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

                if(new ItemStack(item.getItem()).toString().equals(new ItemStack(Blocks.SNOW).toString())) {
                    for(EnumMaterials materials : EnumMaterials.values()) {
                        if(!worldIn.getBlockState(blockPos).getBlock().equals(materials.getStairsOrigin())) continue;
                        switch (materials.getBlockType()) {
                            case "stairs":
                                if(!worldIn.getBlockState(blockPos).get(BlockStairs.HALF).equals(Half.BOTTOM)) break;
                                worldIn.setBlockState(blockPos, materials.getBlock().getDefaultState()
                                        .with(BlockStairs.FACING, worldIn.getBlockState(blockPos).get(BlockStairs.FACING))
                                        .with(BlockStairs.HALF, worldIn.getBlockState(blockPos).get(BlockStairs.HALF))
                                        .with(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).get(BlockStairs.SHAPE))
                                        .with(BlockStairs.WATERLOGGED, worldIn.getBlockState(blockPos).get(BlockStairs.WATERLOGGED)));
                                worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
                                if(!playerIn.isCreative()) item.shrink(1);
                                break;
                            case "slab":
                                if(!worldIn.getBlockState(blockPos).get(BlockSlab.TYPE).equals(SlabType.BOTTOM)) break;
                                worldIn.setBlockState(blockPos, materials.getBlock().getDefaultState());
                                worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
                                if(!playerIn.isCreative()) item.shrink(1);
                                break;
                        }
                    }
                }
            }
        }
    }

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
