package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class LargeFern {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.LARGE_FERN.addBlockAlternative(new BlockAlternative((short) 7899, "half=upper"));
        Block.LARGE_FERN.addBlockAlternative(new BlockAlternative((short) 7900, "half=lower"));
    }
}
