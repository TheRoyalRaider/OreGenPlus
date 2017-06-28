package northerneclipse.oregenplus;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;

		}
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}
	
	private void generateOverworld(World world, Random random, int chunkX, int chunkZ) {
		//generateOre(OreGenPlus.block*Name*, world, random, chunkX, chunkZ, *MinVeinSize*, *MaxVeinSize*, *Spawn Chance*, *MinY*, *MaxY* Blocks.*SpawnIn*;
		
		//Poor Ores
		generateOre(OreGenPlus.blockSiderite, world, random, chunkX, chunkZ, 32, 72, 1, 0, 70, Blocks.stone);
		generateOre(OreGenPlus.blockChalcopyrite, world, random, chunkX, chunkZ, 32, 72, 1, 0, 70, Blocks.stone);
		generateOre(OreGenPlus.blockCerussite, world, random, chunkX, chunkZ, 32, 72, 1, 0, 70, Blocks.stone);
		generateOre(OreGenPlus.blockSphalerite, world, random, chunkX, chunkZ, 32, 72, 1, 0, 70, Blocks.stone);
		generateOre(OreGenPlus.blockOrpiment, world, random, chunkX, chunkZ, 32, 72, 1, 0, 70, Blocks.stone);
		
		//Normal Ores
		generateOre(OreGenPlus.blockBauxite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockAzurite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockGoethite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockGalena, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockZincite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockAutunite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockSphene, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockCassiterite, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		generateOre(OreGenPlus.blockRelgar, world, random, chunkX, chunkZ, 4, 10, .5, 0, 60, Blocks.stone);
		
		//Rich Ores
		generateOre(OreGenPlus.blockMalachite, world, random, chunkX, chunkZ, 1, 2, .25, 0, 25, Blocks.stone);
		generateOre(OreGenPlus.blockMagnetite, world, random, chunkX, chunkZ, 1, 2, .25, 0, 25, Blocks.stone);
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize,
			int maxVeinSize, int chance, int minY, int maxY, Block generateIn) {
		int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}
