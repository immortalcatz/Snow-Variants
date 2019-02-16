package trikzon.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import trikzon.SnowVariants;
import trikzon.blocks.StairsSnow;
import trikzon.util.EnumMaterials;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SnowVariants.MODID)
public class SVBlocks {

    public static StairsSnow minecraftStairsOak = new StairsSnow(EnumMaterials.MINECRAFT_STAIRS_OAK);

    @SubscribeEvent
    public static void onBlockRegistration(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(minecraftStairsOak);
    }

    @SubscribeEvent
    public static void onItemRegistration(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(minecraftStairsOak, new Item.Properties()).setRegistryName(minecraftStairsOak.getRegistryName()));
    }
}
