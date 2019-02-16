package trikzon.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import trikzon.SnowVariants;

public class BlockBase extends Block {
    public BlockBase(String name) {
        super(Properties.from(Blocks.STONE));
        this.setRegistryName(SnowVariants.MODID, name);
    }

    public static void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
