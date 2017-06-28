package northerneclipse.oregenplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ogp", name = "OreGenPlus", version = "1.0")

public class OreGenPlus{
	
	//Iron
	public static Block blockSiderite; //Poor Iron Ore
	public static Block blockGoethite; //Normal Iron Ore
	public static Block blockMagnetite; //Rich Iron Ore
	
	//Copper
	public static Block blockChalcopyrite; //Poor Copper Ore
	public static Block blockAzurite; //Normal Copper Ore
	public static Block blockMalachite; //Rich Copper Ore
	
	//Aluminum
	public static Block blockBauxite; //Normal Aluminum Ore
	
	//Lead
	public static Block blockCerussite; //Poor Lead Ore
	public static Block blockGalena; //Normal Lead Ore
	
	//Zinc
	public static Block blockSphalerite; //Poor Zinc Ore
	public static Block blockZincite; //Normal Zinc Ore
	
	//Uranium
	public static Block blockAutunite; //Normal Uranium Ore
	
	//Titanium
	public static Block blockSphene; //Normal Titanium Ore
	
	//Tin
	public static Block blockCassiterite //Normal Tin Ore
	
	//Arsenic
	public static Block blockOrpiment //Poor Arsenic Ore
	public static Block blockRelgar //Normal Arsenic Ore
	
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
