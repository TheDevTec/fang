package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class Mycelium {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.MYCELIUM.addBlockAlternative(new BlockAlternative((short) 5016, "snowy=true"));
        Block.MYCELIUM.addBlockAlternative(new BlockAlternative((short) 5017, "snowy=false"));
    }
}
