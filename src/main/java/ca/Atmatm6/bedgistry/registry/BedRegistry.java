package ca.Atmatm6.bedgistry.registry;

import ca.Atmatm6.catalog.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BedRegistry {
    public static BedRegistry[] bedRegistryArray = new BedRegistry[200];
    /*
    *  You must enter @param localized
    *
    */
    public static Logger bedlog = LogManager.getLogger(Reference.bedgistryModid);
    public static void registerBed(Block block, String name, Integer id, Boolean type)
    {
        GameRegistry.registerBlock(block, name);
        bedlog.log(Level.INFO, "Registering a bed with the id ");
    }
    public static int getNewBedId()
    {
        return bedRegistryArray.length;
    }
}
