package trikzon.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import trikzon.SnowVariants;
import trikzon.blocks.SVSlab;
import trikzon.blocks.SVStairs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SnowVariants.MODID)
public class SVBlocks {

    public static SVStairs minecraftStairsPurpur = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_PURPUR);
    public static SVStairs minecraftStairsOak = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_OAK);
    public static SVStairs minecraftStairsCobblestone = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_COBBLESTONE);
    public static SVStairs minecraftStairsBrick = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_BRICK);
    public static SVStairs minecraftStairsStoneBrick = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_STONE_BRICK);
    public static SVStairs minecraftStairsNetherBrick = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_NETHER_BRICK);
    public static SVStairs minecraftStairsSandstone = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_SANDSTONE);
    public static SVStairs minecraftStairsSpruce = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_SPRUCE);
    public static SVStairs minecraftStairsBirch = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_BIRCH);
    public static SVStairs minecraftStairsJungle = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_JUNGLE);
    public static SVStairs minecraftStairsQuartz = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_QUARTZ);
    public static SVStairs minecraftStairsAcacia = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_ACACIA);
    public static SVStairs minecraftStairsDarkOak = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_DARK_OAK);
    public static SVStairs minecraftStairsPrismarine = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_PRISMARINE);
    public static SVStairs minecraftStairsPrismarineBrick = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_PRISMARINE_BRICK);
    public static SVStairs minecraftStairsDarkPrismarine = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_DARK_PRISMARINE);
    public static SVStairs minecraftStairsRedSandstone = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_RED_SANDSTONE);

    public static SVSlab minecraftSlabOak = new SVSlab(EnumMaterials.MINECRAFT_SLAB_OAK);
    public static SVSlab minecraftSlabSpruce = new SVSlab(EnumMaterials.MINECRAFT_SLAB_SPRUCE);
    public static SVSlab minecraftSlabBirch = new SVSlab(EnumMaterials.MINECRAFT_SLAB_BIRCH);
    public static SVSlab minecraftSlabJungle = new SVSlab(EnumMaterials.MINECRAFT_SLAB_JUNGLE);
    public static SVSlab minecraftSlabAcacia = new SVSlab(EnumMaterials.MINECRAFT_SLAB_ACACIA);
    public static SVSlab minecraftSlabDarkOak = new SVSlab(EnumMaterials.MINECRAFT_SLAB_DARK_OAK);
    public static SVSlab minecraftSlabStone = new SVSlab(EnumMaterials.MINECRAFT_SLAB_STONE);
    public static SVSlab minecraftSlabSandstone = new SVSlab(EnumMaterials.MINECRAFT_SLAB_SANDSTONE);
    public static SVSlab minecraftSlabPetrifiedOak = new SVSlab(EnumMaterials.MINECRAFT_SLAB_PETRIFIED_OAK);
    public static SVSlab minecraftSlabCobblestone = new SVSlab(EnumMaterials.MINECRAFT_SLAB_COBBLESTONE);
    public static SVSlab minecraftSlabBrick = new SVSlab(EnumMaterials.MINECRAFT_SLAB_BRICK);
    public static SVSlab minecraftSlabStoneBrick = new SVSlab(EnumMaterials.MINECRAFT_SLAB_STONE_BRICK);
    public static SVSlab minecraftSlabNetherBrick = new SVSlab(EnumMaterials.MINECRAFT_SLAB_NETHER_BRICK);
    public static SVSlab minecraftSlabQuartz = new SVSlab(EnumMaterials.MINECRAFT_SLAB_QUARTZ);
    public static SVSlab minecraftSlabRedSandstone = new SVSlab(EnumMaterials.MINECRAFT_SLAB_RED_SANDSTONE);
    public static SVSlab minecraftSlabPurpur = new SVSlab(EnumMaterials.MINECRAFT_SLAB_PURPUR);
    public static SVSlab minecraftSlabPrismarine = new SVSlab(EnumMaterials.MINECRAFT_SLAB_PRISMARINE);
    public static SVSlab minecraftSlabPrismarineBrick = new SVSlab(EnumMaterials.MINECRAFT_SLAB_PRISMARINE_BRICK);
    public static SVSlab minecraftSlabDarkPrismarine = new SVSlab(EnumMaterials.MINECRAFT_SLAB_DARK_PRISMARINE);

    @SubscribeEvent
    public static void onBlockRegistration(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(minecraftStairsPurpur);
        registry.register(minecraftStairsOak);
        registry.register(minecraftStairsCobblestone);
        registry.register(minecraftStairsBrick);
        registry.register(minecraftStairsStoneBrick);
        registry.register(minecraftStairsNetherBrick);
        registry.register(minecraftStairsSandstone);
        registry.register(minecraftStairsSpruce);
        registry.register(minecraftStairsBirch);
        registry.register(minecraftStairsJungle);
        registry.register(minecraftStairsQuartz);
        registry.register(minecraftStairsAcacia);
        registry.register(minecraftStairsDarkOak);
        registry.register(minecraftStairsPrismarine);
        registry.register(minecraftStairsPrismarineBrick);
        registry.register(minecraftStairsDarkPrismarine);
        registry.register(minecraftStairsRedSandstone);

        registry.register(minecraftSlabOak);
        registry.register(minecraftSlabSpruce);
        registry.register(minecraftSlabBirch);
        registry.register(minecraftSlabJungle);
        registry.register(minecraftSlabAcacia);
        registry.register(minecraftSlabDarkOak);
        registry.register(minecraftSlabStone);
        registry.register(minecraftSlabSandstone);
        registry.register(minecraftSlabPetrifiedOak);
        registry.register(minecraftSlabCobblestone);
        registry.register(minecraftSlabBrick);
        registry.register(minecraftSlabStoneBrick);
        registry.register(minecraftSlabNetherBrick);
        registry.register(minecraftSlabQuartz);
        registry.register(minecraftSlabRedSandstone);
        registry.register(minecraftSlabPurpur);
        registry.register(minecraftSlabPrismarine);
        registry.register(minecraftSlabPrismarineBrick);
        registry.register(minecraftSlabDarkPrismarine);
    }

//    @SubscribeEvent
//    public static void onItemRegistration(final RegistryEvent.Register<Item> event) {
//        IForgeRegistry<Item> registry = event.getRegistry();
//        registry.register(new ItemBlock(minecraftStairsPurpur, new Item.Properties()).setRegistryName(minecraftStairsPurpur.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsOak, new Item.Properties()).setRegistryName(minecraftStairsOak.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsBrick, new Item.Properties()).setRegistryName(minecraftStairsBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsStoneBrick, new Item.Properties()).setRegistryName(minecraftStairsStoneBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsNetherBrick, new Item.Properties()).setRegistryName(minecraftStairsNetherBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsSandstone, new Item.Properties()).setRegistryName(minecraftStairsSandstone.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsSpruce, new Item.Properties()).setRegistryName(minecraftStairsSpruce.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsBirch, new Item.Properties()).setRegistryName(minecraftStairsBirch.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsJungle, new Item.Properties()).setRegistryName(minecraftStairsJungle.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsQuartz, new Item.Properties()).setRegistryName(minecraftStairsQuartz.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsAcacia, new Item.Properties()).setRegistryName(minecraftStairsAcacia.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsDarkOak, new Item.Properties()).setRegistryName(minecraftStairsDarkOak.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsPrismarine, new Item.Properties()).setRegistryName(minecraftStairsPrismarine.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsPrismarineBrick, new Item.Properties()).setRegistryName(minecraftStairsPrismarineBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsDarkPrismarine, new Item.Properties()).setRegistryName(minecraftStairsDarkPrismarine.getRegistryName()));
//        registry.register(new ItemBlock(minecraftStairsRedSandstone, new Item.Properties()).setRegistryName(minecraftStairsRedSandstone.getRegistryName()));
//
//        registry.register(new ItemBlock(minecraftSlabOak, new Item.Properties()).setRegistryName(minecraftSlabOak.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabSpruce, new Item.Properties()).setRegistryName(minecraftSlabSpruce.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabBirch, new Item.Properties()).setRegistryName(minecraftSlabBirch.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabJungle, new Item.Properties()).setRegistryName(minecraftSlabJungle.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabAcacia, new Item.Properties()).setRegistryName(minecraftSlabAcacia.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabDarkOak, new Item.Properties()).setRegistryName(minecraftSlabDarkOak.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabStone, new Item.Properties()).setRegistryName(minecraftSlabStone.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabSandstone, new Item.Properties()).setRegistryName(minecraftSlabSandstone.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabPetrifiedOak, new Item.Properties()).setRegistryName(minecraftSlabPetrifiedOak.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabCobblestone, new Item.Properties()).setRegistryName(minecraftSlabCobblestone.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabBrick, new Item.Properties()).setRegistryName(minecraftSlabBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabStoneBrick, new Item.Properties()).setRegistryName(minecraftSlabStoneBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabNetherBrick, new Item.Properties()).setRegistryName(minecraftSlabNetherBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabQuartz, new Item.Properties()).setRegistryName(minecraftSlabQuartz.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabRedSandstone, new Item.Properties()).setRegistryName(minecraftSlabRedSandstone.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabPurpur, new Item.Properties()).setRegistryName(minecraftSlabPurpur.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabPrismarine, new Item.Properties()).setRegistryName(minecraftSlabPrismarine.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabPrismarineBrick, new Item.Properties()).setRegistryName(minecraftSlabPrismarineBrick.getRegistryName()));
//        registry.register(new ItemBlock(minecraftSlabDarkPrismarine, new Item.Properties()).setRegistryName(minecraftSlabDarkPrismarine.getRegistryName()));
//    }
}
