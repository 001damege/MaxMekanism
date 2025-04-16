package maxmekanism.mixin;

import mekanism.common.tile.machine.TileEntityChemicalDissolutionChamber;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = TileEntityChemicalDissolutionChamber.class, remap = false)
public class MixinChemicalDissolutionChamber {

    @ModifyConstant(method = "getInitialGasTanks", constant = @Constant(longValue = 10000L))
    private long modifyChemicalTankCapacity(long c) { return Long.MAX_VALUE;}

    @ModifyConstant(method = "presetVariables", constant = @Constant(longValue = 10000L))
    private long modifyTankCapacity(long c) { return Long.MAX_VALUE;}
}
