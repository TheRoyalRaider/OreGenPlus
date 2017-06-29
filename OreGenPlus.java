package northerneclipse.oregenplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

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
	public static Block blockCassiterite; //Normal Tin Ore
	
	//Arsenic
	public static Block blockOrpiment; //Poor Arsenic Ore
	public static Block blockRealgar; //Normal Arsenic Ore
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		blockSiderite = new BlockMaterial(Material.iron).setBlockName("BlockSiderite").setBlockTextureName("ogp:ore_siderite").setCreativeTab(tabOreGenPlus);
		blockGoethite = new BlockMaterial(Material.iron).setBlockName("BlockGoethite").setBlockTextureName("ogp:ore_goethite").setCreativeTab(tabOreGenPlus);
		blockMagnetite = new BlockMaterial(Material.iron).setBlockName("BlockMagnetite").setBlockTextureName("ogp:ore_magnetite").setCreativeTab(tabOreGenPlus);
		blockChalcopyrite = new BlockMaterial(Material.iron).setBlockName("BlockChalcopyrite").setBlockTextureName("ogp:ore_chalcopyrite").setCreativeTab(tabOreGenPlus);
		blockAzurite = new BlockMaterial(Material.iron).setBlockName("BlockAzurite").setBlockTextureName("ogp:ore_azurite").setCreativeTab(tabOreGenPlus);
		blockMalachite = new BlockMaterial(Material.iron).setBlockName("BlockMalachite").setBlockTextureName("ogp:ore_malachite").setCreativeTab(tabOreGenPlus);
		blockBauxite = new BlockMaterial(Material.iron).setBlockName("BlockBauxite").setBlockTextureName("ogp:ore_bauxite").setCreativeTab(tabOreGenPlus);
		blockCerussite = new BlockMaterial(Material.iron).setBlockName("BlockCerussite").setBlockTextureName("ogp:ore_cerussite").setCreativeTab(tabOreGenPlus);
		blockGalena = new BlockMaterial(Material.iron).setBlockName("BlockGalena").setBlockTextureName("ogp:ore_galena").setCreativeTab(tabOreGenPlus);
		blockSphalerite = new BlockMaterial(Material.iron).setBlockName("BlockSphalerite").setBlockTextureName("ogp:ore_sphalerite").setCreativeTab(tabOreGenPlus);
		blockZincite = new BlockMaterial(Material.iron).setBlockName("BlockZincite").setBlockTextureName("ogp:ore_zincite").setCreativeTab(tabOreGenPlus);
		blockAutunite = new BlockMaterial(Material.iron).setBlockName("BlockAutunite").setBlockTextureName("ogp:ore_autunite").setCreativeTab(tabOreGenPlus);
		blockSphene = new BlockMaterial(Material.iron).setBlockName("BlockSphene").setBlockTextureName("ogp:ore_sphene").setCreativeTab(tabOreGenPlus);
		blockCassiterite = new BlockMaterial(Material.iron).setBlockName("BlockCassiterite").setBlockTextureName("ogp:ore_cassiterite").setCreativeTab(tabOreGenPlus);
		blockOrpiment = new BlockMaterial(Material.iron).setBlockName("BlockOrpiment").setBlockTextureName("ogp:ore_orpiment").setCreativeTab(tabOreGenPlus);
		blockRealgar = new BlockMaterial(Material.iron).setBlockName("BlockRealgar").setBlockTextureName("ogp:ore_realgar").setCreativeTab(tabOreGenPlus);
		
		GameRegistry.registerBlock(blockSiderite, blockSiderite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGoethite, blockGoethite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMagnetite, blockMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockChalcopyrite, blockChalcopyrite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAzurite, blockAzurite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMalachite, blockMalachite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBauxite, blockBauxite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCerussite, blockCerussite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGalena, blockGalena.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSphalerite, blockSphalerite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockZincite, blockZincite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAutunite, blockAutunite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSphene, blockSphene.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCassiterite, blockCassiterite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOrpiment, blockOrpiment.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRealgar, blockRealgar.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabOreGenPlus = new CreativeTabs("tabWorldGenPlus"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(blockSiderite).getItem();
		}
	};
}
