package me.devtec.fang.world;

import me.devtec.fang.data.Data;
import me.devtec.fang.data.DataType;
import net.minestom.server.MinecraftServer;
import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.ChunkGenerator;
import net.minestom.server.instance.InstanceContainer;
import net.minestom.server.instance.block.Block;
import net.minestom.server.storage.StorageLocation;
import net.minestom.server.storage.StorageOptions;
import net.minestom.server.utils.BlockPosition;
import net.minestom.server.utils.chunk.ChunkCallback;
import net.minestom.server.world.DimensionType;

import java.io.File;

public class World {
    private final String name;
    private final long seed;
    protected final InstanceContainer world;

    public void setBlock(BlockPosition pos, Block block) {
        world.setBlock(pos, block);
    }

    public void setBlock(int x, int y, int z, Block block) {
        if(world.isChunkLoaded(x>>4, z>>4))
        world.setBlock(x, y, z, block);
        else{
            world.loadChunk(x >> 4, z >> 4, new ChunkCallback() { //wait to load chunk
                @Override
                public void accept(Chunk chunk) {
                    world.setBlock(x, y, z, block);
                }
            });
        }
    }

    public World(String name, ChunkGenerator generator, DimensionType type, long seed) {
        this.name = name;
        if (!new File(name).exists()) {
            Data d = new Data(name + "/IDENTITY");
            d.set("seed", seed);
            d.save(DataType.YAML);
            this.seed = seed;
        } else {
            this.seed = new Data(name + "/IDENTITY").getLong("seed");
        }
        StorageLocation storageLocation = MinecraftServer.getStorageManager().getLocation(name, new StorageOptions().setCompression(true));
        world = MinecraftServer.getInstanceManager().createInstanceContainer(type, storageLocation);
        world.setChunkGenerator(generator);
        world.enableAutoChunkLoad(true);
    }

    public void save(){
        world.saveInstance();
    }

    public long getSeed(){
        return seed;
    }

    public String getName(){
        return name;
    }

    public void setChunkGenerator(ChunkGenerator gen){
        world.setChunkGenerator(gen);
    }

    public void loadChunk(int x, int z) {
        world.loadChunk(x, z);
    }

    public Chunk getChunkAt(int x, int z){
        return world.getChunk(x, z);
    }

    public void unloadChunk(int x, int z) {
        world.unloadChunk(x, z);
    }
}
