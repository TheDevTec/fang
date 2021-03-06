package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */

public final class StrippedCrimsonStem {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */

    public static void initStates() {
        Block.STRIPPED_CRIMSON_STEM.addBlockAlternative(new BlockAlternative((short) 14986, "axis=x"));
        Block.STRIPPED_CRIMSON_STEM.addBlockAlternative(new BlockAlternative((short) 14987, "axis=y"));
        Block.STRIPPED_CRIMSON_STEM.addBlockAlternative(new BlockAlternative((short) 14988, "axis=z"));
    }
}
