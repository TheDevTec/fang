package net.minestom.server.item;

import net.minestom.server.instance.block.Block;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

@SuppressWarnings({"deprecation"})
public enum Material {
    AIR("minecraft:air", 64, Block.AIR),

    STONE("minecraft:stone", 64, Block.STONE),

    GRANITE("minecraft:granite", 64, Block.GRANITE),

    POLISHED_GRANITE("minecraft:polished_granite", 64, Block.POLISHED_GRANITE),

    DIORITE("minecraft:diorite", 64, Block.DIORITE),

    POLISHED_DIORITE("minecraft:polished_diorite", 64, Block.POLISHED_DIORITE),

    ANDESITE("minecraft:andesite", 64, Block.ANDESITE),

    POLISHED_ANDESITE("minecraft:polished_andesite", 64, Block.POLISHED_ANDESITE),

    GRASS_BLOCK("minecraft:grass_block", 64, Block.GRASS_BLOCK),

    DIRT("minecraft:dirt", 64, Block.DIRT),

    COARSE_DIRT("minecraft:coarse_dirt", 64, Block.COARSE_DIRT),

    PODZOL("minecraft:podzol", 64, Block.PODZOL),

    CRIMSON_NYLIUM("minecraft:crimson_nylium", 64, Block.CRIMSON_NYLIUM),

    WARPED_NYLIUM("minecraft:warped_nylium", 64, Block.WARPED_NYLIUM),

    COBBLESTONE("minecraft:cobblestone", 64, Block.COBBLESTONE),

    OAK_PLANKS("minecraft:oak_planks", 64, Block.OAK_PLANKS),

    SPRUCE_PLANKS("minecraft:spruce_planks", 64, Block.SPRUCE_PLANKS),

    BIRCH_PLANKS("minecraft:birch_planks", 64, Block.BIRCH_PLANKS),

    JUNGLE_PLANKS("minecraft:jungle_planks", 64, Block.JUNGLE_PLANKS),

    ACACIA_PLANKS("minecraft:acacia_planks", 64, Block.ACACIA_PLANKS),

    DARK_OAK_PLANKS("minecraft:dark_oak_planks", 64, Block.DARK_OAK_PLANKS),

    CRIMSON_PLANKS("minecraft:crimson_planks", 64, Block.CRIMSON_PLANKS),

    WARPED_PLANKS("minecraft:warped_planks", 64, Block.WARPED_PLANKS),

    OAK_SAPLING("minecraft:oak_sapling", 64, Block.OAK_SAPLING),

    SPRUCE_SAPLING("minecraft:spruce_sapling", 64, Block.SPRUCE_SAPLING),

    BIRCH_SAPLING("minecraft:birch_sapling", 64, Block.BIRCH_SAPLING),

    JUNGLE_SAPLING("minecraft:jungle_sapling", 64, Block.JUNGLE_SAPLING),

    ACACIA_SAPLING("minecraft:acacia_sapling", 64, Block.ACACIA_SAPLING),

    DARK_OAK_SAPLING("minecraft:dark_oak_sapling", 64, Block.DARK_OAK_SAPLING),

    BEDROCK("minecraft:bedrock", 64, Block.BEDROCK),

    SAND("minecraft:sand", 64, Block.SAND),

    RED_SAND("minecraft:red_sand", 64, Block.RED_SAND),

    GRAVEL("minecraft:gravel", 64, Block.GRAVEL),

    GOLD_ORE("minecraft:gold_ore", 64, Block.GOLD_ORE),

    IRON_ORE("minecraft:iron_ore", 64, Block.IRON_ORE),

    COAL_ORE("minecraft:coal_ore", 64, Block.COAL_ORE),

    NETHER_GOLD_ORE("minecraft:nether_gold_ore", 64, Block.NETHER_GOLD_ORE),

    OAK_LOG("minecraft:oak_log", 64, Block.OAK_LOG),

    SPRUCE_LOG("minecraft:spruce_log", 64, Block.SPRUCE_LOG),

    BIRCH_LOG("minecraft:birch_log", 64, Block.BIRCH_LOG),

    JUNGLE_LOG("minecraft:jungle_log", 64, Block.JUNGLE_LOG),

    ACACIA_LOG("minecraft:acacia_log", 64, Block.ACACIA_LOG),

    DARK_OAK_LOG("minecraft:dark_oak_log", 64, Block.DARK_OAK_LOG),

    CRIMSON_STEM("minecraft:crimson_stem", 64, Block.CRIMSON_STEM),

    WARPED_STEM("minecraft:warped_stem", 64, Block.WARPED_STEM),

    STRIPPED_OAK_LOG("minecraft:stripped_oak_log", 64, Block.STRIPPED_OAK_LOG),

    STRIPPED_SPRUCE_LOG("minecraft:stripped_spruce_log", 64, Block.STRIPPED_SPRUCE_LOG),

    STRIPPED_BIRCH_LOG("minecraft:stripped_birch_log", 64, Block.STRIPPED_BIRCH_LOG),

    STRIPPED_JUNGLE_LOG("minecraft:stripped_jungle_log", 64, Block.STRIPPED_JUNGLE_LOG),

    STRIPPED_ACACIA_LOG("minecraft:stripped_acacia_log", 64, Block.STRIPPED_ACACIA_LOG),

    STRIPPED_DARK_OAK_LOG("minecraft:stripped_dark_oak_log", 64, Block.STRIPPED_DARK_OAK_LOG),

    STRIPPED_CRIMSON_STEM("minecraft:stripped_crimson_stem", 64, Block.STRIPPED_CRIMSON_STEM),

    STRIPPED_WARPED_STEM("minecraft:stripped_warped_stem", 64, Block.STRIPPED_WARPED_STEM),

    STRIPPED_OAK_WOOD("minecraft:stripped_oak_wood", 64, Block.STRIPPED_OAK_WOOD),

    STRIPPED_SPRUCE_WOOD("minecraft:stripped_spruce_wood", 64, Block.STRIPPED_SPRUCE_WOOD),

    STRIPPED_BIRCH_WOOD("minecraft:stripped_birch_wood", 64, Block.STRIPPED_BIRCH_WOOD),

    STRIPPED_JUNGLE_WOOD("minecraft:stripped_jungle_wood", 64, Block.STRIPPED_JUNGLE_WOOD),

    STRIPPED_ACACIA_WOOD("minecraft:stripped_acacia_wood", 64, Block.STRIPPED_ACACIA_WOOD),

    STRIPPED_DARK_OAK_WOOD("minecraft:stripped_dark_oak_wood", 64, Block.STRIPPED_DARK_OAK_WOOD),

    STRIPPED_CRIMSON_HYPHAE("minecraft:stripped_crimson_hyphae", 64, Block.STRIPPED_CRIMSON_HYPHAE),

    STRIPPED_WARPED_HYPHAE("minecraft:stripped_warped_hyphae", 64, Block.STRIPPED_WARPED_HYPHAE),

    OAK_WOOD("minecraft:oak_wood", 64, Block.OAK_WOOD),

    SPRUCE_WOOD("minecraft:spruce_wood", 64, Block.SPRUCE_WOOD),

    BIRCH_WOOD("minecraft:birch_wood", 64, Block.BIRCH_WOOD),

    JUNGLE_WOOD("minecraft:jungle_wood", 64, Block.JUNGLE_WOOD),

    ACACIA_WOOD("minecraft:acacia_wood", 64, Block.ACACIA_WOOD),

    DARK_OAK_WOOD("minecraft:dark_oak_wood", 64, Block.DARK_OAK_WOOD),

    CRIMSON_HYPHAE("minecraft:crimson_hyphae", 64, Block.CRIMSON_HYPHAE),

    WARPED_HYPHAE("minecraft:warped_hyphae", 64, Block.WARPED_HYPHAE),

    OAK_LEAVES("minecraft:oak_leaves", 64, Block.OAK_LEAVES),

    SPRUCE_LEAVES("minecraft:spruce_leaves", 64, Block.SPRUCE_LEAVES),

    BIRCH_LEAVES("minecraft:birch_leaves", 64, Block.BIRCH_LEAVES),

    JUNGLE_LEAVES("minecraft:jungle_leaves", 64, Block.JUNGLE_LEAVES),

    ACACIA_LEAVES("minecraft:acacia_leaves", 64, Block.ACACIA_LEAVES),

    DARK_OAK_LEAVES("minecraft:dark_oak_leaves", 64, Block.DARK_OAK_LEAVES),

    SPONGE("minecraft:sponge", 64, Block.SPONGE),

    WET_SPONGE("minecraft:wet_sponge", 64, Block.WET_SPONGE),

    GLASS("minecraft:glass", 64, Block.GLASS),

    LAPIS_ORE("minecraft:lapis_ore", 64, Block.LAPIS_ORE),

    LAPIS_BLOCK("minecraft:lapis_block", 64, Block.LAPIS_BLOCK),

    DISPENSER("minecraft:dispenser", 64, Block.DISPENSER),

    SANDSTONE("minecraft:sandstone", 64, Block.SANDSTONE),

    CHISELED_SANDSTONE("minecraft:chiseled_sandstone", 64, Block.CHISELED_SANDSTONE),

    CUT_SANDSTONE("minecraft:cut_sandstone", 64, Block.CUT_SANDSTONE),

    NOTE_BLOCK("minecraft:note_block", 64, Block.NOTE_BLOCK),

    POWERED_RAIL("minecraft:powered_rail", 64, Block.POWERED_RAIL),

    DETECTOR_RAIL("minecraft:detector_rail", 64, Block.DETECTOR_RAIL),

    STICKY_PISTON("minecraft:sticky_piston", 64, Block.STICKY_PISTON),

    COBWEB("minecraft:cobweb", 64, Block.COBWEB),

    GRASS("minecraft:grass", 64, Block.GRASS),

    FERN("minecraft:fern", 64, Block.FERN),

    DEAD_BUSH("minecraft:dead_bush", 64, Block.DEAD_BUSH),

    SEAGRASS("minecraft:seagrass", 64, Block.SEAGRASS),

    SEA_PICKLE("minecraft:sea_pickle", 64, Block.SEA_PICKLE),

    PISTON("minecraft:piston", 64, Block.PISTON),

    WHITE_WOOL("minecraft:white_wool", 64, Block.WHITE_WOOL),

    ORANGE_WOOL("minecraft:orange_wool", 64, Block.ORANGE_WOOL),

    MAGENTA_WOOL("minecraft:magenta_wool", 64, Block.MAGENTA_WOOL),

    LIGHT_BLUE_WOOL("minecraft:light_blue_wool", 64, Block.LIGHT_BLUE_WOOL),

    YELLOW_WOOL("minecraft:yellow_wool", 64, Block.YELLOW_WOOL),

    LIME_WOOL("minecraft:lime_wool", 64, Block.LIME_WOOL),

    PINK_WOOL("minecraft:pink_wool", 64, Block.PINK_WOOL),

    GRAY_WOOL("minecraft:gray_wool", 64, Block.GRAY_WOOL),

    LIGHT_GRAY_WOOL("minecraft:light_gray_wool", 64, Block.LIGHT_GRAY_WOOL),

    CYAN_WOOL("minecraft:cyan_wool", 64, Block.CYAN_WOOL),

    PURPLE_WOOL("minecraft:purple_wool", 64, Block.PURPLE_WOOL),

    BLUE_WOOL("minecraft:blue_wool", 64, Block.BLUE_WOOL),

    BROWN_WOOL("minecraft:brown_wool", 64, Block.BROWN_WOOL),

    GREEN_WOOL("minecraft:green_wool", 64, Block.GREEN_WOOL),

    RED_WOOL("minecraft:red_wool", 64, Block.RED_WOOL),

    BLACK_WOOL("minecraft:black_wool", 64, Block.BLACK_WOOL),

    DANDELION("minecraft:dandelion", 64, Block.DANDELION),

    POPPY("minecraft:poppy", 64, Block.POPPY),

    BLUE_ORCHID("minecraft:blue_orchid", 64, Block.BLUE_ORCHID),

    ALLIUM("minecraft:allium", 64, Block.ALLIUM),

    AZURE_BLUET("minecraft:azure_bluet", 64, Block.AZURE_BLUET),

    RED_TULIP("minecraft:red_tulip", 64, Block.RED_TULIP),

    ORANGE_TULIP("minecraft:orange_tulip", 64, Block.ORANGE_TULIP),

    WHITE_TULIP("minecraft:white_tulip", 64, Block.WHITE_TULIP),

    PINK_TULIP("minecraft:pink_tulip", 64, Block.PINK_TULIP),

    OXEYE_DAISY("minecraft:oxeye_daisy", 64, Block.OXEYE_DAISY),

    CORNFLOWER("minecraft:cornflower", 64, Block.CORNFLOWER),

    LILY_OF_THE_VALLEY("minecraft:lily_of_the_valley", 64, Block.LILY_OF_THE_VALLEY),

    WITHER_ROSE("minecraft:wither_rose", 64, Block.WITHER_ROSE),

    BROWN_MUSHROOM("minecraft:brown_mushroom", 64, Block.BROWN_MUSHROOM),

    RED_MUSHROOM("minecraft:red_mushroom", 64, Block.RED_MUSHROOM),

    CRIMSON_FUNGUS("minecraft:crimson_fungus", 64, Block.CRIMSON_FUNGUS),

    WARPED_FUNGUS("minecraft:warped_fungus", 64, Block.WARPED_FUNGUS),

    CRIMSON_ROOTS("minecraft:crimson_roots", 64, Block.CRIMSON_ROOTS),

    WARPED_ROOTS("minecraft:warped_roots", 64, Block.WARPED_ROOTS),

    NETHER_SPROUTS("minecraft:nether_sprouts", 64, Block.NETHER_SPROUTS),

    WEEPING_VINES("minecraft:weeping_vines", 64, Block.WEEPING_VINES),

    TWISTING_VINES("minecraft:twisting_vines", 64, Block.TWISTING_VINES),

    SUGAR_CANE("minecraft:sugar_cane", 64, Block.SUGAR_CANE),

    KELP("minecraft:kelp", 64, Block.KELP),

    BAMBOO("minecraft:bamboo", 64, Block.BAMBOO),

    GOLD_BLOCK("minecraft:gold_block", 64, Block.GOLD_BLOCK),

    IRON_BLOCK("minecraft:iron_block", 64, Block.IRON_BLOCK),

    OAK_SLAB("minecraft:oak_slab", 64, Block.OAK_SLAB),

    SPRUCE_SLAB("minecraft:spruce_slab", 64, Block.SPRUCE_SLAB),

    BIRCH_SLAB("minecraft:birch_slab", 64, Block.BIRCH_SLAB),

    JUNGLE_SLAB("minecraft:jungle_slab", 64, Block.JUNGLE_SLAB),

    ACACIA_SLAB("minecraft:acacia_slab", 64, Block.ACACIA_SLAB),

    DARK_OAK_SLAB("minecraft:dark_oak_slab", 64, Block.DARK_OAK_SLAB),

    CRIMSON_SLAB("minecraft:crimson_slab", 64, Block.CRIMSON_SLAB),

    WARPED_SLAB("minecraft:warped_slab", 64, Block.WARPED_SLAB),

    STONE_SLAB("minecraft:stone_slab", 64, Block.STONE_SLAB),

    SMOOTH_STONE_SLAB("minecraft:smooth_stone_slab", 64, Block.SMOOTH_STONE_SLAB),

    SANDSTONE_SLAB("minecraft:sandstone_slab", 64, Block.SANDSTONE_SLAB),

    CUT_SANDSTONE_SLAB("minecraft:cut_sandstone_slab", 64, Block.CUT_SANDSTONE_SLAB),

    PETRIFIED_OAK_SLAB("minecraft:petrified_oak_slab", 64, Block.PETRIFIED_OAK_SLAB),

    COBBLESTONE_SLAB("minecraft:cobblestone_slab", 64, Block.COBBLESTONE_SLAB),

    BRICK_SLAB("minecraft:brick_slab", 64, Block.BRICK_SLAB),

    STONE_BRICK_SLAB("minecraft:stone_brick_slab", 64, Block.STONE_BRICK_SLAB),

    NETHER_BRICK_SLAB("minecraft:nether_brick_slab", 64, Block.NETHER_BRICK_SLAB),

    QUARTZ_SLAB("minecraft:quartz_slab", 64, Block.QUARTZ_SLAB),

    RED_SANDSTONE_SLAB("minecraft:red_sandstone_slab", 64, Block.RED_SANDSTONE_SLAB),

    CUT_RED_SANDSTONE_SLAB("minecraft:cut_red_sandstone_slab", 64, Block.CUT_RED_SANDSTONE_SLAB),

    PURPUR_SLAB("minecraft:purpur_slab", 64, Block.PURPUR_SLAB),

    PRISMARINE_SLAB("minecraft:prismarine_slab", 64, Block.PRISMARINE_SLAB),

    PRISMARINE_BRICK_SLAB("minecraft:prismarine_brick_slab", 64, Block.PRISMARINE_BRICK_SLAB),

    DARK_PRISMARINE_SLAB("minecraft:dark_prismarine_slab", 64, Block.DARK_PRISMARINE_SLAB),

    SMOOTH_QUARTZ("minecraft:smooth_quartz", 64, Block.SMOOTH_QUARTZ),

    SMOOTH_RED_SANDSTONE("minecraft:smooth_red_sandstone", 64, Block.SMOOTH_RED_SANDSTONE),

    SMOOTH_SANDSTONE("minecraft:smooth_sandstone", 64, Block.SMOOTH_SANDSTONE),

    SMOOTH_STONE("minecraft:smooth_stone", 64, Block.SMOOTH_STONE),

    BRICKS("minecraft:bricks", 64, Block.BRICKS),

    TNT("minecraft:tnt", 64, Block.TNT),

    BOOKSHELF("minecraft:bookshelf", 64, Block.BOOKSHELF),

    MOSSY_COBBLESTONE("minecraft:mossy_cobblestone", 64, Block.MOSSY_COBBLESTONE),

    OBSIDIAN("minecraft:obsidian", 64, Block.OBSIDIAN),

    TORCH("minecraft:torch", 64, Block.TORCH),

    END_ROD("minecraft:end_rod", 64, Block.END_ROD),

    CHORUS_PLANT("minecraft:chorus_plant", 64, Block.CHORUS_PLANT),

    CHORUS_FLOWER("minecraft:chorus_flower", 64, Block.CHORUS_FLOWER),

    PURPUR_BLOCK("minecraft:purpur_block", 64, Block.PURPUR_BLOCK),

    PURPUR_PILLAR("minecraft:purpur_pillar", 64, Block.PURPUR_PILLAR),

    PURPUR_STAIRS("minecraft:purpur_stairs", 64, Block.PURPUR_STAIRS),

    SPAWNER("minecraft:spawner", 64, Block.SPAWNER),

    OAK_STAIRS("minecraft:oak_stairs", 64, Block.OAK_STAIRS),

    CHEST("minecraft:chest", 64, Block.CHEST),

    DIAMOND_ORE("minecraft:diamond_ore", 64, Block.DIAMOND_ORE),

    DIAMOND_BLOCK("minecraft:diamond_block", 64, Block.DIAMOND_BLOCK),

    CRAFTING_TABLE("minecraft:crafting_table", 64, Block.CRAFTING_TABLE),

    FARMLAND("minecraft:farmland", 64, Block.FARMLAND),

    FURNACE("minecraft:furnace", 64, Block.FURNACE),

    LADDER("minecraft:ladder", 64, Block.LADDER),

    RAIL("minecraft:rail", 64, Block.RAIL),

    COBBLESTONE_STAIRS("minecraft:cobblestone_stairs", 64, Block.COBBLESTONE_STAIRS),

    LEVER("minecraft:lever", 64, Block.LEVER),

    STONE_PRESSURE_PLATE("minecraft:stone_pressure_plate", 64, Block.STONE_PRESSURE_PLATE),

    OAK_PRESSURE_PLATE("minecraft:oak_pressure_plate", 64, Block.OAK_PRESSURE_PLATE),

    SPRUCE_PRESSURE_PLATE("minecraft:spruce_pressure_plate", 64, Block.SPRUCE_PRESSURE_PLATE),

    BIRCH_PRESSURE_PLATE("minecraft:birch_pressure_plate", 64, Block.BIRCH_PRESSURE_PLATE),

    JUNGLE_PRESSURE_PLATE("minecraft:jungle_pressure_plate", 64, Block.JUNGLE_PRESSURE_PLATE),

    ACACIA_PRESSURE_PLATE("minecraft:acacia_pressure_plate", 64, Block.ACACIA_PRESSURE_PLATE),

    DARK_OAK_PRESSURE_PLATE("minecraft:dark_oak_pressure_plate", 64, Block.DARK_OAK_PRESSURE_PLATE),

    CRIMSON_PRESSURE_PLATE("minecraft:crimson_pressure_plate", 64, Block.CRIMSON_PRESSURE_PLATE),

    WARPED_PRESSURE_PLATE("minecraft:warped_pressure_plate", 64, Block.WARPED_PRESSURE_PLATE),

    POLISHED_BLACKSTONE_PRESSURE_PLATE("minecraft:polished_blackstone_pressure_plate", 64, Block.POLISHED_BLACKSTONE_PRESSURE_PLATE),

    REDSTONE_ORE("minecraft:redstone_ore", 64, Block.REDSTONE_ORE),

    REDSTONE_TORCH("minecraft:redstone_torch", 64, Block.REDSTONE_TORCH),

    SNOW("minecraft:snow", 64, Block.SNOW),

    ICE("minecraft:ice", 64, Block.ICE),

    SNOW_BLOCK("minecraft:snow_block", 64, Block.SNOW_BLOCK),

    CACTUS("minecraft:cactus", 64, Block.CACTUS),

    CLAY("minecraft:clay", 64, Block.CLAY),

    JUKEBOX("minecraft:jukebox", 64, Block.JUKEBOX),

    OAK_FENCE("minecraft:oak_fence", 64, Block.OAK_FENCE),

    SPRUCE_FENCE("minecraft:spruce_fence", 64, Block.SPRUCE_FENCE),

    BIRCH_FENCE("minecraft:birch_fence", 64, Block.BIRCH_FENCE),

    JUNGLE_FENCE("minecraft:jungle_fence", 64, Block.JUNGLE_FENCE),

    ACACIA_FENCE("minecraft:acacia_fence", 64, Block.ACACIA_FENCE),

    DARK_OAK_FENCE("minecraft:dark_oak_fence", 64, Block.DARK_OAK_FENCE),

    CRIMSON_FENCE("minecraft:crimson_fence", 64, Block.CRIMSON_FENCE),

    WARPED_FENCE("minecraft:warped_fence", 64, Block.WARPED_FENCE),

    PUMPKIN("minecraft:pumpkin", 64, Block.PUMPKIN),

    CARVED_PUMPKIN("minecraft:carved_pumpkin", 64, Block.CARVED_PUMPKIN),

    NETHERRACK("minecraft:netherrack", 64, Block.NETHERRACK),

    SOUL_SAND("minecraft:soul_sand", 64, Block.SOUL_SAND),

    SOUL_SOIL("minecraft:soul_soil", 64, Block.SOUL_SOIL),

    BASALT("minecraft:basalt", 64, Block.BASALT),

    POLISHED_BASALT("minecraft:polished_basalt", 64, Block.POLISHED_BASALT),

    SOUL_TORCH("minecraft:soul_torch", 64, Block.SOUL_TORCH),

    GLOWSTONE("minecraft:glowstone", 64, Block.GLOWSTONE),

    JACK_O_LANTERN("minecraft:jack_o_lantern", 64, Block.JACK_O_LANTERN),

    OAK_TRAPDOOR("minecraft:oak_trapdoor", 64, Block.OAK_TRAPDOOR),

    SPRUCE_TRAPDOOR("minecraft:spruce_trapdoor", 64, Block.SPRUCE_TRAPDOOR),

    BIRCH_TRAPDOOR("minecraft:birch_trapdoor", 64, Block.BIRCH_TRAPDOOR),

    JUNGLE_TRAPDOOR("minecraft:jungle_trapdoor", 64, Block.JUNGLE_TRAPDOOR),

    ACACIA_TRAPDOOR("minecraft:acacia_trapdoor", 64, Block.ACACIA_TRAPDOOR),

    DARK_OAK_TRAPDOOR("minecraft:dark_oak_trapdoor", 64, Block.DARK_OAK_TRAPDOOR),

    CRIMSON_TRAPDOOR("minecraft:crimson_trapdoor", 64, Block.CRIMSON_TRAPDOOR),

    WARPED_TRAPDOOR("minecraft:warped_trapdoor", 64, Block.WARPED_TRAPDOOR),

    INFESTED_STONE("minecraft:infested_stone", 64, Block.INFESTED_STONE),

    INFESTED_COBBLESTONE("minecraft:infested_cobblestone", 64, Block.INFESTED_COBBLESTONE),

    INFESTED_STONE_BRICKS("minecraft:infested_stone_bricks", 64, Block.INFESTED_STONE_BRICKS),

    INFESTED_MOSSY_STONE_BRICKS("minecraft:infested_mossy_stone_bricks", 64, Block.INFESTED_MOSSY_STONE_BRICKS),

    INFESTED_CRACKED_STONE_BRICKS("minecraft:infested_cracked_stone_bricks", 64, Block.INFESTED_CRACKED_STONE_BRICKS),

    INFESTED_CHISELED_STONE_BRICKS("minecraft:infested_chiseled_stone_bricks", 64, Block.INFESTED_CHISELED_STONE_BRICKS),

    STONE_BRICKS("minecraft:stone_bricks", 64, Block.STONE_BRICKS),

    MOSSY_STONE_BRICKS("minecraft:mossy_stone_bricks", 64, Block.MOSSY_STONE_BRICKS),

    CRACKED_STONE_BRICKS("minecraft:cracked_stone_bricks", 64, Block.CRACKED_STONE_BRICKS),

    CHISELED_STONE_BRICKS("minecraft:chiseled_stone_bricks", 64, Block.CHISELED_STONE_BRICKS),

    BROWN_MUSHROOM_BLOCK("minecraft:brown_mushroom_block", 64, Block.BROWN_MUSHROOM_BLOCK),

    RED_MUSHROOM_BLOCK("minecraft:red_mushroom_block", 64, Block.RED_MUSHROOM_BLOCK),

    MUSHROOM_STEM("minecraft:mushroom_stem", 64, Block.MUSHROOM_STEM),

    IRON_BARS("minecraft:iron_bars", 64, Block.IRON_BARS),

    CHAIN("minecraft:chain", 64, Block.CHAIN),

    GLASS_PANE("minecraft:glass_pane", 64, Block.GLASS_PANE),

    MELON("minecraft:melon", 64, Block.MELON),

    VINE("minecraft:vine", 64, Block.VINE),

    OAK_FENCE_GATE("minecraft:oak_fence_gate", 64, Block.OAK_FENCE_GATE),

    SPRUCE_FENCE_GATE("minecraft:spruce_fence_gate", 64, Block.SPRUCE_FENCE_GATE),

    BIRCH_FENCE_GATE("minecraft:birch_fence_gate", 64, Block.BIRCH_FENCE_GATE),

    JUNGLE_FENCE_GATE("minecraft:jungle_fence_gate", 64, Block.JUNGLE_FENCE_GATE),

    ACACIA_FENCE_GATE("minecraft:acacia_fence_gate", 64, Block.ACACIA_FENCE_GATE),

    DARK_OAK_FENCE_GATE("minecraft:dark_oak_fence_gate", 64, Block.DARK_OAK_FENCE_GATE),

    CRIMSON_FENCE_GATE("minecraft:crimson_fence_gate", 64, Block.CRIMSON_FENCE_GATE),

    WARPED_FENCE_GATE("minecraft:warped_fence_gate", 64, Block.WARPED_FENCE_GATE),

    BRICK_STAIRS("minecraft:brick_stairs", 64, Block.BRICK_STAIRS),

    STONE_BRICK_STAIRS("minecraft:stone_brick_stairs", 64, Block.STONE_BRICK_STAIRS),

    MYCELIUM("minecraft:mycelium", 64, Block.MYCELIUM),

    LILY_PAD("minecraft:lily_pad", 64, Block.LILY_PAD),

    NETHER_BRICKS("minecraft:nether_bricks", 64, Block.NETHER_BRICKS),

    CRACKED_NETHER_BRICKS("minecraft:cracked_nether_bricks", 64, Block.CRACKED_NETHER_BRICKS),

    CHISELED_NETHER_BRICKS("minecraft:chiseled_nether_bricks", 64, Block.CHISELED_NETHER_BRICKS),

    NETHER_BRICK_FENCE("minecraft:nether_brick_fence", 64, Block.NETHER_BRICK_FENCE),

    NETHER_BRICK_STAIRS("minecraft:nether_brick_stairs", 64, Block.NETHER_BRICK_STAIRS),

    ENCHANTING_TABLE("minecraft:enchanting_table", 64, Block.ENCHANTING_TABLE),

    END_PORTAL_FRAME("minecraft:end_portal_frame", 64, Block.END_PORTAL_FRAME),

    END_STONE("minecraft:end_stone", 64, Block.END_STONE),

    END_STONE_BRICKS("minecraft:end_stone_bricks", 64, Block.END_STONE_BRICKS),

    DRAGON_EGG("minecraft:dragon_egg", 64, Block.DRAGON_EGG),

    REDSTONE_LAMP("minecraft:redstone_lamp", 64, Block.REDSTONE_LAMP),

    SANDSTONE_STAIRS("minecraft:sandstone_stairs", 64, Block.SANDSTONE_STAIRS),

    EMERALD_ORE("minecraft:emerald_ore", 64, Block.EMERALD_ORE),

    ENDER_CHEST("minecraft:ender_chest", 64, Block.ENDER_CHEST),

    TRIPWIRE_HOOK("minecraft:tripwire_hook", 64, Block.TRIPWIRE_HOOK),

    EMERALD_BLOCK("minecraft:emerald_block", 64, Block.EMERALD_BLOCK),

    SPRUCE_STAIRS("minecraft:spruce_stairs", 64, Block.SPRUCE_STAIRS),

    BIRCH_STAIRS("minecraft:birch_stairs", 64, Block.BIRCH_STAIRS),

    JUNGLE_STAIRS("minecraft:jungle_stairs", 64, Block.JUNGLE_STAIRS),

    CRIMSON_STAIRS("minecraft:crimson_stairs", 64, Block.CRIMSON_STAIRS),

    WARPED_STAIRS("minecraft:warped_stairs", 64, Block.WARPED_STAIRS),

    COMMAND_BLOCK("minecraft:command_block", 64, Block.COMMAND_BLOCK),

    BEACON("minecraft:beacon", 64, Block.BEACON),

    COBBLESTONE_WALL("minecraft:cobblestone_wall", 64, Block.COBBLESTONE_WALL),

    MOSSY_COBBLESTONE_WALL("minecraft:mossy_cobblestone_wall", 64, Block.MOSSY_COBBLESTONE_WALL),

    BRICK_WALL("minecraft:brick_wall", 64, Block.BRICK_WALL),

    PRISMARINE_WALL("minecraft:prismarine_wall", 64, Block.PRISMARINE_WALL),

    RED_SANDSTONE_WALL("minecraft:red_sandstone_wall", 64, Block.RED_SANDSTONE_WALL),

    MOSSY_STONE_BRICK_WALL("minecraft:mossy_stone_brick_wall", 64, Block.MOSSY_STONE_BRICK_WALL),

    GRANITE_WALL("minecraft:granite_wall", 64, Block.GRANITE_WALL),

    STONE_BRICK_WALL("minecraft:stone_brick_wall", 64, Block.STONE_BRICK_WALL),

    NETHER_BRICK_WALL("minecraft:nether_brick_wall", 64, Block.NETHER_BRICK_WALL),

    ANDESITE_WALL("minecraft:andesite_wall", 64, Block.ANDESITE_WALL),

    RED_NETHER_BRICK_WALL("minecraft:red_nether_brick_wall", 64, Block.RED_NETHER_BRICK_WALL),

    SANDSTONE_WALL("minecraft:sandstone_wall", 64, Block.SANDSTONE_WALL),

    END_STONE_BRICK_WALL("minecraft:end_stone_brick_wall", 64, Block.END_STONE_BRICK_WALL),

    DIORITE_WALL("minecraft:diorite_wall", 64, Block.DIORITE_WALL),

    BLACKSTONE_WALL("minecraft:blackstone_wall", 64, Block.BLACKSTONE_WALL),

    POLISHED_BLACKSTONE_WALL("minecraft:polished_blackstone_wall", 64, Block.POLISHED_BLACKSTONE_WALL),

    POLISHED_BLACKSTONE_BRICK_WALL("minecraft:polished_blackstone_brick_wall", 64, Block.POLISHED_BLACKSTONE_BRICK_WALL),

    STONE_BUTTON("minecraft:stone_button", 64, Block.STONE_BUTTON),

    OAK_BUTTON("minecraft:oak_button", 64, Block.OAK_BUTTON),

    SPRUCE_BUTTON("minecraft:spruce_button", 64, Block.SPRUCE_BUTTON),

    BIRCH_BUTTON("minecraft:birch_button", 64, Block.BIRCH_BUTTON),

    JUNGLE_BUTTON("minecraft:jungle_button", 64, Block.JUNGLE_BUTTON),

    ACACIA_BUTTON("minecraft:acacia_button", 64, Block.ACACIA_BUTTON),

    DARK_OAK_BUTTON("minecraft:dark_oak_button", 64, Block.DARK_OAK_BUTTON),

    CRIMSON_BUTTON("minecraft:crimson_button", 64, Block.CRIMSON_BUTTON),

    WARPED_BUTTON("minecraft:warped_button", 64, Block.WARPED_BUTTON),

    POLISHED_BLACKSTONE_BUTTON("minecraft:polished_blackstone_button", 64, Block.POLISHED_BLACKSTONE_BUTTON),

    ANVIL("minecraft:anvil", 64, Block.ANVIL),

    CHIPPED_ANVIL("minecraft:chipped_anvil", 64, Block.CHIPPED_ANVIL),

    DAMAGED_ANVIL("minecraft:damaged_anvil", 64, Block.DAMAGED_ANVIL),

    TRAPPED_CHEST("minecraft:trapped_chest", 64, Block.TRAPPED_CHEST),

    LIGHT_WEIGHTED_PRESSURE_PLATE("minecraft:light_weighted_pressure_plate", 64, Block.LIGHT_WEIGHTED_PRESSURE_PLATE),

    HEAVY_WEIGHTED_PRESSURE_PLATE("minecraft:heavy_weighted_pressure_plate", 64, Block.HEAVY_WEIGHTED_PRESSURE_PLATE),

    DAYLIGHT_DETECTOR("minecraft:daylight_detector", 64, Block.DAYLIGHT_DETECTOR),

    REDSTONE_BLOCK("minecraft:redstone_block", 64, Block.REDSTONE_BLOCK),

    NETHER_QUARTZ_ORE("minecraft:nether_quartz_ore", 64, Block.NETHER_QUARTZ_ORE),

    HOPPER("minecraft:hopper", 64, Block.HOPPER),

    CHISELED_QUARTZ_BLOCK("minecraft:chiseled_quartz_block", 64, Block.CHISELED_QUARTZ_BLOCK),

    QUARTZ_BLOCK("minecraft:quartz_block", 64, Block.QUARTZ_BLOCK),

    QUARTZ_BRICKS("minecraft:quartz_bricks", 64, Block.QUARTZ_BRICKS),

    QUARTZ_PILLAR("minecraft:quartz_pillar", 64, Block.QUARTZ_PILLAR),

    QUARTZ_STAIRS("minecraft:quartz_stairs", 64, Block.QUARTZ_STAIRS),

    ACTIVATOR_RAIL("minecraft:activator_rail", 64, Block.ACTIVATOR_RAIL),

    DROPPER("minecraft:dropper", 64, Block.DROPPER),

    WHITE_TERRACOTTA("minecraft:white_terracotta", 64, Block.WHITE_TERRACOTTA),

    ORANGE_TERRACOTTA("minecraft:orange_terracotta", 64, Block.ORANGE_TERRACOTTA),

    MAGENTA_TERRACOTTA("minecraft:magenta_terracotta", 64, Block.MAGENTA_TERRACOTTA),

    LIGHT_BLUE_TERRACOTTA("minecraft:light_blue_terracotta", 64, Block.LIGHT_BLUE_TERRACOTTA),

    YELLOW_TERRACOTTA("minecraft:yellow_terracotta", 64, Block.YELLOW_TERRACOTTA),

    LIME_TERRACOTTA("minecraft:lime_terracotta", 64, Block.LIME_TERRACOTTA),

    PINK_TERRACOTTA("minecraft:pink_terracotta", 64, Block.PINK_TERRACOTTA),

    GRAY_TERRACOTTA("minecraft:gray_terracotta", 64, Block.GRAY_TERRACOTTA),

    LIGHT_GRAY_TERRACOTTA("minecraft:light_gray_terracotta", 64, Block.LIGHT_GRAY_TERRACOTTA),

    CYAN_TERRACOTTA("minecraft:cyan_terracotta", 64, Block.CYAN_TERRACOTTA),

    PURPLE_TERRACOTTA("minecraft:purple_terracotta", 64, Block.PURPLE_TERRACOTTA),

    BLUE_TERRACOTTA("minecraft:blue_terracotta", 64, Block.BLUE_TERRACOTTA),

    BROWN_TERRACOTTA("minecraft:brown_terracotta", 64, Block.BROWN_TERRACOTTA),

    GREEN_TERRACOTTA("minecraft:green_terracotta", 64, Block.GREEN_TERRACOTTA),

    RED_TERRACOTTA("minecraft:red_terracotta", 64, Block.RED_TERRACOTTA),

    BLACK_TERRACOTTA("minecraft:black_terracotta", 64, Block.BLACK_TERRACOTTA),

    BARRIER("minecraft:barrier", 64, Block.BARRIER),

    IRON_TRAPDOOR("minecraft:iron_trapdoor", 64, Block.IRON_TRAPDOOR),

    HAY_BLOCK("minecraft:hay_block", 64, Block.HAY_BLOCK),

    WHITE_CARPET("minecraft:white_carpet", 64, Block.WHITE_CARPET),

    ORANGE_CARPET("minecraft:orange_carpet", 64, Block.ORANGE_CARPET),

    MAGENTA_CARPET("minecraft:magenta_carpet", 64, Block.MAGENTA_CARPET),

    LIGHT_BLUE_CARPET("minecraft:light_blue_carpet", 64, Block.LIGHT_BLUE_CARPET),

    YELLOW_CARPET("minecraft:yellow_carpet", 64, Block.YELLOW_CARPET),

    LIME_CARPET("minecraft:lime_carpet", 64, Block.LIME_CARPET),

    PINK_CARPET("minecraft:pink_carpet", 64, Block.PINK_CARPET),

    GRAY_CARPET("minecraft:gray_carpet", 64, Block.GRAY_CARPET),

    LIGHT_GRAY_CARPET("minecraft:light_gray_carpet", 64, Block.LIGHT_GRAY_CARPET),

    CYAN_CARPET("minecraft:cyan_carpet", 64, Block.CYAN_CARPET),

    PURPLE_CARPET("minecraft:purple_carpet", 64, Block.PURPLE_CARPET),

    BLUE_CARPET("minecraft:blue_carpet", 64, Block.BLUE_CARPET),

    BROWN_CARPET("minecraft:brown_carpet", 64, Block.BROWN_CARPET),

    GREEN_CARPET("minecraft:green_carpet", 64, Block.GREEN_CARPET),

    RED_CARPET("minecraft:red_carpet", 64, Block.RED_CARPET),

    BLACK_CARPET("minecraft:black_carpet", 64, Block.BLACK_CARPET),

    TERRACOTTA("minecraft:terracotta", 64, Block.TERRACOTTA),

    COAL_BLOCK("minecraft:coal_block", 64, Block.COAL_BLOCK),

    PACKED_ICE("minecraft:packed_ice", 64, Block.PACKED_ICE),

    ACACIA_STAIRS("minecraft:acacia_stairs", 64, Block.ACACIA_STAIRS),

    DARK_OAK_STAIRS("minecraft:dark_oak_stairs", 64, Block.DARK_OAK_STAIRS),

    SLIME_BLOCK("minecraft:slime_block", 64, Block.SLIME_BLOCK),

    GRASS_PATH("minecraft:grass_path", 64, Block.GRASS_PATH),

    SUNFLOWER("minecraft:sunflower", 64, Block.SUNFLOWER),

    LILAC("minecraft:lilac", 64, Block.LILAC),

    ROSE_BUSH("minecraft:rose_bush", 64, Block.ROSE_BUSH),

    PEONY("minecraft:peony", 64, Block.PEONY),

    TALL_GRASS("minecraft:tall_grass", 64, Block.TALL_GRASS),

    LARGE_FERN("minecraft:large_fern", 64, Block.LARGE_FERN),

    WHITE_STAINED_GLASS("minecraft:white_stained_glass", 64, Block.WHITE_STAINED_GLASS),

    ORANGE_STAINED_GLASS("minecraft:orange_stained_glass", 64, Block.ORANGE_STAINED_GLASS),

    MAGENTA_STAINED_GLASS("minecraft:magenta_stained_glass", 64, Block.MAGENTA_STAINED_GLASS),

    LIGHT_BLUE_STAINED_GLASS("minecraft:light_blue_stained_glass", 64, Block.LIGHT_BLUE_STAINED_GLASS),

    YELLOW_STAINED_GLASS("minecraft:yellow_stained_glass", 64, Block.YELLOW_STAINED_GLASS),

    LIME_STAINED_GLASS("minecraft:lime_stained_glass", 64, Block.LIME_STAINED_GLASS),

    PINK_STAINED_GLASS("minecraft:pink_stained_glass", 64, Block.PINK_STAINED_GLASS),

    GRAY_STAINED_GLASS("minecraft:gray_stained_glass", 64, Block.GRAY_STAINED_GLASS),

    LIGHT_GRAY_STAINED_GLASS("minecraft:light_gray_stained_glass", 64, Block.LIGHT_GRAY_STAINED_GLASS),

    CYAN_STAINED_GLASS("minecraft:cyan_stained_glass", 64, Block.CYAN_STAINED_GLASS),

    PURPLE_STAINED_GLASS("minecraft:purple_stained_glass", 64, Block.PURPLE_STAINED_GLASS),

    BLUE_STAINED_GLASS("minecraft:blue_stained_glass", 64, Block.BLUE_STAINED_GLASS),

    BROWN_STAINED_GLASS("minecraft:brown_stained_glass", 64, Block.BROWN_STAINED_GLASS),

    GREEN_STAINED_GLASS("minecraft:green_stained_glass", 64, Block.GREEN_STAINED_GLASS),

    RED_STAINED_GLASS("minecraft:red_stained_glass", 64, Block.RED_STAINED_GLASS),

    BLACK_STAINED_GLASS("minecraft:black_stained_glass", 64, Block.BLACK_STAINED_GLASS),

    WHITE_STAINED_GLASS_PANE("minecraft:white_stained_glass_pane", 64, Block.WHITE_STAINED_GLASS_PANE),

    ORANGE_STAINED_GLASS_PANE("minecraft:orange_stained_glass_pane", 64, Block.ORANGE_STAINED_GLASS_PANE),

    MAGENTA_STAINED_GLASS_PANE("minecraft:magenta_stained_glass_pane", 64, Block.MAGENTA_STAINED_GLASS_PANE),

    LIGHT_BLUE_STAINED_GLASS_PANE("minecraft:light_blue_stained_glass_pane", 64, Block.LIGHT_BLUE_STAINED_GLASS_PANE),

    YELLOW_STAINED_GLASS_PANE("minecraft:yellow_stained_glass_pane", 64, Block.YELLOW_STAINED_GLASS_PANE),

    LIME_STAINED_GLASS_PANE("minecraft:lime_stained_glass_pane", 64, Block.LIME_STAINED_GLASS_PANE),

    PINK_STAINED_GLASS_PANE("minecraft:pink_stained_glass_pane", 64, Block.PINK_STAINED_GLASS_PANE),

    GRAY_STAINED_GLASS_PANE("minecraft:gray_stained_glass_pane", 64, Block.GRAY_STAINED_GLASS_PANE),

    LIGHT_GRAY_STAINED_GLASS_PANE("minecraft:light_gray_stained_glass_pane", 64, Block.LIGHT_GRAY_STAINED_GLASS_PANE),

    CYAN_STAINED_GLASS_PANE("minecraft:cyan_stained_glass_pane", 64, Block.CYAN_STAINED_GLASS_PANE),

    PURPLE_STAINED_GLASS_PANE("minecraft:purple_stained_glass_pane", 64, Block.PURPLE_STAINED_GLASS_PANE),

    BLUE_STAINED_GLASS_PANE("minecraft:blue_stained_glass_pane", 64, Block.BLUE_STAINED_GLASS_PANE),

    BROWN_STAINED_GLASS_PANE("minecraft:brown_stained_glass_pane", 64, Block.BROWN_STAINED_GLASS_PANE),

    GREEN_STAINED_GLASS_PANE("minecraft:green_stained_glass_pane", 64, Block.GREEN_STAINED_GLASS_PANE),

    RED_STAINED_GLASS_PANE("minecraft:red_stained_glass_pane", 64, Block.RED_STAINED_GLASS_PANE),

    BLACK_STAINED_GLASS_PANE("minecraft:black_stained_glass_pane", 64, Block.BLACK_STAINED_GLASS_PANE),

    PRISMARINE("minecraft:prismarine", 64, Block.PRISMARINE),

    PRISMARINE_BRICKS("minecraft:prismarine_bricks", 64, Block.PRISMARINE_BRICKS),

    DARK_PRISMARINE("minecraft:dark_prismarine", 64, Block.DARK_PRISMARINE),

    PRISMARINE_STAIRS("minecraft:prismarine_stairs", 64, Block.PRISMARINE_STAIRS),

    PRISMARINE_BRICK_STAIRS("minecraft:prismarine_brick_stairs", 64, Block.PRISMARINE_BRICK_STAIRS),

    DARK_PRISMARINE_STAIRS("minecraft:dark_prismarine_stairs", 64, Block.DARK_PRISMARINE_STAIRS),

    SEA_LANTERN("minecraft:sea_lantern", 64, Block.SEA_LANTERN),

    RED_SANDSTONE("minecraft:red_sandstone", 64, Block.RED_SANDSTONE),

    CHISELED_RED_SANDSTONE("minecraft:chiseled_red_sandstone", 64, Block.CHISELED_RED_SANDSTONE),

    CUT_RED_SANDSTONE("minecraft:cut_red_sandstone", 64, Block.CUT_RED_SANDSTONE),

    RED_SANDSTONE_STAIRS("minecraft:red_sandstone_stairs", 64, Block.RED_SANDSTONE_STAIRS),

    REPEATING_COMMAND_BLOCK("minecraft:repeating_command_block", 64, Block.REPEATING_COMMAND_BLOCK),

    CHAIN_COMMAND_BLOCK("minecraft:chain_command_block", 64, Block.CHAIN_COMMAND_BLOCK),

    MAGMA_BLOCK("minecraft:magma_block", 64, Block.MAGMA_BLOCK),

    NETHER_WART_BLOCK("minecraft:nether_wart_block", 64, Block.NETHER_WART_BLOCK),

    WARPED_WART_BLOCK("minecraft:warped_wart_block", 64, Block.WARPED_WART_BLOCK),

    RED_NETHER_BRICKS("minecraft:red_nether_bricks", 64, Block.RED_NETHER_BRICKS),

    BONE_BLOCK("minecraft:bone_block", 64, Block.BONE_BLOCK),

    STRUCTURE_VOID("minecraft:structure_void", 64, Block.STRUCTURE_VOID),

    OBSERVER("minecraft:observer", 64, Block.OBSERVER),

    SHULKER_BOX("minecraft:shulker_box", 1, Block.SHULKER_BOX),

    WHITE_SHULKER_BOX("minecraft:white_shulker_box", 1, Block.WHITE_SHULKER_BOX),

    ORANGE_SHULKER_BOX("minecraft:orange_shulker_box", 1, Block.ORANGE_SHULKER_BOX),

    MAGENTA_SHULKER_BOX("minecraft:magenta_shulker_box", 1, Block.MAGENTA_SHULKER_BOX),

    LIGHT_BLUE_SHULKER_BOX("minecraft:light_blue_shulker_box", 1, Block.LIGHT_BLUE_SHULKER_BOX),

    YELLOW_SHULKER_BOX("minecraft:yellow_shulker_box", 1, Block.YELLOW_SHULKER_BOX),

    LIME_SHULKER_BOX("minecraft:lime_shulker_box", 1, Block.LIME_SHULKER_BOX),

    PINK_SHULKER_BOX("minecraft:pink_shulker_box", 1, Block.PINK_SHULKER_BOX),

    GRAY_SHULKER_BOX("minecraft:gray_shulker_box", 1, Block.GRAY_SHULKER_BOX),

    LIGHT_GRAY_SHULKER_BOX("minecraft:light_gray_shulker_box", 1, Block.LIGHT_GRAY_SHULKER_BOX),

    CYAN_SHULKER_BOX("minecraft:cyan_shulker_box", 1, Block.CYAN_SHULKER_BOX),

    PURPLE_SHULKER_BOX("minecraft:purple_shulker_box", 1, Block.PURPLE_SHULKER_BOX),

    BLUE_SHULKER_BOX("minecraft:blue_shulker_box", 1, Block.BLUE_SHULKER_BOX),

    BROWN_SHULKER_BOX("minecraft:brown_shulker_box", 1, Block.BROWN_SHULKER_BOX),

    GREEN_SHULKER_BOX("minecraft:green_shulker_box", 1, Block.GREEN_SHULKER_BOX),

    RED_SHULKER_BOX("minecraft:red_shulker_box", 1, Block.RED_SHULKER_BOX),

    BLACK_SHULKER_BOX("minecraft:black_shulker_box", 1, Block.BLACK_SHULKER_BOX),

    WHITE_GLAZED_TERRACOTTA("minecraft:white_glazed_terracotta", 64, Block.WHITE_GLAZED_TERRACOTTA),

    ORANGE_GLAZED_TERRACOTTA("minecraft:orange_glazed_terracotta", 64, Block.ORANGE_GLAZED_TERRACOTTA),

    MAGENTA_GLAZED_TERRACOTTA("minecraft:magenta_glazed_terracotta", 64, Block.MAGENTA_GLAZED_TERRACOTTA),

    LIGHT_BLUE_GLAZED_TERRACOTTA("minecraft:light_blue_glazed_terracotta", 64, Block.LIGHT_BLUE_GLAZED_TERRACOTTA),

    YELLOW_GLAZED_TERRACOTTA("minecraft:yellow_glazed_terracotta", 64, Block.YELLOW_GLAZED_TERRACOTTA),

    LIME_GLAZED_TERRACOTTA("minecraft:lime_glazed_terracotta", 64, Block.LIME_GLAZED_TERRACOTTA),

    PINK_GLAZED_TERRACOTTA("minecraft:pink_glazed_terracotta", 64, Block.PINK_GLAZED_TERRACOTTA),

    GRAY_GLAZED_TERRACOTTA("minecraft:gray_glazed_terracotta", 64, Block.GRAY_GLAZED_TERRACOTTA),

    LIGHT_GRAY_GLAZED_TERRACOTTA("minecraft:light_gray_glazed_terracotta", 64, Block.LIGHT_GRAY_GLAZED_TERRACOTTA),

    CYAN_GLAZED_TERRACOTTA("minecraft:cyan_glazed_terracotta", 64, Block.CYAN_GLAZED_TERRACOTTA),

    PURPLE_GLAZED_TERRACOTTA("minecraft:purple_glazed_terracotta", 64, Block.PURPLE_GLAZED_TERRACOTTA),

    BLUE_GLAZED_TERRACOTTA("minecraft:blue_glazed_terracotta", 64, Block.BLUE_GLAZED_TERRACOTTA),

    BROWN_GLAZED_TERRACOTTA("minecraft:brown_glazed_terracotta", 64, Block.BROWN_GLAZED_TERRACOTTA),

    GREEN_GLAZED_TERRACOTTA("minecraft:green_glazed_terracotta", 64, Block.GREEN_GLAZED_TERRACOTTA),

    RED_GLAZED_TERRACOTTA("minecraft:red_glazed_terracotta", 64, Block.RED_GLAZED_TERRACOTTA),

    BLACK_GLAZED_TERRACOTTA("minecraft:black_glazed_terracotta", 64, Block.BLACK_GLAZED_TERRACOTTA),

    WHITE_CONCRETE("minecraft:white_concrete", 64, Block.WHITE_CONCRETE),

    ORANGE_CONCRETE("minecraft:orange_concrete", 64, Block.ORANGE_CONCRETE),

    MAGENTA_CONCRETE("minecraft:magenta_concrete", 64, Block.MAGENTA_CONCRETE),

    LIGHT_BLUE_CONCRETE("minecraft:light_blue_concrete", 64, Block.LIGHT_BLUE_CONCRETE),

    YELLOW_CONCRETE("minecraft:yellow_concrete", 64, Block.YELLOW_CONCRETE),

    LIME_CONCRETE("minecraft:lime_concrete", 64, Block.LIME_CONCRETE),

    PINK_CONCRETE("minecraft:pink_concrete", 64, Block.PINK_CONCRETE),

    GRAY_CONCRETE("minecraft:gray_concrete", 64, Block.GRAY_CONCRETE),

    LIGHT_GRAY_CONCRETE("minecraft:light_gray_concrete", 64, Block.LIGHT_GRAY_CONCRETE),

    CYAN_CONCRETE("minecraft:cyan_concrete", 64, Block.CYAN_CONCRETE),

    PURPLE_CONCRETE("minecraft:purple_concrete", 64, Block.PURPLE_CONCRETE),

    BLUE_CONCRETE("minecraft:blue_concrete", 64, Block.BLUE_CONCRETE),

    BROWN_CONCRETE("minecraft:brown_concrete", 64, Block.BROWN_CONCRETE),

    GREEN_CONCRETE("minecraft:green_concrete", 64, Block.GREEN_CONCRETE),

    RED_CONCRETE("minecraft:red_concrete", 64, Block.RED_CONCRETE),

    BLACK_CONCRETE("minecraft:black_concrete", 64, Block.BLACK_CONCRETE),

    WHITE_CONCRETE_POWDER("minecraft:white_concrete_powder", 64, Block.WHITE_CONCRETE_POWDER),

    ORANGE_CONCRETE_POWDER("minecraft:orange_concrete_powder", 64, Block.ORANGE_CONCRETE_POWDER),

    MAGENTA_CONCRETE_POWDER("minecraft:magenta_concrete_powder", 64, Block.MAGENTA_CONCRETE_POWDER),

    LIGHT_BLUE_CONCRETE_POWDER("minecraft:light_blue_concrete_powder", 64, Block.LIGHT_BLUE_CONCRETE_POWDER),

    YELLOW_CONCRETE_POWDER("minecraft:yellow_concrete_powder", 64, Block.YELLOW_CONCRETE_POWDER),

    LIME_CONCRETE_POWDER("minecraft:lime_concrete_powder", 64, Block.LIME_CONCRETE_POWDER),

    PINK_CONCRETE_POWDER("minecraft:pink_concrete_powder", 64, Block.PINK_CONCRETE_POWDER),

    GRAY_CONCRETE_POWDER("minecraft:gray_concrete_powder", 64, Block.GRAY_CONCRETE_POWDER),

    LIGHT_GRAY_CONCRETE_POWDER("minecraft:light_gray_concrete_powder", 64, Block.LIGHT_GRAY_CONCRETE_POWDER),

    CYAN_CONCRETE_POWDER("minecraft:cyan_concrete_powder", 64, Block.CYAN_CONCRETE_POWDER),

    PURPLE_CONCRETE_POWDER("minecraft:purple_concrete_powder", 64, Block.PURPLE_CONCRETE_POWDER),

    BLUE_CONCRETE_POWDER("minecraft:blue_concrete_powder", 64, Block.BLUE_CONCRETE_POWDER),

    BROWN_CONCRETE_POWDER("minecraft:brown_concrete_powder", 64, Block.BROWN_CONCRETE_POWDER),

    GREEN_CONCRETE_POWDER("minecraft:green_concrete_powder", 64, Block.GREEN_CONCRETE_POWDER),

    RED_CONCRETE_POWDER("minecraft:red_concrete_powder", 64, Block.RED_CONCRETE_POWDER),

    BLACK_CONCRETE_POWDER("minecraft:black_concrete_powder", 64, Block.BLACK_CONCRETE_POWDER),

    TURTLE_EGG("minecraft:turtle_egg", 64, Block.TURTLE_EGG),

    DEAD_TUBE_CORAL_BLOCK("minecraft:dead_tube_coral_block", 64, Block.DEAD_TUBE_CORAL_BLOCK),

    DEAD_BRAIN_CORAL_BLOCK("minecraft:dead_brain_coral_block", 64, Block.DEAD_BRAIN_CORAL_BLOCK),

    DEAD_BUBBLE_CORAL_BLOCK("minecraft:dead_bubble_coral_block", 64, Block.DEAD_BUBBLE_CORAL_BLOCK),

    DEAD_FIRE_CORAL_BLOCK("minecraft:dead_fire_coral_block", 64, Block.DEAD_FIRE_CORAL_BLOCK),

    DEAD_HORN_CORAL_BLOCK("minecraft:dead_horn_coral_block", 64, Block.DEAD_HORN_CORAL_BLOCK),

    TUBE_CORAL_BLOCK("minecraft:tube_coral_block", 64, Block.TUBE_CORAL_BLOCK),

    BRAIN_CORAL_BLOCK("minecraft:brain_coral_block", 64, Block.BRAIN_CORAL_BLOCK),

    BUBBLE_CORAL_BLOCK("minecraft:bubble_coral_block", 64, Block.BUBBLE_CORAL_BLOCK),

    FIRE_CORAL_BLOCK("minecraft:fire_coral_block", 64, Block.FIRE_CORAL_BLOCK),

    HORN_CORAL_BLOCK("minecraft:horn_coral_block", 64, Block.HORN_CORAL_BLOCK),

    TUBE_CORAL("minecraft:tube_coral", 64, Block.TUBE_CORAL),

    BRAIN_CORAL("minecraft:brain_coral", 64, Block.BRAIN_CORAL),

    BUBBLE_CORAL("minecraft:bubble_coral", 64, Block.BUBBLE_CORAL),

    FIRE_CORAL("minecraft:fire_coral", 64, Block.FIRE_CORAL),

    HORN_CORAL("minecraft:horn_coral", 64, Block.HORN_CORAL),

    DEAD_BRAIN_CORAL("minecraft:dead_brain_coral", 64, Block.DEAD_BRAIN_CORAL),

    DEAD_BUBBLE_CORAL("minecraft:dead_bubble_coral", 64, Block.DEAD_BUBBLE_CORAL),

    DEAD_FIRE_CORAL("minecraft:dead_fire_coral", 64, Block.DEAD_FIRE_CORAL),

    DEAD_HORN_CORAL("minecraft:dead_horn_coral", 64, Block.DEAD_HORN_CORAL),

    DEAD_TUBE_CORAL("minecraft:dead_tube_coral", 64, Block.DEAD_TUBE_CORAL),

    TUBE_CORAL_FAN("minecraft:tube_coral_fan", 64, Block.TUBE_CORAL_FAN),

    BRAIN_CORAL_FAN("minecraft:brain_coral_fan", 64, Block.BRAIN_CORAL_FAN),

    BUBBLE_CORAL_FAN("minecraft:bubble_coral_fan", 64, Block.BUBBLE_CORAL_FAN),

    FIRE_CORAL_FAN("minecraft:fire_coral_fan", 64, Block.FIRE_CORAL_FAN),

    HORN_CORAL_FAN("minecraft:horn_coral_fan", 64, Block.HORN_CORAL_FAN),

    DEAD_TUBE_CORAL_FAN("minecraft:dead_tube_coral_fan", 64, Block.DEAD_TUBE_CORAL_FAN),

    DEAD_BRAIN_CORAL_FAN("minecraft:dead_brain_coral_fan", 64, Block.DEAD_BRAIN_CORAL_FAN),

    DEAD_BUBBLE_CORAL_FAN("minecraft:dead_bubble_coral_fan", 64, Block.DEAD_BUBBLE_CORAL_FAN),

    DEAD_FIRE_CORAL_FAN("minecraft:dead_fire_coral_fan", 64, Block.DEAD_FIRE_CORAL_FAN),

    DEAD_HORN_CORAL_FAN("minecraft:dead_horn_coral_fan", 64, Block.DEAD_HORN_CORAL_FAN),

    BLUE_ICE("minecraft:blue_ice", 64, Block.BLUE_ICE),

    CONDUIT("minecraft:conduit", 64, Block.CONDUIT),

    POLISHED_GRANITE_STAIRS("minecraft:polished_granite_stairs", 64, Block.POLISHED_GRANITE_STAIRS),

    SMOOTH_RED_SANDSTONE_STAIRS("minecraft:smooth_red_sandstone_stairs", 64, Block.SMOOTH_RED_SANDSTONE_STAIRS),

    MOSSY_STONE_BRICK_STAIRS("minecraft:mossy_stone_brick_stairs", 64, Block.MOSSY_STONE_BRICK_STAIRS),

    POLISHED_DIORITE_STAIRS("minecraft:polished_diorite_stairs", 64, Block.POLISHED_DIORITE_STAIRS),

    MOSSY_COBBLESTONE_STAIRS("minecraft:mossy_cobblestone_stairs", 64, Block.MOSSY_COBBLESTONE_STAIRS),

    END_STONE_BRICK_STAIRS("minecraft:end_stone_brick_stairs", 64, Block.END_STONE_BRICK_STAIRS),

    STONE_STAIRS("minecraft:stone_stairs", 64, Block.STONE_STAIRS),

    SMOOTH_SANDSTONE_STAIRS("minecraft:smooth_sandstone_stairs", 64, Block.SMOOTH_SANDSTONE_STAIRS),

    SMOOTH_QUARTZ_STAIRS("minecraft:smooth_quartz_stairs", 64, Block.SMOOTH_QUARTZ_STAIRS),

    GRANITE_STAIRS("minecraft:granite_stairs", 64, Block.GRANITE_STAIRS),

    ANDESITE_STAIRS("minecraft:andesite_stairs", 64, Block.ANDESITE_STAIRS),

    RED_NETHER_BRICK_STAIRS("minecraft:red_nether_brick_stairs", 64, Block.RED_NETHER_BRICK_STAIRS),

    POLISHED_ANDESITE_STAIRS("minecraft:polished_andesite_stairs", 64, Block.POLISHED_ANDESITE_STAIRS),

    DIORITE_STAIRS("minecraft:diorite_stairs", 64, Block.DIORITE_STAIRS),

    POLISHED_GRANITE_SLAB("minecraft:polished_granite_slab", 64, Block.POLISHED_GRANITE_SLAB),

    SMOOTH_RED_SANDSTONE_SLAB("minecraft:smooth_red_sandstone_slab", 64, Block.SMOOTH_RED_SANDSTONE_SLAB),

    MOSSY_STONE_BRICK_SLAB("minecraft:mossy_stone_brick_slab", 64, Block.MOSSY_STONE_BRICK_SLAB),

    POLISHED_DIORITE_SLAB("minecraft:polished_diorite_slab", 64, Block.POLISHED_DIORITE_SLAB),

    MOSSY_COBBLESTONE_SLAB("minecraft:mossy_cobblestone_slab", 64, Block.MOSSY_COBBLESTONE_SLAB),

    END_STONE_BRICK_SLAB("minecraft:end_stone_brick_slab", 64, Block.END_STONE_BRICK_SLAB),

    SMOOTH_SANDSTONE_SLAB("minecraft:smooth_sandstone_slab", 64, Block.SMOOTH_SANDSTONE_SLAB),

    SMOOTH_QUARTZ_SLAB("minecraft:smooth_quartz_slab", 64, Block.SMOOTH_QUARTZ_SLAB),

    GRANITE_SLAB("minecraft:granite_slab", 64, Block.GRANITE_SLAB),

    ANDESITE_SLAB("minecraft:andesite_slab", 64, Block.ANDESITE_SLAB),

    RED_NETHER_BRICK_SLAB("minecraft:red_nether_brick_slab", 64, Block.RED_NETHER_BRICK_SLAB),

    POLISHED_ANDESITE_SLAB("minecraft:polished_andesite_slab", 64, Block.POLISHED_ANDESITE_SLAB),

    DIORITE_SLAB("minecraft:diorite_slab", 64, Block.DIORITE_SLAB),

    SCAFFOLDING("minecraft:scaffolding", 64, Block.SCAFFOLDING),

    IRON_DOOR("minecraft:iron_door", 64, Block.IRON_DOOR),

    OAK_DOOR("minecraft:oak_door", 64, Block.OAK_DOOR),

    SPRUCE_DOOR("minecraft:spruce_door", 64, Block.SPRUCE_DOOR),

    BIRCH_DOOR("minecraft:birch_door", 64, Block.BIRCH_DOOR),

    JUNGLE_DOOR("minecraft:jungle_door", 64, Block.JUNGLE_DOOR),

    ACACIA_DOOR("minecraft:acacia_door", 64, Block.ACACIA_DOOR),

    DARK_OAK_DOOR("minecraft:dark_oak_door", 64, Block.DARK_OAK_DOOR),

    CRIMSON_DOOR("minecraft:crimson_door", 64, Block.CRIMSON_DOOR),

    WARPED_DOOR("minecraft:warped_door", 64, Block.WARPED_DOOR),

    REPEATER("minecraft:repeater", 64, Block.REPEATER),

    COMPARATOR("minecraft:comparator", 64, Block.COMPARATOR),

    STRUCTURE_BLOCK("minecraft:structure_block", 64, Block.STRUCTURE_BLOCK),

    JIGSAW("minecraft:jigsaw", 64, Block.JIGSAW),

    TURTLE_HELMET("minecraft:turtle_helmet", 64, null),

    SCUTE("minecraft:scute", 64, null),

    FLINT_AND_STEEL("minecraft:flint_and_steel", 64, null),

    APPLE("minecraft:apple", 64, null),

    BOW("minecraft:bow", 64, null),

    ARROW("minecraft:arrow", 64, null),

    COAL("minecraft:coal", 64, null),

    CHARCOAL("minecraft:charcoal", 64, null),

    DIAMOND("minecraft:diamond", 64, null),

    IRON_INGOT("minecraft:iron_ingot", 64, null),

    GOLD_INGOT("minecraft:gold_ingot", 64, null),

    NETHERITE_INGOT("minecraft:netherite_ingot", 64, null),

    NETHERITE_SCRAP("minecraft:netherite_scrap", 64, null),

    WOODEN_SWORD("minecraft:wooden_sword", 64, null),

    WOODEN_SHOVEL("minecraft:wooden_shovel", 64, null),

    WOODEN_PICKAXE("minecraft:wooden_pickaxe", 64, null),

    WOODEN_AXE("minecraft:wooden_axe", 64, null),

    WOODEN_HOE("minecraft:wooden_hoe", 64, null),

    STONE_SWORD("minecraft:stone_sword", 64, null),

    STONE_SHOVEL("minecraft:stone_shovel", 64, null),

    STONE_PICKAXE("minecraft:stone_pickaxe", 64, null),

    STONE_AXE("minecraft:stone_axe", 64, null),

    STONE_HOE("minecraft:stone_hoe", 64, null),

    GOLDEN_SWORD("minecraft:golden_sword", 64, null),

    GOLDEN_SHOVEL("minecraft:golden_shovel", 64, null),

    GOLDEN_PICKAXE("minecraft:golden_pickaxe", 64, null),

    GOLDEN_AXE("minecraft:golden_axe", 64, null),

    GOLDEN_HOE("minecraft:golden_hoe", 64, null),

    IRON_SWORD("minecraft:iron_sword", 64, null),

    IRON_SHOVEL("minecraft:iron_shovel", 64, null),

    IRON_PICKAXE("minecraft:iron_pickaxe", 64, null),

    IRON_AXE("minecraft:iron_axe", 64, null),

    IRON_HOE("minecraft:iron_hoe", 64, null),

    DIAMOND_SWORD("minecraft:diamond_sword", 64, null),

    DIAMOND_SHOVEL("minecraft:diamond_shovel", 64, null),

    DIAMOND_PICKAXE("minecraft:diamond_pickaxe", 64, null),

    DIAMOND_AXE("minecraft:diamond_axe", 64, null),

    DIAMOND_HOE("minecraft:diamond_hoe", 64, null),

    NETHERITE_SWORD("minecraft:netherite_sword", 64, null),

    NETHERITE_SHOVEL("minecraft:netherite_shovel", 64, null),

    NETHERITE_PICKAXE("minecraft:netherite_pickaxe", 64, null),

    NETHERITE_AXE("minecraft:netherite_axe", 64, null),

    NETHERITE_HOE("minecraft:netherite_hoe", 64, null),

    STICK("minecraft:stick", 64, null),

    BOWL("minecraft:bowl", 64, null),

    MUSHROOM_STEW("minecraft:mushroom_stew", 1, null),

    STRING("minecraft:string", 64, null),

    FEATHER("minecraft:feather", 64, null),

    GUNPOWDER("minecraft:gunpowder", 64, null),

    WHEAT_SEEDS("minecraft:wheat_seeds", 64, null),

    WHEAT("minecraft:wheat", 64, Block.WHEAT),

    BREAD("minecraft:bread", 64, null),

    LEATHER_HELMET("minecraft:leather_helmet", 64, null),

    LEATHER_CHESTPLATE("minecraft:leather_chestplate", 64, null),

    LEATHER_LEGGINGS("minecraft:leather_leggings", 64, null),

    LEATHER_BOOTS("minecraft:leather_boots", 64, null),

    CHAINMAIL_HELMET("minecraft:chainmail_helmet", 64, null),

    CHAINMAIL_CHESTPLATE("minecraft:chainmail_chestplate", 64, null),

    CHAINMAIL_LEGGINGS("minecraft:chainmail_leggings", 64, null),

    CHAINMAIL_BOOTS("minecraft:chainmail_boots", 64, null),

    IRON_HELMET("minecraft:iron_helmet", 64, null),

    IRON_CHESTPLATE("minecraft:iron_chestplate", 64, null),

    IRON_LEGGINGS("minecraft:iron_leggings", 64, null),

    IRON_BOOTS("minecraft:iron_boots", 64, null),

    DIAMOND_HELMET("minecraft:diamond_helmet", 64, null),

    DIAMOND_CHESTPLATE("minecraft:diamond_chestplate", 64, null),

    DIAMOND_LEGGINGS("minecraft:diamond_leggings", 64, null),

    DIAMOND_BOOTS("minecraft:diamond_boots", 64, null),

    GOLDEN_HELMET("minecraft:golden_helmet", 64, null),

    GOLDEN_CHESTPLATE("minecraft:golden_chestplate", 64, null),

    GOLDEN_LEGGINGS("minecraft:golden_leggings", 64, null),

    GOLDEN_BOOTS("minecraft:golden_boots", 64, null),

    NETHERITE_HELMET("minecraft:netherite_helmet", 64, null),

    NETHERITE_CHESTPLATE("minecraft:netherite_chestplate", 64, null),

    NETHERITE_LEGGINGS("minecraft:netherite_leggings", 64, null),

    NETHERITE_BOOTS("minecraft:netherite_boots", 64, null),

    FLINT("minecraft:flint", 64, null),

    PORKCHOP("minecraft:porkchop", 64, null),

    COOKED_PORKCHOP("minecraft:cooked_porkchop", 64, null),

    PAINTING("minecraft:painting", 64, null),

    GOLDEN_APPLE("minecraft:golden_apple", 64, null),

    ENCHANTED_GOLDEN_APPLE("minecraft:enchanted_golden_apple", 64, null),

    OAK_SIGN("minecraft:oak_sign", 16, Block.OAK_SIGN),

    SPRUCE_SIGN("minecraft:spruce_sign", 16, Block.SPRUCE_SIGN),

    BIRCH_SIGN("minecraft:birch_sign", 16, Block.BIRCH_SIGN),

    JUNGLE_SIGN("minecraft:jungle_sign", 16, Block.JUNGLE_SIGN),

    ACACIA_SIGN("minecraft:acacia_sign", 16, Block.ACACIA_SIGN),

    DARK_OAK_SIGN("minecraft:dark_oak_sign", 16, Block.DARK_OAK_SIGN),

    CRIMSON_SIGN("minecraft:crimson_sign", 16, Block.CRIMSON_SIGN),

    WARPED_SIGN("minecraft:warped_sign", 16, Block.WARPED_SIGN),

    BUCKET("minecraft:bucket", 16, null),

    WATER_BUCKET("minecraft:water_bucket", 1, null),

    LAVA_BUCKET("minecraft:lava_bucket", 1, null),

    MINECART("minecraft:minecart", 1, null),

    SADDLE("minecraft:saddle", 1, null),

    REDSTONE("minecraft:redstone", 64, Block.REDSTONE_WIRE),

    SNOWBALL("minecraft:snowball", 16, null),

    OAK_BOAT("minecraft:oak_boat", 1, null),

    LEATHER("minecraft:leather", 64, null),

    MILK_BUCKET("minecraft:milk_bucket", 1, null),

    PUFFERFISH_BUCKET("minecraft:pufferfish_bucket", 1, null),

    SALMON_BUCKET("minecraft:salmon_bucket", 1, null),

    COD_BUCKET("minecraft:cod_bucket", 1, null),

    TROPICAL_FISH_BUCKET("minecraft:tropical_fish_bucket", 1, null),

    BRICK("minecraft:brick", 64, null),

    CLAY_BALL("minecraft:clay_ball", 64, null),

    DRIED_KELP_BLOCK("minecraft:dried_kelp_block", 64, Block.DRIED_KELP_BLOCK),

    PAPER("minecraft:paper", 64, null),

    BOOK("minecraft:book", 64, null),

    SLIME_BALL("minecraft:slime_ball", 64, null),

    CHEST_MINECART("minecraft:chest_minecart", 1, null),

    FURNACE_MINECART("minecraft:furnace_minecart", 1, null),

    EGG("minecraft:egg", 16, null),

    COMPASS("minecraft:compass", 64, null),

    FISHING_ROD("minecraft:fishing_rod", 64, null),

    CLOCK("minecraft:clock", 64, null),

    GLOWSTONE_DUST("minecraft:glowstone_dust", 64, null),

    COD("minecraft:cod", 64, null),

    SALMON("minecraft:salmon", 64, null),

    TROPICAL_FISH("minecraft:tropical_fish", 64, null),

    PUFFERFISH("minecraft:pufferfish", 64, null),

    COOKED_COD("minecraft:cooked_cod", 64, null),

    COOKED_SALMON("minecraft:cooked_salmon", 64, null),

    INK_SAC("minecraft:ink_sac", 64, null),

    COCOA_BEANS("minecraft:cocoa_beans", 64, null),

    LAPIS_LAZULI("minecraft:lapis_lazuli", 64, null),

    WHITE_DYE("minecraft:white_dye", 64, null),

    ORANGE_DYE("minecraft:orange_dye", 64, null),

    MAGENTA_DYE("minecraft:magenta_dye", 64, null),

    LIGHT_BLUE_DYE("minecraft:light_blue_dye", 64, null),

    YELLOW_DYE("minecraft:yellow_dye", 64, null),

    LIME_DYE("minecraft:lime_dye", 64, null),

    PINK_DYE("minecraft:pink_dye", 64, null),

    GRAY_DYE("minecraft:gray_dye", 64, null),

    LIGHT_GRAY_DYE("minecraft:light_gray_dye", 64, null),

    CYAN_DYE("minecraft:cyan_dye", 64, null),

    PURPLE_DYE("minecraft:purple_dye", 64, null),

    BLUE_DYE("minecraft:blue_dye", 64, null),

    BROWN_DYE("minecraft:brown_dye", 64, null),

    GREEN_DYE("minecraft:green_dye", 64, null),

    RED_DYE("minecraft:red_dye", 64, null),

    BLACK_DYE("minecraft:black_dye", 64, null),

    BONE_MEAL("minecraft:bone_meal", 64, null),

    BONE("minecraft:bone", 64, null),

    SUGAR("minecraft:sugar", 64, null),

    CAKE("minecraft:cake", 1, Block.CAKE),

    WHITE_BED("minecraft:white_bed", 1, Block.WHITE_BED),

    ORANGE_BED("minecraft:orange_bed", 1, Block.ORANGE_BED),

    MAGENTA_BED("minecraft:magenta_bed", 1, Block.MAGENTA_BED),

    LIGHT_BLUE_BED("minecraft:light_blue_bed", 1, Block.LIGHT_BLUE_BED),

    YELLOW_BED("minecraft:yellow_bed", 1, Block.YELLOW_BED),

    LIME_BED("minecraft:lime_bed", 1, Block.LIME_BED),

    PINK_BED("minecraft:pink_bed", 1, Block.PINK_BED),

    GRAY_BED("minecraft:gray_bed", 1, Block.GRAY_BED),

    LIGHT_GRAY_BED("minecraft:light_gray_bed", 1, Block.LIGHT_GRAY_BED),

    CYAN_BED("minecraft:cyan_bed", 1, Block.CYAN_BED),

    PURPLE_BED("minecraft:purple_bed", 1, Block.PURPLE_BED),

    BLUE_BED("minecraft:blue_bed", 1, Block.BLUE_BED),

    BROWN_BED("minecraft:brown_bed", 1, Block.BROWN_BED),

    GREEN_BED("minecraft:green_bed", 1, Block.GREEN_BED),

    RED_BED("minecraft:red_bed", 1, Block.RED_BED),

    BLACK_BED("minecraft:black_bed", 1, Block.BLACK_BED),

    COOKIE("minecraft:cookie", 64, null),

    FILLED_MAP("minecraft:filled_map", 64, null),

    SHEARS("minecraft:shears", 64, null),

    MELON_SLICE("minecraft:melon_slice", 64, null),

    DRIED_KELP("minecraft:dried_kelp", 64, null),

    PUMPKIN_SEEDS("minecraft:pumpkin_seeds", 64, null),

    MELON_SEEDS("minecraft:melon_seeds", 64, null),

    BEEF("minecraft:beef", 64, null),

    COOKED_BEEF("minecraft:cooked_beef", 64, null),

    CHICKEN("minecraft:chicken", 64, null),

    COOKED_CHICKEN("minecraft:cooked_chicken", 64, null),

    ROTTEN_FLESH("minecraft:rotten_flesh", 64, null),

    ENDER_PEARL("minecraft:ender_pearl", 16, null),

    BLAZE_ROD("minecraft:blaze_rod", 64, null),

    GHAST_TEAR("minecraft:ghast_tear", 64, null),

    GOLD_NUGGET("minecraft:gold_nugget", 64, null),

    NETHER_WART("minecraft:nether_wart", 64, Block.NETHER_WART),

    POTION("minecraft:potion", 1, null),

    GLASS_BOTTLE("minecraft:glass_bottle", 64, null),

    SPIDER_EYE("minecraft:spider_eye", 64, null),

    FERMENTED_SPIDER_EYE("minecraft:fermented_spider_eye", 64, null),

    BLAZE_POWDER("minecraft:blaze_powder", 64, null),

    MAGMA_CREAM("minecraft:magma_cream", 64, null),

    BREWING_STAND("minecraft:brewing_stand", 64, Block.BREWING_STAND),

    CAULDRON("minecraft:cauldron", 64, Block.CAULDRON),

    ENDER_EYE("minecraft:ender_eye", 64, null),

    GLISTERING_MELON_SLICE("minecraft:glistering_melon_slice", 64, null),

    BAT_SPAWN_EGG("minecraft:bat_spawn_egg", 64, null),

    BEE_SPAWN_EGG("minecraft:bee_spawn_egg", 64, null),

    BLAZE_SPAWN_EGG("minecraft:blaze_spawn_egg", 64, null),

    CAT_SPAWN_EGG("minecraft:cat_spawn_egg", 64, null),

    CAVE_SPIDER_SPAWN_EGG("minecraft:cave_spider_spawn_egg", 64, null),

    CHICKEN_SPAWN_EGG("minecraft:chicken_spawn_egg", 64, null),

    COD_SPAWN_EGG("minecraft:cod_spawn_egg", 64, null),

    COW_SPAWN_EGG("minecraft:cow_spawn_egg", 64, null),

    CREEPER_SPAWN_EGG("minecraft:creeper_spawn_egg", 64, null),

    DOLPHIN_SPAWN_EGG("minecraft:dolphin_spawn_egg", 64, null),

    DONKEY_SPAWN_EGG("minecraft:donkey_spawn_egg", 64, null),

    DROWNED_SPAWN_EGG("minecraft:drowned_spawn_egg", 64, null),

    ELDER_GUARDIAN_SPAWN_EGG("minecraft:elder_guardian_spawn_egg", 64, null),

    ENDERMAN_SPAWN_EGG("minecraft:enderman_spawn_egg", 64, null),

    ENDERMITE_SPAWN_EGG("minecraft:endermite_spawn_egg", 64, null),

    EVOKER_SPAWN_EGG("minecraft:evoker_spawn_egg", 64, null),

    FOX_SPAWN_EGG("minecraft:fox_spawn_egg", 64, null),

    GHAST_SPAWN_EGG("minecraft:ghast_spawn_egg", 64, null),

    GUARDIAN_SPAWN_EGG("minecraft:guardian_spawn_egg", 64, null),

    HOGLIN_SPAWN_EGG("minecraft:hoglin_spawn_egg", 64, null),

    HORSE_SPAWN_EGG("minecraft:horse_spawn_egg", 64, null),

    HUSK_SPAWN_EGG("minecraft:husk_spawn_egg", 64, null),

    LLAMA_SPAWN_EGG("minecraft:llama_spawn_egg", 64, null),

    MAGMA_CUBE_SPAWN_EGG("minecraft:magma_cube_spawn_egg", 64, null),

    MOOSHROOM_SPAWN_EGG("minecraft:mooshroom_spawn_egg", 64, null),

    MULE_SPAWN_EGG("minecraft:mule_spawn_egg", 64, null),

    OCELOT_SPAWN_EGG("minecraft:ocelot_spawn_egg", 64, null),

    PANDA_SPAWN_EGG("minecraft:panda_spawn_egg", 64, null),

    PARROT_SPAWN_EGG("minecraft:parrot_spawn_egg", 64, null),

    PHANTOM_SPAWN_EGG("minecraft:phantom_spawn_egg", 64, null),

    PIG_SPAWN_EGG("minecraft:pig_spawn_egg", 64, null),

    PIGLIN_SPAWN_EGG("minecraft:piglin_spawn_egg", 64, null),

    PIGLIN_BRUTE_SPAWN_EGG("minecraft:piglin_brute_spawn_egg", 64, null),

    PILLAGER_SPAWN_EGG("minecraft:pillager_spawn_egg", 64, null),

    POLAR_BEAR_SPAWN_EGG("minecraft:polar_bear_spawn_egg", 64, null),

    PUFFERFISH_SPAWN_EGG("minecraft:pufferfish_spawn_egg", 64, null),

    RABBIT_SPAWN_EGG("minecraft:rabbit_spawn_egg", 64, null),

    RAVAGER_SPAWN_EGG("minecraft:ravager_spawn_egg", 64, null),

    SALMON_SPAWN_EGG("minecraft:salmon_spawn_egg", 64, null),

    SHEEP_SPAWN_EGG("minecraft:sheep_spawn_egg", 64, null),

    SHULKER_SPAWN_EGG("minecraft:shulker_spawn_egg", 64, null),

    SILVERFISH_SPAWN_EGG("minecraft:silverfish_spawn_egg", 64, null),

    SKELETON_SPAWN_EGG("minecraft:skeleton_spawn_egg", 64, null),

    SKELETON_HORSE_SPAWN_EGG("minecraft:skeleton_horse_spawn_egg", 64, null),

    SLIME_SPAWN_EGG("minecraft:slime_spawn_egg", 64, null),

    SPIDER_SPAWN_EGG("minecraft:spider_spawn_egg", 64, null),

    SQUID_SPAWN_EGG("minecraft:squid_spawn_egg", 64, null),

    STRAY_SPAWN_EGG("minecraft:stray_spawn_egg", 64, null),

    STRIDER_SPAWN_EGG("minecraft:strider_spawn_egg", 64, null),

    TRADER_LLAMA_SPAWN_EGG("minecraft:trader_llama_spawn_egg", 64, null),

    TROPICAL_FISH_SPAWN_EGG("minecraft:tropical_fish_spawn_egg", 64, null),

    TURTLE_SPAWN_EGG("minecraft:turtle_spawn_egg", 64, null),

    VEX_SPAWN_EGG("minecraft:vex_spawn_egg", 64, null),

    VILLAGER_SPAWN_EGG("minecraft:villager_spawn_egg", 64, null),

    VINDICATOR_SPAWN_EGG("minecraft:vindicator_spawn_egg", 64, null),

    WANDERING_TRADER_SPAWN_EGG("minecraft:wandering_trader_spawn_egg", 64, null),

    WITCH_SPAWN_EGG("minecraft:witch_spawn_egg", 64, null),

    WITHER_SKELETON_SPAWN_EGG("minecraft:wither_skeleton_spawn_egg", 64, null),

    WOLF_SPAWN_EGG("minecraft:wolf_spawn_egg", 64, null),

    ZOGLIN_SPAWN_EGG("minecraft:zoglin_spawn_egg", 64, null),

    ZOMBIE_SPAWN_EGG("minecraft:zombie_spawn_egg", 64, null),

    ZOMBIE_HORSE_SPAWN_EGG("minecraft:zombie_horse_spawn_egg", 64, null),

    ZOMBIE_VILLAGER_SPAWN_EGG("minecraft:zombie_villager_spawn_egg", 64, null),

    ZOMBIFIED_PIGLIN_SPAWN_EGG("minecraft:zombified_piglin_spawn_egg", 64, null),

    EXPERIENCE_BOTTLE("minecraft:experience_bottle", 64, null),

    FIRE_CHARGE("minecraft:fire_charge", 64, null),

    WRITABLE_BOOK("minecraft:writable_book", 1, null),

    WRITTEN_BOOK("minecraft:written_book", 16, null),

    EMERALD("minecraft:emerald", 64, null),

    ITEM_FRAME("minecraft:item_frame", 64, null),

    FLOWER_POT("minecraft:flower_pot", 64, Block.FLOWER_POT),

    CARROT("minecraft:carrot", 64, null),

    POTATO("minecraft:potato", 64, null),

    BAKED_POTATO("minecraft:baked_potato", 64, null),

    POISONOUS_POTATO("minecraft:poisonous_potato", 64, null),

    MAP("minecraft:map", 64, null),

    GOLDEN_CARROT("minecraft:golden_carrot", 64, null),

    SKELETON_SKULL("minecraft:skeleton_skull", 64, Block.SKELETON_SKULL),

    WITHER_SKELETON_SKULL("minecraft:wither_skeleton_skull", 64, Block.WITHER_SKELETON_SKULL),

    PLAYER_HEAD("minecraft:player_head", 64, Block.PLAYER_HEAD),

    ZOMBIE_HEAD("minecraft:zombie_head", 64, Block.ZOMBIE_HEAD),

    CREEPER_HEAD("minecraft:creeper_head", 64, Block.CREEPER_HEAD),

    DRAGON_HEAD("minecraft:dragon_head", 64, Block.DRAGON_HEAD),

    CARROT_ON_A_STICK("minecraft:carrot_on_a_stick", 64, null),

    WARPED_FUNGUS_ON_A_STICK("minecraft:warped_fungus_on_a_stick", 64, null),

    NETHER_STAR("minecraft:nether_star", 64, null),

    PUMPKIN_PIE("minecraft:pumpkin_pie", 64, null),

    FIREWORK_ROCKET("minecraft:firework_rocket", 64, null),

    FIREWORK_STAR("minecraft:firework_star", 64, null),

    ENCHANTED_BOOK("minecraft:enchanted_book", 1, null),

    NETHER_BRICK("minecraft:nether_brick", 64, null),

    QUARTZ("minecraft:quartz", 64, null),

    TNT_MINECART("minecraft:tnt_minecart", 1, null),

    HOPPER_MINECART("minecraft:hopper_minecart", 1, null),

    PRISMARINE_SHARD("minecraft:prismarine_shard", 64, null),

    PRISMARINE_CRYSTALS("minecraft:prismarine_crystals", 64, null),

    RABBIT("minecraft:rabbit", 64, null),

    COOKED_RABBIT("minecraft:cooked_rabbit", 64, null),

    RABBIT_STEW("minecraft:rabbit_stew", 1, null),

    RABBIT_FOOT("minecraft:rabbit_foot", 64, null),

    RABBIT_HIDE("minecraft:rabbit_hide", 64, null),

    ARMOR_STAND("minecraft:armor_stand", 16, null),

    IRON_HORSE_ARMOR("minecraft:iron_horse_armor", 1, null),

    GOLDEN_HORSE_ARMOR("minecraft:golden_horse_armor", 1, null),

    DIAMOND_HORSE_ARMOR("minecraft:diamond_horse_armor", 1, null),

    LEATHER_HORSE_ARMOR("minecraft:leather_horse_armor", 1, null),

    LEAD("minecraft:lead", 64, null),

    NAME_TAG("minecraft:name_tag", 64, null),

    COMMAND_BLOCK_MINECART("minecraft:command_block_minecart", 1, null),

    MUTTON("minecraft:mutton", 64, null),

    COOKED_MUTTON("minecraft:cooked_mutton", 64, null),

    WHITE_BANNER("minecraft:white_banner", 16, Block.WHITE_BANNER),

    ORANGE_BANNER("minecraft:orange_banner", 16, Block.ORANGE_BANNER),

    MAGENTA_BANNER("minecraft:magenta_banner", 16, Block.MAGENTA_BANNER),

    LIGHT_BLUE_BANNER("minecraft:light_blue_banner", 16, Block.LIGHT_BLUE_BANNER),

    YELLOW_BANNER("minecraft:yellow_banner", 16, Block.YELLOW_BANNER),

    LIME_BANNER("minecraft:lime_banner", 16, Block.LIME_BANNER),

    PINK_BANNER("minecraft:pink_banner", 16, Block.PINK_BANNER),

    GRAY_BANNER("minecraft:gray_banner", 16, Block.GRAY_BANNER),

    LIGHT_GRAY_BANNER("minecraft:light_gray_banner", 16, Block.LIGHT_GRAY_BANNER),

    CYAN_BANNER("minecraft:cyan_banner", 16, Block.CYAN_BANNER),

    PURPLE_BANNER("minecraft:purple_banner", 16, Block.PURPLE_BANNER),

    BLUE_BANNER("minecraft:blue_banner", 16, Block.BLUE_BANNER),

    BROWN_BANNER("minecraft:brown_banner", 16, Block.BROWN_BANNER),

    GREEN_BANNER("minecraft:green_banner", 16, Block.GREEN_BANNER),

    RED_BANNER("minecraft:red_banner", 16, Block.RED_BANNER),

    BLACK_BANNER("minecraft:black_banner", 16, Block.BLACK_BANNER),

    END_CRYSTAL("minecraft:end_crystal", 64, null),

    CHORUS_FRUIT("minecraft:chorus_fruit", 64, null),

    POPPED_CHORUS_FRUIT("minecraft:popped_chorus_fruit", 64, null),

    BEETROOT("minecraft:beetroot", 64, null),

    BEETROOT_SEEDS("minecraft:beetroot_seeds", 64, null),

    BEETROOT_SOUP("minecraft:beetroot_soup", 1, null),

    DRAGON_BREATH("minecraft:dragon_breath", 64, null),

    SPLASH_POTION("minecraft:splash_potion", 1, null),

    SPECTRAL_ARROW("minecraft:spectral_arrow", 64, null),

    TIPPED_ARROW("minecraft:tipped_arrow", 64, null),

    LINGERING_POTION("minecraft:lingering_potion", 1, null),

    SHIELD("minecraft:shield", 64, null),

    ELYTRA("minecraft:elytra", 64, null),

    SPRUCE_BOAT("minecraft:spruce_boat", 1, null),

    BIRCH_BOAT("minecraft:birch_boat", 1, null),

    JUNGLE_BOAT("minecraft:jungle_boat", 1, null),

    ACACIA_BOAT("minecraft:acacia_boat", 1, null),

    DARK_OAK_BOAT("minecraft:dark_oak_boat", 1, null),

    TOTEM_OF_UNDYING("minecraft:totem_of_undying", 1, null),

    SHULKER_SHELL("minecraft:shulker_shell", 64, null),

    IRON_NUGGET("minecraft:iron_nugget", 64, null),

    KNOWLEDGE_BOOK("minecraft:knowledge_book", 1, null),

    DEBUG_STICK("minecraft:debug_stick", 1, null),

    MUSIC_DISC_13("minecraft:music_disc_13", 1, null),

    MUSIC_DISC_CAT("minecraft:music_disc_cat", 1, null),

    MUSIC_DISC_BLOCKS("minecraft:music_disc_blocks", 1, null),

    MUSIC_DISC_CHIRP("minecraft:music_disc_chirp", 1, null),

    MUSIC_DISC_FAR("minecraft:music_disc_far", 1, null),

    MUSIC_DISC_MALL("minecraft:music_disc_mall", 1, null),

    MUSIC_DISC_MELLOHI("minecraft:music_disc_mellohi", 1, null),

    MUSIC_DISC_STAL("minecraft:music_disc_stal", 1, null),

    MUSIC_DISC_STRAD("minecraft:music_disc_strad", 1, null),

    MUSIC_DISC_WARD("minecraft:music_disc_ward", 1, null),

    MUSIC_DISC_11("minecraft:music_disc_11", 1, null),

    MUSIC_DISC_WAIT("minecraft:music_disc_wait", 1, null),

    MUSIC_DISC_PIGSTEP("minecraft:music_disc_pigstep", 1, null),

    TRIDENT("minecraft:trident", 64, null),

    PHANTOM_MEMBRANE("minecraft:phantom_membrane", 64, null),

    NAUTILUS_SHELL("minecraft:nautilus_shell", 64, null),

    HEART_OF_THE_SEA("minecraft:heart_of_the_sea", 64, null),

    CROSSBOW("minecraft:crossbow", 1, null),

    SUSPICIOUS_STEW("minecraft:suspicious_stew", 1, null),

    LOOM("minecraft:loom", 64, Block.LOOM),

    FLOWER_BANNER_PATTERN("minecraft:flower_banner_pattern", 1, null),

    CREEPER_BANNER_PATTERN("minecraft:creeper_banner_pattern", 1, null),

    SKULL_BANNER_PATTERN("minecraft:skull_banner_pattern", 1, null),

    MOJANG_BANNER_PATTERN("minecraft:mojang_banner_pattern", 1, null),

    GLOBE_BANNER_PATTERN("minecraft:globe_banner_pattern", 1, null),

    PIGLIN_BANNER_PATTERN("minecraft:piglin_banner_pattern", 1, null),

    COMPOSTER("minecraft:composter", 64, Block.COMPOSTER),

    BARREL("minecraft:barrel", 64, Block.BARREL),

    SMOKER("minecraft:smoker", 64, Block.SMOKER),

    BLAST_FURNACE("minecraft:blast_furnace", 64, Block.BLAST_FURNACE),

    CARTOGRAPHY_TABLE("minecraft:cartography_table", 64, Block.CARTOGRAPHY_TABLE),

    FLETCHING_TABLE("minecraft:fletching_table", 64, Block.FLETCHING_TABLE),

    GRINDSTONE("minecraft:grindstone", 64, Block.GRINDSTONE),

    LECTERN("minecraft:lectern", 64, Block.LECTERN),

    SMITHING_TABLE("minecraft:smithing_table", 64, Block.SMITHING_TABLE),

    STONECUTTER("minecraft:stonecutter", 64, Block.STONECUTTER),

    BELL("minecraft:bell", 64, Block.BELL),

    LANTERN("minecraft:lantern", 64, Block.LANTERN),

    SOUL_LANTERN("minecraft:soul_lantern", 64, Block.SOUL_LANTERN),

    SWEET_BERRIES("minecraft:sweet_berries", 64, null),

    CAMPFIRE("minecraft:campfire", 64, Block.CAMPFIRE),

    SOUL_CAMPFIRE("minecraft:soul_campfire", 64, Block.SOUL_CAMPFIRE),

    SHROOMLIGHT("minecraft:shroomlight", 64, Block.SHROOMLIGHT),

    HONEYCOMB("minecraft:honeycomb", 64, null),

    BEE_NEST("minecraft:bee_nest", 64, Block.BEE_NEST),

    BEEHIVE("minecraft:beehive", 64, Block.BEEHIVE),

    HONEY_BOTTLE("minecraft:honey_bottle", 16, null),

    HONEY_BLOCK("minecraft:honey_block", 64, Block.HONEY_BLOCK),

    HONEYCOMB_BLOCK("minecraft:honeycomb_block", 64, Block.HONEYCOMB_BLOCK),

    LODESTONE("minecraft:lodestone", 64, Block.LODESTONE),

    NETHERITE_BLOCK("minecraft:netherite_block", 64, Block.NETHERITE_BLOCK),

    ANCIENT_DEBRIS("minecraft:ancient_debris", 64, Block.ANCIENT_DEBRIS),

    TARGET("minecraft:target", 64, Block.TARGET),

    CRYING_OBSIDIAN("minecraft:crying_obsidian", 64, Block.CRYING_OBSIDIAN),

    BLACKSTONE("minecraft:blackstone", 64, Block.BLACKSTONE),

    BLACKSTONE_SLAB("minecraft:blackstone_slab", 64, Block.BLACKSTONE_SLAB),

    BLACKSTONE_STAIRS("minecraft:blackstone_stairs", 64, Block.BLACKSTONE_STAIRS),

    GILDED_BLACKSTONE("minecraft:gilded_blackstone", 64, Block.GILDED_BLACKSTONE),

    POLISHED_BLACKSTONE("minecraft:polished_blackstone", 64, Block.POLISHED_BLACKSTONE),

    POLISHED_BLACKSTONE_SLAB("minecraft:polished_blackstone_slab", 64, Block.POLISHED_BLACKSTONE_SLAB),

    POLISHED_BLACKSTONE_STAIRS("minecraft:polished_blackstone_stairs", 64, Block.POLISHED_BLACKSTONE_STAIRS),

    CHISELED_POLISHED_BLACKSTONE("minecraft:chiseled_polished_blackstone", 64, Block.CHISELED_POLISHED_BLACKSTONE),

    POLISHED_BLACKSTONE_BRICKS("minecraft:polished_blackstone_bricks", 64, Block.POLISHED_BLACKSTONE_BRICKS),

    POLISHED_BLACKSTONE_BRICK_SLAB("minecraft:polished_blackstone_brick_slab", 64, Block.POLISHED_BLACKSTONE_BRICK_SLAB),

    POLISHED_BLACKSTONE_BRICK_STAIRS("minecraft:polished_blackstone_brick_stairs", 64, Block.POLISHED_BLACKSTONE_BRICK_STAIRS),

    CRACKED_POLISHED_BLACKSTONE_BRICKS("minecraft:cracked_polished_blackstone_bricks", 64, Block.CRACKED_POLISHED_BLACKSTONE_BRICKS),

    RESPAWN_ANCHOR("minecraft:respawn_anchor", 64, Block.RESPAWN_ANCHOR);

    private String namespaceID;

    private int maxDefaultStackSize;

    private Block correspondingBlock;

    Material(String namespaceID, int maxDefaultStackSize,
            Block correspondingBlock) {
        this.namespaceID = namespaceID;
        this.maxDefaultStackSize = maxDefaultStackSize;
        this.correspondingBlock = correspondingBlock;
        Registries.materials.put(NamespaceID.from(namespaceID), this);
    }

    public short getId() {
        return (short)ordinal();
    }

    public String getName() {
        return namespaceID;
    }

    public int getMaxDefaultStackSize() {
        return maxDefaultStackSize;
    }

    public boolean isBlock() {
        return correspondingBlock != null && this != AIR;
    }

    public Block getBlock() {
        return correspondingBlock;
    }

    public static Material fromId(short id) {
        if(id >= 0 && id < values().length) {
            return values()[id];
        }
        return AIR;
    }

    public boolean isHelmet() {
        return toString().endsWith("HELMET");
    }

    public boolean isChestplate() {
        return toString().endsWith("CHESTPLATE");
    }

    public boolean isLeggings() {
        return toString().endsWith("LEGGINGS");
    }

    public boolean isBoots() {
        return toString().endsWith("BOOTS");
    }

    public boolean isArmor() {
        return isChestplate() || isHelmet() || isLeggings() || isBoots();
    }

    public boolean isFood() {
        switch(this) {
            case APPLE:
            case MUSHROOM_STEW:
            case BREAD:
            case PORKCHOP:
            case COOKED_PORKCHOP:
            case GOLDEN_APPLE:
            case ENCHANTED_GOLDEN_APPLE:
            case COD:
            case SALMON:
            case TROPICAL_FISH:
            case PUFFERFISH:
            case COOKED_COD:
            case COOKED_SALMON:
            case CAKE:
            case COOKIE:
            case MELON_SLICE:
            case DRIED_KELP:
            case BEEF:
            case COOKED_BEEF:
            case CHICKEN:
            case COOKED_CHICKEN:
            case ROTTEN_FLESH:
            case SPIDER_EYE:
            case CARROT:
            case POTATO:
            case BAKED_POTATO:
            case POISONOUS_POTATO:
            case PUMPKIN_PIE:
            case RABBIT:
            case COOKED_RABBIT:
            case RABBIT_STEW:
            case MUTTON:
            case COOKED_MUTTON:
            case BEETROOT:
            case BEETROOT_SOUP:
            case SWEET_BERRIES:
            case HONEY_BOTTLE:
            case CHORUS_FRUIT:
            return true;
		default:
			break;
        }
        return false;
    }

    public boolean hasState() {
        switch(this) {
            case BOW:
            case TRIDENT:
            case CROSSBOW:
            case SHIELD:
            return true;
		default:
			break;
        }
        return isFood();
    }
}
