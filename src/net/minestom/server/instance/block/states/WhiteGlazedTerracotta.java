package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
public final class WhiteGlazedTerracotta {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    public static void initStates() {
        Block.WHITE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9378, "facing=north"));
        Block.WHITE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9379, "facing=south"));
        Block.WHITE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9380, "facing=west"));
        Block.WHITE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9381, "facing=east"));
    }
}
