package trikzon.util;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.ToolType;
import trikzon.SnowVariants;
import trikzon.init.SVBlocks;

public enum EnumMaterials implements IStringSerializable{
    MINECRAFT_STAIRS_OAK("minecraft_stairs_oak", Blocks.OAK_PLANKS, Blocks.OAK_STAIRS, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "stairs");

    private String name;
    private Block blockOrigin;
    private Block stairsOrigin;
    private Material material;
    private float hardness;
    private float resistance;
    private SoundType soundType;
    private ToolType toolType;
    private String blockType;

    EnumMaterials(String name, Block blockOrigin, Block stairsOrigin, Material material, Float hardness, Float resistance, SoundType soundType, ToolType toolType, String blockType) {

        this.name = name;
        this.blockOrigin = blockOrigin;
        this.stairsOrigin = stairsOrigin;
        this.material = material;
        this.hardness = hardness;
        this.resistance = resistance;
        this.soundType = soundType;
        this.toolType = toolType;
        this.blockType = blockType;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    public Block getBlock() {
        if(blockType.equals("stairs")) {
            switch (name) {
                case "minecraft_stairs_oak":
                    return SVBlocks.minecraftStairsOak;
                default:
                    SnowVariants.LOGGER.error("Object's name: " + name + " is not an available option in blockType > name switch statement for slabs");
                    return null;
            }
        } else if(blockType.equals("slab")) {
            switch ((name)) {
                default:
                    SnowVariants.LOGGER.error("Object's name: " + name + " is not an available option in blockType > name switch statement for slabs");
                    return null;
            }
        }
        SnowVariants.LOGGER.error("blockType for " + name + " is not equal to available options but is equal to " + blockType);
        return null;
    }

    public Block getBlockOrigin() { return this.blockOrigin; }
    public Block getStairsOrigin() { return this.stairsOrigin; }
    public Material getMaterial() { return this.material; }
    public float getHardness() { return this.hardness; }
    public float getResistance() { return this.resistance; }
    public SoundType getSoundType() { return this.soundType; }
    public ToolType getToolType() { return this.toolType; }
    public String getBlockType() { return this.blockType; }


}
