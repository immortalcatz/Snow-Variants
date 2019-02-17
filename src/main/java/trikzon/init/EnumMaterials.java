package trikzon.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.ToolType;
import trikzon.SnowVariants;
import trikzon.init.SVBlocks;

public enum EnumMaterials implements IStringSerializable{
    MINECRAFT_STAIRS_OAK("minecraft_stairs_oak", Blocks.OAK_PLANKS, Blocks.OAK_STAIRS, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "stairs"),
    MINECRAFT_SLAB_OAK("minecraft_slab_oak", Blocks.OAK_PLANKS, Blocks.OAK_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_SPRUCE("minecraft_slab_spruce", Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_BIRCH("minecraft_slab_birch", Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_JUNGLE("minecraft_slab_jungle", Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_ACACIA("minecraft_slab_acacia", Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_DARK_OAK("minecraft_slab_dark_oak", Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_STONE("minecraft_slab_stone", Blocks.SMOOTH_STONE, Blocks.STONE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_SANDSTONE("minecraft_slab_sandstone", Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_PETRIFIED_OAK("minecraft_slab_petrified_oak", Blocks.OAK_PLANKS, Blocks.PETRIFIED_OAK_SLAB, Material.WOOD, 2.0f, 7.5f, SoundType.WOOD, ToolType.AXE, "slab"),
    MINECRAFT_SLAB_COBBLESTONE("minecraft_slab_cobblestone", Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_BRICK("minecraft_slab_brick", Blocks.BRICKS, Blocks.BRICK_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_STONE_BRICK("minecraft_slab_stone_brick", Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_NETHER_BRICK("minecraft_slab_nether_brick", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_QUARTZ("minecraft_slab_quartz", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_RED_SANDSTONE("minecraft_slab_red_sandstone", Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_PURPUR("minecraft_slab_purpur", Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_PRISMARINE("minecraft_slab_prismarine", Blocks.PRISMARINE, Blocks.PRISMARINE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_PRISMARINE_BRICK("minecraft_slab_prismarine_brick", Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab"),
    MINECRAFT_SLAB_DARK_PRISMARINE("minecraft_slab_dark_prismarine", Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, Material.ROCK, 2.0f, 15.0f, SoundType.STONE, ToolType.PICKAXE, "slab");

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
                case "minecraft_stairs_oak": return SVBlocks.minecraftStairsOak;
                default:
                    SnowVariants.LOGGER.error("Object's name: " + name + " is not an available option in blockType > name switch statement for slabs");
                    return null;
            }
        } else if(blockType.equals("slab")) {
            switch ((name)) {
                case "minecraft_slab_oak": return SVBlocks.minecraftSlabOak;
                case "minecraft_slab_spruce": return SVBlocks.minecraftSlabSpruce;
                case "minecraft_slab_birch": return SVBlocks.minecraftSlabBirch;
                case "minecraft_slab_jungle": return SVBlocks.minecraftSlabJungle;
                case "minecraft_slab_acacia": return SVBlocks.minecraftSlabAcacia;
                case "minecraft_slab_dark_oak": return SVBlocks.minecraftSlabDarkOak;
                case "minecraft_slab_stone": return SVBlocks.minecraftSlabStone;
                case "minecraft_slab_sandstone": return SVBlocks.minecraftSlabSandstone;
                case "minecraft_slab_petrified_oak": return SVBlocks.minecraftSlabPetrifiedOak;
                case "minecraft_slab_cobblestone": return SVBlocks.minecraftSlabCobblestone;
                case "minecraft_slab_brick": return SVBlocks.minecraftSlabBrick;
                case "minecraft_slab_stone_brick": return SVBlocks.minecraftSlabStoneBrick;
                case "minecraft_slab_nether_brick": return SVBlocks.minecraftSlabNetherBrick;
                case "minecraft_slab_quartz": return SVBlocks.minecraftSlabQuartz;
                case "minecraft_slab_red_sandstone": return SVBlocks.minecraftSlabRedSandstone;
                case "minecraft_slab_purpur": return SVBlocks.minecraftSlabPurpur;
                case "minecraft_slab_prismarine": return SVBlocks.minecraftSlabPrismarine;
                case "minecraft_slab_prismarine_brick": return SVBlocks.minecraftSlabPrismarineBrick;
                case "minecraft_slab_dark_prismarine": return SVBlocks.minecraftSlabDarkPrismarine;
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
