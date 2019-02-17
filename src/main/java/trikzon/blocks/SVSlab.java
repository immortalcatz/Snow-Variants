package trikzon.blocks;

import net.minecraft.block.Block;
import trikzon.SnowVariants;
import trikzon.util.EnumMaterials;

public class SVSlab extends Block {
    public SVSlab(EnumMaterials enumMaterials) {
        super(Properties.create(enumMaterials.getMaterial()));
        setRegistryName(SnowVariants.MODID, enumMaterials.getName());
    }
}
