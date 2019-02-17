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

    public static SVStairs minecraftStairsOak = new SVStairs(EnumMaterials.MINECRAFT_STAIRS_OAK);

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
        registry.register(minecraftStairsOak);

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

    @SubscribeEvent
    public static void onItemRegistration(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(minecraftStairsOak, new Item.Properties()).setRegistryName(minecraftStairsOak.getRegistryName()));

        registry.register(new ItemBlock(minecraftSlabOak, new Item.Properties()).setRegistryName(minecraftSlabOak.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabSpruce, new Item.Properties()).setRegistryName(minecraftSlabSpruce.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabBirch, new Item.Properties()).setRegistryName(minecraftSlabBirch.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabJungle, new Item.Properties()).setRegistryName(minecraftSlabJungle.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabAcacia, new Item.Properties()).setRegistryName(minecraftSlabAcacia.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabDarkOak, new Item.Properties()).setRegistryName(minecraftSlabDarkOak.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabStone, new Item.Properties()).setRegistryName(minecraftSlabStone.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabSandstone, new Item.Properties()).setRegistryName(minecraftSlabSandstone.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabPetrifiedOak, new Item.Properties()).setRegistryName(minecraftSlabPetrifiedOak.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabCobblestone, new Item.Properties()).setRegistryName(minecraftSlabCobblestone.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabBrick, new Item.Properties()).setRegistryName(minecraftSlabBrick.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabStoneBrick, new Item.Properties()).setRegistryName(minecraftSlabStoneBrick.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabNetherBrick, new Item.Properties()).setRegistryName(minecraftSlabNetherBrick.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabQuartz, new Item.Properties()).setRegistryName(minecraftSlabQuartz.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabRedSandstone, new Item.Properties()).setRegistryName(minecraftSlabRedSandstone.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabPurpur, new Item.Properties()).setRegistryName(minecraftSlabPurpur.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabPrismarine, new Item.Properties()).setRegistryName(minecraftSlabPrismarine.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabPrismarineBrick, new Item.Properties()).setRegistryName(minecraftSlabPrismarineBrick.getRegistryName()));
        registry.register(new ItemBlock(minecraftSlabDarkPrismarine, new Item.Properties()).setRegistryName(minecraftSlabDarkPrismarine.getRegistryName()));
    }
}
