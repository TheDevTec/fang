package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class HornCoralFan {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9562, "waterlogged=true"));
        Block.HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9563, "waterlogged=false"));
    }
}
