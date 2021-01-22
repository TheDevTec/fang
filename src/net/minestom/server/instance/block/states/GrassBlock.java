package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class GrassBlock {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.GRASS_BLOCK.addBlockAlternative(new BlockAlternative((short) 8, "snowy=true"));
        Block.GRASS_BLOCK.addBlockAlternative(new BlockAlternative((short) 9, "snowy=false"));
    }
}
