package net.kender.blockexpansion.fabric;

import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

        // This logger is used to write text to the console and the log file.
        // It is considered best practice to use your mod id as the logger's name.
        // That way, it's clear which mod wrote info, warnings, and errors.
        public static final Logger LOGGER = LoggerFactory.getLogger("blockexpansion");

        public static final Block cut_netherite = new PillarBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));

        public static final Block dripstone_brick_pillar = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block cut_netherite_stairs = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));

        public static final Block diorite_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block chiseled_diorite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block cracked_basalt_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block diorite_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block cut_iron_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.IRON_BLOCK));

        public static final Block obsidian_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block cut_coal_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.COAL_BLOCK));

        public static final Block tuff_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block granite_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block chiseled_obsidian_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block cut_gold_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));

        public static final Block granite_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block dripstone_brick_wall = new WallBlock(
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block nether_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS));

        public static final Block amethyst_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block basalt_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block basalt_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block chiseled_tuff_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block cracked_purpur = new PillarBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));

        public static final Block andesite_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block cracked_dripstone_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block chiseled_andesite_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.ANDESITE));

        public static final Block cracked_red_nether_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS));

        public static final Block cut_iron = new PillarBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));

        public static final Block chiseled_basalt_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block calcite_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block andesite_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block tuff_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block obsidian_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block cut_redstone = new PillarBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));

        public static final Block amethyst_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block obsidian_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block cracked_diorite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block chiseled_purpur = new PillarBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));

        public static final Block cut_netherite_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));

        public static final Block cracked_amethyst_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block calcite_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block prismarine_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.PRISMARINE));

        public static final Block andesite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.ANDESITE));

        public static final Block cracked_end_stone_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.END_STONE));

        public static final Block granite_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block cracked_obsidian_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block amethyst_brick_pillar = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block tuff_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block chiseled_calcite_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block basalt_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block chiseled_red_nether_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS));

        public static final Block cracked_granite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block cracked_prismarine_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.PRISMARINE));

        public static final Block dripstone_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block stone_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.STONE));

        public static final Block cut_diamond = new PillarBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));

        public static final Block cracked_andesite_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.ANDESITE));

        public static final Block obsidian_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block obsidian_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

        public static final Block granite_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block chiseled_end_stone_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.END_STONE));

        public static final Block cracked_calcite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block amethyst_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block calcite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block cut_lapis_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));

        public static final Block diorite_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block cut_iron_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));

        public static final Block chiseled_dripstone_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block granite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block diorite_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block cut_coal_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.COAL_BLOCK));

        public static final Block cut_emerald_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));

        public static final Block tuff_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block dripstone_brick_slab = new SlabBlock(
                        FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block amethyst_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block dripstone_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK));

        public static final Block cut_gold_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.GOLD_BLOCK));

        public static final Block basalt_brick_wall = new WallBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block chiseled_prismarine_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.PRISMARINE));

        public static final Block cut_diamond_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));

        public static final Block cut_emerald = new PillarBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));

        public static final Block chiseled_amethyst_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

        public static final Block cut_emerald_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));

        public static final Block end_stone_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.END_STONE));

        public static final Block chiseled_granite_bricks = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.GRANITE));

        public static final Block calcite_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block basalt_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.BASALT));

        public static final Block calcite_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.CALCITE));

        public static final Block andesite_brick_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE));

        public static final Block red_nether_brick_pillar = new PillarBlock(
                        FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS));

        public static final Block cut_redstone_slab = new SlabBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));

        public static final Block cut_gold = new PillarBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));

        public static final Block andesite_brick_pillar = new PillarBlock(FabricBlockSettings.copy(Blocks.ANDESITE));

        public static final Block cut_lapis_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));

        public static final Block tuff_brick_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block cracked_tuff_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.TUFF));

        public static final Block cut_redstone_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));

        public static final Block diorite_bricks = new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE));

        public static final Block cut_coal = new PillarBlock(FabricBlockSettings.copy(Blocks.COAL_BLOCK));

        public static final Block red_nether_brick_fence = new FenceBlock(
                        FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS));

        public static final Block cut_diamond_stairs = new StairsBlock(getBaseBlockState(),
                        FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));

        public static final Block cut_lapis = new PillarBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));

        @Override
        public void onInitialize() {

                // registeries

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_netherite"), cut_netherite);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_netherite"),
                                new BlockItem(cut_netherite, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "dripstone_brick_pillar"),
                                dripstone_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "dripstone_brick_pillar"),
                                new BlockItem(dripstone_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_netherite_stairs"),
                                cut_netherite_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_netherite_stairs"),
                                new BlockItem(cut_netherite_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "diorite_brick_wall"),
                                diorite_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "diorite_brick_wall"),
                                new BlockItem(diorite_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_diorite_bricks"),
                                chiseled_diorite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_diorite_bricks"),
                                new BlockItem(chiseled_diorite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_basalt_bricks"),
                                cracked_basalt_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_basalt_bricks"),
                                new BlockItem(cracked_basalt_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "diorite_brick_stairs"),
                                diorite_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "diorite_brick_stairs"),
                                new BlockItem(diorite_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_iron_stairs"),
                                cut_iron_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_iron_stairs"),
                                new BlockItem(cut_iron_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "obsidian_brick_slab"),
                                obsidian_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "obsidian_brick_slab"),
                                new BlockItem(obsidian_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_coal_stairs"),
                                cut_coal_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_coal_stairs"),
                                new BlockItem(cut_coal_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "tuff_brick_wall"),
                                tuff_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "tuff_brick_wall"),
                                new BlockItem(tuff_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "granite_brick_wall"),
                                granite_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "granite_brick_wall"),
                                new BlockItem(granite_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_obsidian_bricks"),
                                chiseled_obsidian_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_obsidian_bricks"),
                                new BlockItem(chiseled_obsidian_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_gold_slab"), cut_gold_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_gold_slab"),
                                new BlockItem(cut_gold_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "granite_brick_stairs"),
                                granite_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "granite_brick_stairs"),
                                new BlockItem(granite_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "dripstone_brick_wall"),
                                dripstone_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "dripstone_brick_wall"),
                                new BlockItem(dripstone_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "nether_brick_pillar"),
                                nether_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "nether_brick_pillar"),
                                new BlockItem(nether_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "amethyst_brick_slab"),
                                amethyst_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "amethyst_brick_slab"),
                                new BlockItem(amethyst_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "basalt_brick_slab"),
                                basalt_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "basalt_brick_slab"),
                                new BlockItem(basalt_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "basalt_brick_stairs"),
                                basalt_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "basalt_brick_stairs"),
                                new BlockItem(basalt_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_tuff_bricks"),
                                chiseled_tuff_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_tuff_bricks"),
                                new BlockItem(chiseled_tuff_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_purpur"), cracked_purpur);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_purpur"),
                                new BlockItem(cracked_purpur, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "andesite_brick_stairs"),
                                andesite_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "andesite_brick_stairs"),
                                new BlockItem(andesite_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_dripstone_bricks"),
                                cracked_dripstone_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_dripstone_bricks"),
                                new BlockItem(cracked_dripstone_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_andesite_bricks"),
                                chiseled_andesite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_andesite_bricks"),
                                new BlockItem(chiseled_andesite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_red_nether_bricks"),
                                cracked_red_nether_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_red_nether_bricks"),
                                new BlockItem(cracked_red_nether_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_iron"), cut_iron);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_iron"),
                                new BlockItem(cut_iron, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_basalt_bricks"),
                                chiseled_basalt_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_basalt_bricks"),
                                new BlockItem(chiseled_basalt_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "calcite_brick_stairs"),
                                calcite_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "calcite_brick_stairs"),
                                new BlockItem(calcite_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "andesite_brick_wall"),
                                andesite_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "andesite_brick_wall"),
                                new BlockItem(andesite_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "tuff_brick_pillar"),
                                tuff_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "tuff_brick_pillar"),
                                new BlockItem(tuff_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "obsidian_brick_stairs"),
                                obsidian_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "obsidian_brick_stairs"),
                                new BlockItem(obsidian_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_redstone"), cut_redstone);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_redstone"),
                                new BlockItem(cut_redstone, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "amethyst_brick_stairs"),
                                amethyst_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "amethyst_brick_stairs"),
                                new BlockItem(amethyst_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "obsidian_brick_pillar"),
                                obsidian_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "obsidian_brick_pillar"),
                                new BlockItem(obsidian_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_diorite_bricks"),
                                cracked_diorite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_diorite_bricks"),
                                new BlockItem(cracked_diorite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_purpur"),
                                chiseled_purpur);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_purpur"),
                                new BlockItem(chiseled_purpur, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_netherite_slab"),
                                cut_netherite_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_netherite_slab"),
                                new BlockItem(cut_netherite_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_amethyst_bricks"),
                                cracked_amethyst_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_amethyst_bricks"),
                                new BlockItem(cracked_amethyst_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "calcite_brick_wall"),
                                calcite_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "calcite_brick_wall"),
                                new BlockItem(calcite_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "prismarine_pillar"),
                                prismarine_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "prismarine_pillar"),
                                new BlockItem(prismarine_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "andesite_bricks"),
                                andesite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "andesite_bricks"),
                                new BlockItem(andesite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_end_stone_bricks"),
                                cracked_end_stone_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_end_stone_bricks"),
                                new BlockItem(cracked_end_stone_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "granite_brick_slab"),
                                granite_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "granite_brick_slab"),
                                new BlockItem(granite_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_obsidian_bricks"),
                                cracked_obsidian_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_obsidian_bricks"),
                                new BlockItem(cracked_obsidian_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "amethyst_brick_pillar"),
                                amethyst_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "amethyst_brick_pillar"),
                                new BlockItem(amethyst_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "tuff_bricks"), tuff_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "tuff_bricks"),
                                new BlockItem(tuff_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_calcite_bricks"),
                                chiseled_calcite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_calcite_bricks"),
                                new BlockItem(chiseled_calcite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "basalt_brick_pillar"),
                                basalt_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "basalt_brick_pillar"),
                                new BlockItem(basalt_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_red_nether_bricks"),
                                chiseled_red_nether_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_red_nether_bricks"),
                                new BlockItem(chiseled_red_nether_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_granite_bricks"),
                                cracked_granite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_granite_bricks"),
                                new BlockItem(cracked_granite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_prismarine_bricks"),
                                cracked_prismarine_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_prismarine_bricks"),
                                new BlockItem(cracked_prismarine_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "dripstone_brick_stairs"),
                                dripstone_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "dripstone_brick_stairs"),
                                new BlockItem(dripstone_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "stone_brick_pillar"),
                                stone_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "stone_brick_pillar"),
                                new BlockItem(stone_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_diamond"), cut_diamond);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_diamond"),
                                new BlockItem(cut_diamond, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_andesite_bricks"),
                                cracked_andesite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_andesite_bricks"),
                                new BlockItem(cracked_andesite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "obsidian_bricks"),
                                obsidian_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "obsidian_bricks"),
                                new BlockItem(obsidian_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "obsidian_brick_wall"),
                                obsidian_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "obsidian_brick_wall"),
                                new BlockItem(obsidian_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "granite_brick_pillar"),
                                granite_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "granite_brick_pillar"),
                                new BlockItem(granite_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_end_stone_bricks"),
                                chiseled_end_stone_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_end_stone_bricks"),
                                new BlockItem(chiseled_end_stone_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_calcite_bricks"),
                                cracked_calcite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_calcite_bricks"),
                                new BlockItem(cracked_calcite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "amethyst_bricks"),
                                amethyst_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "amethyst_bricks"),
                                new BlockItem(amethyst_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "calcite_bricks"), calcite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "calcite_bricks"),
                                new BlockItem(calcite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_lapis_slab"), cut_lapis_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_lapis_slab"),
                                new BlockItem(cut_lapis_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "diorite_brick_slab"),
                                diorite_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "diorite_brick_slab"),
                                new BlockItem(diorite_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_iron_slab"), cut_iron_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_iron_slab"),
                                new BlockItem(cut_iron_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_dripstone_bricks"),
                                chiseled_dripstone_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_dripstone_bricks"),
                                new BlockItem(chiseled_dripstone_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "granite_bricks"), granite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "granite_bricks"),
                                new BlockItem(granite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "diorite_brick_pillar"),
                                diorite_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "diorite_brick_pillar"),
                                new BlockItem(diorite_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_coal_slab"), cut_coal_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_coal_slab"),
                                new BlockItem(cut_coal_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_emerald_stairs"),
                                cut_emerald_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_emerald_stairs"),
                                new BlockItem(cut_emerald_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "tuff_brick_slab"),
                                tuff_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "tuff_brick_slab"),
                                new BlockItem(tuff_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "dripstone_brick_slab"),
                                dripstone_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "dripstone_brick_slab"),
                                new BlockItem(dripstone_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "amethyst_brick_wall"),
                                amethyst_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "amethyst_brick_wall"),
                                new BlockItem(amethyst_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "dripstone_bricks"),
                                dripstone_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "dripstone_bricks"),
                                new BlockItem(dripstone_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_gold_stairs"),
                                cut_gold_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_gold_stairs"),
                                new BlockItem(cut_gold_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "basalt_brick_wall"),
                                basalt_brick_wall);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "basalt_brick_wall"),
                                new BlockItem(basalt_brick_wall, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_prismarine_bricks"),
                                chiseled_prismarine_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_prismarine_bricks"),
                                new BlockItem(chiseled_prismarine_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_diamond_slab"),
                                cut_diamond_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_diamond_slab"),
                                new BlockItem(cut_diamond_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_emerald"), cut_emerald);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_emerald"),
                                new BlockItem(cut_emerald, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_amethyst_bricks"),
                                chiseled_amethyst_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_amethyst_bricks"),
                                new BlockItem(chiseled_amethyst_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_emerald_slab"),
                                cut_emerald_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_emerald_slab"),
                                new BlockItem(cut_emerald_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "end_stone_pillar"),
                                end_stone_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "end_stone_pillar"),
                                new BlockItem(end_stone_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "chiseled_granite_bricks"),
                                chiseled_granite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "chiseled_granite_bricks"),
                                new BlockItem(chiseled_granite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "calcite_brick_slab"),
                                calcite_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "calcite_brick_slab"),
                                new BlockItem(calcite_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "basalt_bricks"), basalt_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "basalt_bricks"),
                                new BlockItem(basalt_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "calcite_brick_pillar"),
                                calcite_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "calcite_brick_pillar"),
                                new BlockItem(calcite_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "andesite_brick_slab"),
                                andesite_brick_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "andesite_brick_slab"),
                                new BlockItem(andesite_brick_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "red_nether_brick_pillar"),
                                red_nether_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "red_nether_brick_pillar"),
                                new BlockItem(red_nether_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_redstone_slab"),
                                cut_redstone_slab);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_redstone_slab"),
                                new BlockItem(cut_redstone_slab, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_gold"), cut_gold);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_gold"),
                                new BlockItem(cut_gold, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "andesite_brick_pillar"),
                                andesite_brick_pillar);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "andesite_brick_pillar"),
                                new BlockItem(andesite_brick_pillar, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_lapis_stairs"),
                                cut_lapis_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_lapis_stairs"),
                                new BlockItem(cut_lapis_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "tuff_brick_stairs"),
                                tuff_brick_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "tuff_brick_stairs"),
                                new BlockItem(tuff_brick_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cracked_tuff_bricks"),
                                cracked_tuff_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cracked_tuff_bricks"),
                                new BlockItem(cracked_tuff_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_redstone_stairs"),
                                cut_redstone_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_redstone_stairs"),
                                new BlockItem(cut_redstone_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "diorite_bricks"), diorite_bricks);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "diorite_bricks"),
                                new BlockItem(diorite_bricks, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_coal"), cut_coal);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_coal"),
                                new BlockItem(cut_coal, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "red_nether_brick_fence"),
                                red_nether_brick_fence);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "red_nether_brick_fence"),
                                new BlockItem(red_nether_brick_fence, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_diamond_stairs"),
                                cut_diamond_stairs);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_diamond_stairs"),
                                new BlockItem(cut_diamond_stairs, new Item.Settings()));

                Registry.register(Registries.BLOCK, Identifier.of("blockexpansion", "cut_lapis"), cut_lapis);
                Registry.register(Registries.ITEM, Identifier.of("blockexpansion", "cut_lapis"),
                                new BlockItem(cut_lapis, new Item.Settings()));

                // creative inventory

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_netherite);
                        content.add(cut_netherite_stairs);
                        content.add(cut_netherite_slab);
                });

                // Bloques hechos de Dripstone
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(dripstone_brick_pillar);
                        content.add(dripstone_brick_wall);
                        content.add(dripstone_brick_stairs);
                        content.add(dripstone_brick_slab);
                        content.add(cracked_dripstone_bricks);
                        content.add(chiseled_dripstone_bricks);
                        content.add(dripstone_bricks);
                });

                // Bloques hechos de Diorite
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(diorite_brick_wall);
                        content.add(chiseled_diorite_bricks);
                        content.add(diorite_brick_stairs);
                        content.add(diorite_brick_slab);
                        content.add(cracked_diorite_bricks);
                        content.add(diorite_brick_pillar);
                });

                // Bloques hechos de Basalt
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cracked_basalt_bricks);
                        content.add(basalt_brick_slab);
                        content.add(basalt_brick_stairs);
                        content.add(basalt_brick_wall);
                });

                // Bloques hechos de Iron
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_iron);
                        content.add(cut_iron_stairs);
                        content.add(cut_iron_slab);
                });

                // Bloques hechos de Obsidian
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(obsidian_brick_slab);
                        content.add(obsidian_brick_stairs);
                        content.add(obsidian_brick_pillar);
                        content.add(obsidian_brick_wall);
                        content.add(cracked_obsidian_bricks);
                });

                // Bloques hechos de Tuff
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(tuff_bricks);
                        content.add(tuff_brick_slab);
                        content.add(tuff_brick_stairs);
                        content.add(tuff_brick_pillar);
                        content.add(cracked_tuff_bricks);
                });

                // Bloques hechos de Granite
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(granite_brick_wall);
                        content.add(granite_brick_stairs);
                        content.add(granite_brick_slab);
                        content.add(chiseled_granite_bricks);
                        content.add(cracked_granite_bricks);
                        content.add(granite_bricks);
                        content.add(granite_brick_pillar);
                });

                // Bloques hechos de Andesite
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(andesite_bricks);
                        content.add(andesite_brick_slab);
                        content.add(andesite_brick_stairs);
                        content.add(andesite_brick_wall);
                        content.add(andesite_brick_pillar);
                        content.add(chiseled_andesite_bricks);
                        content.add(cracked_andesite_bricks);
                });

                // Bloques hechos de Red Nether Bricks
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(red_nether_brick_pillar);
                        content.add(red_nether_brick_fence);
                        content.add(cracked_red_nether_bricks);
                        content.add(chiseled_red_nether_bricks);
                });

                // Bloques hechos de Amethyst
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(amethyst_brick_slab);
                        content.add(amethyst_brick_stairs);
                        content.add(amethyst_brick_wall);
                        content.add(amethyst_brick_pillar);
                        content.add(chiseled_amethyst_bricks);
                        content.add(cracked_amethyst_bricks);
                });

                // Bloques hechos de Calcite
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(calcite_bricks);
                        content.add(calcite_brick_slab);
                        content.add(calcite_brick_stairs);
                        content.add(calcite_brick_wall);
                        content.add(calcite_brick_pillar);
                        content.add(chiseled_calcite_bricks);
                        content.add(cracked_calcite_bricks);
                });

                // Bloques hechos de End Stone
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(chiseled_end_stone_bricks);
                        content.add(cracked_end_stone_bricks);
                        content.add(end_stone_pillar);
                });

                // Bloques hechos de Lapis
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_lapis);
                        content.add(cut_lapis_slab);
                        content.add(cut_lapis_stairs);
                });

                // Bloques hechos de Coal
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_coal);
                        content.add(cut_coal_slab);
                        content.add(cut_coal_stairs);
                });

                // Bloques hechos de Emerald
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_emerald);
                        content.add(cut_emerald_slab);
                        content.add(cut_emerald_stairs);
                });

                // Bloques hechos de Gold
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_gold);
                        content.add(cut_gold_slab);
                        content.add(cut_gold_stairs);
                });

                // Bloques hechos de Diamond
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                        content.add(cut_diamond);
                        content.add(cut_diamond_slab);
                        content.add(cut_diamond_stairs);
                });

                LOGGER.info("Hello Fabric world!");
        }

        private static BlockState getBaseBlockState() {
                // Obtener el BlockState de la madera de roble
                return Blocks.STONE_STAIRS.getDefaultState();
        }

}