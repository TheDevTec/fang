package net.minestom.server.event.instance;

import net.minestom.server.event.InstanceEvent;
import net.minestom.server.instance.Instance;

/**
 * Called when a chunk in an instance is unloaded.
 */
public class InstanceChunkUnloadEvent extends InstanceEvent {

    private final int chunkX, chunkZ;

    public InstanceChunkUnloadEvent(Instance instance, int chunkX, int chunkZ) {
        super(instance);
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
    }

    /**
     * Gets the chunk X.
     *
     * @return the chunk X
     */
    public int getChunkX() {
        return chunkX;
    }

    /**
     * Gets the chunk Z.
     *
     * @return the chunk Z
     */
    public int getChunkZ() {
        return chunkZ;
    }

}
