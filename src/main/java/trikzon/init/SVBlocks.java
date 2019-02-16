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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SnowVariants.MODID)
public class SVBlocks {

    public static StairsSnow stairsOakSnow = new StairsSnow("stairs_oak_snow");

    @SubscribeEvent
    public static void onBlockRegistration(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(stairsOakSnow);
    }

    @SubscribeEvent
    public static void onItemRegistration(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(stairsOakSnow, new Item.Properties()).setRegistryName(stairsOakSnow.getRegistryName()));
    }
}
