package maxmekanism.mixin;

import mekanism.common.tile.machine.TileEntityChemicalOxidizer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = TileEntityChemicalOxidizer.class, remap = false)
public class MixinChemicalOxidizer {

    @ModifyConstant(method = "getInitialGasTanks", constant = @Constant(longValue = 10000L))
    private long modifyChemicalTankCapacity(long c) { return Long.MAX_VALUE;}
}
