package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class NetherBrickSlab {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8388, "type=top", "waterlogged=true"));
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8389, "type=top", "waterlogged=false"));
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8390, "type=bottom", "waterlogged=true"));
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8391, "type=bottom", "waterlogged=false"));
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8392, "type=double", "waterlogged=true"));
        Block.NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8393, "type=double", "waterlogged=false"));
    }
}
