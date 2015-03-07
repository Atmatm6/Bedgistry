package ca.Atmatm6.bedgistry;

import ca.Atmatm6.catalog.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.bedgistryModid, name = Reference.bedgistryName, version = Reference.bedgistryVersion)
class BedgistryMain {
    public void preInit(FMLPreInitializationEvent preInitializationEvent)
    {
        System.out.println(Reference.modid);
    }
}
