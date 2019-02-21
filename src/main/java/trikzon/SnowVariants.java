package trikzon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.handlers.RightClickHandler;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SnowVariants.MODID)
public class SnowVariants {

    public static final String MODID = "snowvariants";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public SnowVariants() {
        MinecraftForge.EVENT_BUS.register(this);

        RightClickHandler rightClickHandler = new RightClickHandler();
        MinecraftForge.EVENT_BUS.register(rightClickHandler);
    }
}
