package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class TallGrass {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.TALL_GRASS.addBlockAlternative(new BlockAlternative((short) 7897, "half=upper"));
        Block.TALL_GRASS.addBlockAlternative(new BlockAlternative((short) 7898, "half=lower"));
    }
}
