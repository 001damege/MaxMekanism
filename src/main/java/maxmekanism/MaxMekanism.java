package maxmekanism;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MaxMekanism.MODID)
public class MaxMekanism {

    public static final String MODID = "maxmekanism";
    public static final String MOD_NAME = "MaxMekanism";
    public static final Logger LOGGER = LogManager.getLogger();

    public MaxMekanism() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
