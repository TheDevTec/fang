package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class BirchPressurePlate {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.BIRCH_PRESSURE_PLATE.addBlockAlternative(new BlockAlternative((short) 3877, "powered=true"));
        Block.BIRCH_PRESSURE_PLATE.addBlockAlternative(new BlockAlternative((short) 3878, "powered=false"));
    }
}
