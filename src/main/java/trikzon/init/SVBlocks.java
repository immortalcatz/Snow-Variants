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

    @SubscribeEvent
    public static void onBlockRegistration(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(minecraftStairsOak);
        registry.register(minecraftSlabOak);
    }

    @SubscribeEvent
    public static void onItemRegistration(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(minecraftStairsOak, new Item.Properties()).setRegistryName(minecraftStairsOak.getRegistryName()));

        registry.register(new ItemBlock(minecraftSlabOak, new Item.Properties()).setRegistryName(minecraftSlabOak.getRegistryName()));
    }
}
