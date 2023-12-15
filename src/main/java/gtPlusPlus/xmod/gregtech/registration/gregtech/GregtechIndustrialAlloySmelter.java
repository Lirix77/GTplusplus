package gtPlusPlus.xmod.gregtech.registration.gregtech;

import gtPlusPlus.api.objects.Logger;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.GregtechMetaTileEntity_IndustrialAlloySmelter;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.mega.GregTechMetaTileEntity_MegaAlloyBlastSmelter;

public class GregtechIndustrialAlloySmelter {

    public static void run() {
        Logger.INFO("Gregtech5u Content | Registering Industrial Alloy Smelter Multiblock.");
        run1();
    }

    private static void run1() {
        GregtechItemList.Industrial_AlloySmelter.set(
                new GregtechMetaTileEntity_IndustrialAlloySmelter(
                        31023,
                        "industrialalloysmelter.controller.tier.single",
                        "Zyngen").getStackForm(1L));
        GregtechItemList.Mega_AlloyBlastSmelter.set(
                new GregTechMetaTileEntity_MegaAlloyBlastSmelter(
                        31150,
                        "industrialsalloyamelter.controller.tier.mega",
                        "Mega Alloy Blast Smelter").getStackForm(1L));
    }
}
