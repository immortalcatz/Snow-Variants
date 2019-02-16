package trikzon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import trikzon.SnowVariants;

public class StairsSnow extends Block {
    public StairsSnow(String name) {
        super(Properties.from(Blocks.STONE));
        this.setRegistryName(SnowVariants.MODID, name);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
