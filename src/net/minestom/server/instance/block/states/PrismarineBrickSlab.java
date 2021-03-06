package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class PrismarineBrickSlab {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7854, "type=top", "waterlogged=true"));
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7855, "type=top", "waterlogged=false"));
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7856, "type=bottom", "waterlogged=true"));
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7857, "type=bottom", "waterlogged=false"));
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7858, "type=double", "waterlogged=true"));
        Block.PRISMARINE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 7859, "type=double", "waterlogged=false"));
    }
}
