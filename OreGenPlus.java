package northerneclipse.oregenplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ogp", name = "OreGenPlus", version = "1.0")

public class OreGenPlus{
	
	//Coal
	public static Block blockCoalOre //Coal
	
	//Iron
	public static Block blockSiderite //Poor Iron Ore
	public static Block blockGoethite //Normal Iron Ore
	public static Block blockMagnetite //Rich Iron Ore
	
	//Copper
	public static Block blockChalcopyrite //Poor Copper Ore
	public static Block blockAzurite //Normal Copper Ore
	public static Block blockMalachite //Rich Copper Ore
	
	//Aluminum
	public static Block block
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
