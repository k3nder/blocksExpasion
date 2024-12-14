package net.kender.blockexpansion.fabric;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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


        public static final Identifier cut_netherite_id = Identifier.of("blockexpansion", "cut_netherite");
        public static final RegistryKey<Block> cut_netherite_key = RegistryKey.of(RegistryKeys.BLOCK, cut_netherite_id);
        public static final Block cut_netherite = new PillarBlock(Blocks.NETHERITE_BLOCK.getSettings().registryKey(cut_netherite_key));


        public static final Identifier dripstone_brick_pillar_id = Identifier.of("blockexpansion", "dripstone_brick_pillar");
        public static final RegistryKey<Block> dripstone_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, dripstone_brick_pillar_id);
        public static final Block dripstone_brick_pillar = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(dripstone_brick_pillar_key));


        public static final Identifier cut_netherite_stairs_id = Identifier.of("blockexpansion", "cut_netherite_stairs");
        public static final RegistryKey<Block> cut_netherite_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_netherite_stairs_id);
        public static final Block cut_netherite_stairs = new PillarBlock(Blocks.NETHERITE_BLOCK.getSettings().registryKey(cut_netherite_stairs_key));


        public static final Identifier diorite_brick_wall_id = Identifier.of("blockexpansion", "diorite_brick_wall");
        public static final RegistryKey<Block> diorite_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, diorite_brick_wall_id);
        public static final Block diorite_brick_wall = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(diorite_brick_wall_key));


        public static final Identifier chiseled_diorite_bricks_id = Identifier.of("blockexpansion", "chiseled_diorite_bricks");
        public static final RegistryKey<Block> chiseled_diorite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_diorite_bricks_id);
        public static final Block chiseled_diorite_bricks = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(chiseled_diorite_bricks_key));


        public static final Identifier cracked_basalt_bricks_id = Identifier.of("blockexpansion", "cracked_basalt_bricks");
        public static final RegistryKey<Block> cracked_basalt_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_basalt_bricks_id);
        public static final Block cracked_basalt_bricks = new PillarBlock(Blocks.BASALT.getSettings().registryKey(cracked_basalt_bricks_key));


        public static final Identifier diorite_brick_stairs_id = Identifier.of("blockexpansion", "diorite_brick_stairs");
        public static final RegistryKey<Block> diorite_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, diorite_brick_stairs_id);
        public static final Block diorite_brick_stairs = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(diorite_brick_stairs_key));


        public static final Identifier cut_iron_stairs_id = Identifier.of("blockexpansion", "cut_iron_stairs");
        public static final RegistryKey<Block> cut_iron_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_iron_stairs_id);
        public static final Block cut_iron_stairs = new PillarBlock(Blocks.IRON_BLOCK.getSettings().registryKey(cut_iron_stairs_key));


        public static final Identifier obsidian_brick_slab_id = Identifier.of("blockexpansion", "obsidian_brick_slab");
        public static final RegistryKey<Block> obsidian_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, obsidian_brick_slab_id);
        public static final Block obsidian_brick_slab = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(obsidian_brick_slab_key));


        public static final Identifier cut_coal_stairs_id = Identifier.of("blockexpansion", "cut_coal_stairs");
        public static final RegistryKey<Block> cut_coal_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_coal_stairs_id);
        public static final Block cut_coal_stairs = new PillarBlock(Blocks.COAL_BLOCK.getSettings().registryKey(cut_coal_stairs_key));


        public static final Identifier tuff_brick_wall_id = Identifier.of("blockexpansion", "tuff_brick_wall");
        public static final RegistryKey<Block> tuff_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, tuff_brick_wall_id);
        public static final Block tuff_brick_wall = new PillarBlock(Blocks.TUFF.getSettings().registryKey(tuff_brick_wall_key));


        public static final Identifier granite_brick_wall_id = Identifier.of("blockexpansion", "granite_brick_wall");
        public static final RegistryKey<Block> granite_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, granite_brick_wall_id);
        public static final Block granite_brick_wall = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(granite_brick_wall_key));


        public static final Identifier chiseled_obsidian_bricks_id = Identifier.of("blockexpansion", "chiseled_obsidian_bricks");
        public static final RegistryKey<Block> chiseled_obsidian_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_obsidian_bricks_id);
        public static final Block chiseled_obsidian_bricks = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(chiseled_obsidian_bricks_key));


        public static final Identifier cut_gold_slab_id = Identifier.of("blockexpansion", "cut_gold_slab");
        public static final RegistryKey<Block> cut_gold_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_gold_slab_id);
        public static final Block cut_gold_slab = new PillarBlock(Blocks.GOLD_BLOCK.getSettings().registryKey(cut_gold_slab_key));


        public static final Identifier granite_brick_stairs_id = Identifier.of("blockexpansion", "granite_brick_stairs");
        public static final RegistryKey<Block> granite_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, granite_brick_stairs_id);
        public static final Block granite_brick_stairs = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(granite_brick_stairs_key));


        public static final Identifier dripstone_brick_wall_id = Identifier.of("blockexpansion", "dripstone_brick_wall");
        public static final RegistryKey<Block> dripstone_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, dripstone_brick_wall_id);
        public static final Block dripstone_brick_wall = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(dripstone_brick_wall_key));


        public static final Identifier nether_brick_pillar_id = Identifier.of("blockexpansion", "nether_brick_pillar");
        public static final RegistryKey<Block> nether_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, nether_brick_pillar_id);
        public static final Block nether_brick_pillar = new PillarBlock(Blocks.NETHER_BRICKS.getSettings().registryKey(nether_brick_pillar_key));


        public static final Identifier amethyst_brick_slab_id = Identifier.of("blockexpansion", "amethyst_brick_slab");
        public static final RegistryKey<Block> amethyst_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, amethyst_brick_slab_id);
        public static final Block amethyst_brick_slab = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(amethyst_brick_slab_key));


        public static final Identifier basalt_brick_slab_id = Identifier.of("blockexpansion", "basalt_brick_slab");
        public static final RegistryKey<Block> basalt_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, basalt_brick_slab_id);
        public static final Block basalt_brick_slab = new PillarBlock(Blocks.BASALT.getSettings().registryKey(basalt_brick_slab_key));


        public static final Identifier basalt_brick_stairs_id = Identifier.of("blockexpansion", "basalt_brick_stairs");
        public static final RegistryKey<Block> basalt_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, basalt_brick_stairs_id);
        public static final Block basalt_brick_stairs = new PillarBlock(Blocks.BASALT.getSettings().registryKey(basalt_brick_stairs_key));


        public static final Identifier chiseled_tuff_bricks_id = Identifier.of("blockexpansion", "chiseled_tuff_bricks");
        public static final RegistryKey<Block> chiseled_tuff_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_tuff_bricks_id);
        public static final Block chiseled_tuff_bricks = new PillarBlock(Blocks.TUFF.getSettings().registryKey(chiseled_tuff_bricks_key));


        public static final Identifier cracked_purpur_id = Identifier.of("blockexpansion", "cracked_purpur");
        public static final RegistryKey<Block> cracked_purpur_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_purpur_id);
        public static final Block cracked_purpur = new PillarBlock(Blocks.PURPUR_BLOCK.getSettings().registryKey(cracked_purpur_key));


        public static final Identifier andesite_brick_stairs_id = Identifier.of("blockexpansion", "andesite_brick_stairs");
        public static final RegistryKey<Block> andesite_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, andesite_brick_stairs_id);
        public static final Block andesite_brick_stairs = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(andesite_brick_stairs_key));


        public static final Identifier cracked_dripstone_bricks_id = Identifier.of("blockexpansion", "cracked_dripstone_bricks");
        public static final RegistryKey<Block> cracked_dripstone_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_dripstone_bricks_id);
        public static final Block cracked_dripstone_bricks = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(cracked_dripstone_bricks_key));


        public static final Identifier chiseled_andesite_bricks_id = Identifier.of("blockexpansion", "chiseled_andesite_bricks");
        public static final RegistryKey<Block> chiseled_andesite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_andesite_bricks_id);
        public static final Block chiseled_andesite_bricks = new PillarBlock(Blocks.ANDESITE.getSettings().registryKey(chiseled_andesite_bricks_key));


        public static final Identifier cracked_red_nether_bricks_id = Identifier.of("blockexpansion", "cracked_red_nether_bricks");
        public static final RegistryKey<Block> cracked_red_nether_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_red_nether_bricks_id);
        public static final Block cracked_red_nether_bricks = new PillarBlock(Blocks.RED_NETHER_BRICKS.getSettings().registryKey(cracked_red_nether_bricks_key));


        public static final Identifier cut_iron_id = Identifier.of("blockexpansion", "cut_iron");
        public static final RegistryKey<Block> cut_iron_key = RegistryKey.of(RegistryKeys.BLOCK, cut_iron_id);
        public static final Block cut_iron = new PillarBlock(Blocks.IRON_BLOCK.getSettings().registryKey(cut_iron_key));


        public static final Identifier chiseled_basalt_bricks_id = Identifier.of("blockexpansion", "chiseled_basalt_bricks");
        public static final RegistryKey<Block> chiseled_basalt_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_basalt_bricks_id);
        public static final Block chiseled_basalt_bricks = new PillarBlock(Blocks.BASALT.getSettings().registryKey(chiseled_basalt_bricks_key));


        public static final Identifier calcite_brick_stairs_id = Identifier.of("blockexpansion", "calcite_brick_stairs");
        public static final RegistryKey<Block> calcite_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, calcite_brick_stairs_id);
        public static final Block calcite_brick_stairs = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(calcite_brick_stairs_key));


        public static final Identifier andesite_brick_wall_id = Identifier.of("blockexpansion", "andesite_brick_wall");
        public static final RegistryKey<Block> andesite_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, andesite_brick_wall_id);
        public static final Block andesite_brick_wall = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(andesite_brick_wall_key));


        public static final Identifier tuff_brick_pillar_id = Identifier.of("blockexpansion", "tuff_brick_pillar");
        public static final RegistryKey<Block> tuff_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, tuff_brick_pillar_id);
        public static final Block tuff_brick_pillar = new PillarBlock(Blocks.TUFF.getSettings().registryKey(tuff_brick_pillar_key));


        public static final Identifier obsidian_brick_stairs_id = Identifier.of("blockexpansion", "obsidian_brick_stairs");
        public static final RegistryKey<Block> obsidian_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, obsidian_brick_stairs_id);
        public static final Block obsidian_brick_stairs = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(obsidian_brick_stairs_key));


        public static final Identifier cut_redstone_id = Identifier.of("blockexpansion", "cut_redstone");
        public static final RegistryKey<Block> cut_redstone_key = RegistryKey.of(RegistryKeys.BLOCK, cut_redstone_id);
        public static final Block cut_redstone = new PillarBlock(Blocks.REDSTONE_BLOCK.getSettings().registryKey(cut_redstone_key));


        public static final Identifier amethyst_brick_stairs_id = Identifier.of("blockexpansion", "amethyst_brick_stairs");
        public static final RegistryKey<Block> amethyst_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, amethyst_brick_stairs_id);
        public static final Block amethyst_brick_stairs = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(amethyst_brick_stairs_key));


        public static final Identifier obsidian_brick_pillar_id = Identifier.of("blockexpansion", "obsidian_brick_pillar");
        public static final RegistryKey<Block> obsidian_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, obsidian_brick_pillar_id);
        public static final Block obsidian_brick_pillar = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(obsidian_brick_pillar_key));


        public static final Identifier cracked_diorite_bricks_id = Identifier.of("blockexpansion", "cracked_diorite_bricks");
        public static final RegistryKey<Block> cracked_diorite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_diorite_bricks_id);
        public static final Block cracked_diorite_bricks = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(cracked_diorite_bricks_key));


        public static final Identifier chiseled_purpur_id = Identifier.of("blockexpansion", "chiseled_purpur");
        public static final RegistryKey<Block> chiseled_purpur_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_purpur_id);
        public static final Block chiseled_purpur = new PillarBlock(Blocks.PURPUR_BLOCK.getSettings().registryKey(chiseled_purpur_key));


        public static final Identifier cut_netherite_slab_id = Identifier.of("blockexpansion", "cut_netherite_slab");
        public static final RegistryKey<Block> cut_netherite_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_netherite_slab_id);
        public static final Block cut_netherite_slab = new PillarBlock(Blocks.NETHERITE_BLOCK.getSettings().registryKey(cut_netherite_slab_key));


        public static final Identifier cracked_amethyst_bricks_id = Identifier.of("blockexpansion", "cracked_amethyst_bricks");
        public static final RegistryKey<Block> cracked_amethyst_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_amethyst_bricks_id);
        public static final Block cracked_amethyst_bricks = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(cracked_amethyst_bricks_key));


        public static final Identifier calcite_brick_wall_id = Identifier.of("blockexpansion", "calcite_brick_wall");
        public static final RegistryKey<Block> calcite_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, calcite_brick_wall_id);
        public static final Block calcite_brick_wall = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(calcite_brick_wall_key));


        public static final Identifier prismarine_pillar_id = Identifier.of("blockexpansion", "prismarine_pillar");
        public static final RegistryKey<Block> prismarine_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, prismarine_pillar_id);
        public static final Block prismarine_pillar = new PillarBlock(Blocks.PRISMARINE.getSettings().registryKey(prismarine_pillar_key));


        public static final Identifier andesite_bricks_id = Identifier.of("blockexpansion", "andesite_bricks");
        public static final RegistryKey<Block> andesite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, andesite_bricks_id);
        public static final Block andesite_bricks = new PillarBlock(Blocks.ANDESITE.getSettings().registryKey(andesite_bricks_key));


        public static final Identifier cracked_end_stone_bricks_id = Identifier.of("blockexpansion", "cracked_end_stone_bricks");
        public static final RegistryKey<Block> cracked_end_stone_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_end_stone_bricks_id);
        public static final Block cracked_end_stone_bricks = new PillarBlock(Blocks.END_STONE.getSettings().registryKey(cracked_end_stone_bricks_key));


        public static final Identifier granite_brick_slab_id = Identifier.of("blockexpansion", "granite_brick_slab");
        public static final RegistryKey<Block> granite_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, granite_brick_slab_id);
        public static final Block granite_brick_slab = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(granite_brick_slab_key));


        public static final Identifier cracked_obsidian_bricks_id = Identifier.of("blockexpansion", "cracked_obsidian_bricks");
        public static final RegistryKey<Block> cracked_obsidian_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_obsidian_bricks_id);
        public static final Block cracked_obsidian_bricks = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(cracked_obsidian_bricks_key));


        public static final Identifier amethyst_brick_pillar_id = Identifier.of("blockexpansion", "amethyst_brick_pillar");
        public static final RegistryKey<Block> amethyst_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, amethyst_brick_pillar_id);
        public static final Block amethyst_brick_pillar = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(amethyst_brick_pillar_key));


        public static final Identifier tuff_bricks_id = Identifier.of("blockexpansion", "tuff_bricks");
        public static final RegistryKey<Block> tuff_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, tuff_bricks_id);
        public static final Block tuff_bricks = new PillarBlock(Blocks.TUFF.getSettings().registryKey(tuff_bricks_key));


        public static final Identifier chiseled_calcite_bricks_id = Identifier.of("blockexpansion", "chiseled_calcite_bricks");
        public static final RegistryKey<Block> chiseled_calcite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_calcite_bricks_id);
        public static final Block chiseled_calcite_bricks = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(chiseled_calcite_bricks_key));


        public static final Identifier basalt_brick_pillar_id = Identifier.of("blockexpansion", "basalt_brick_pillar");
        public static final RegistryKey<Block> basalt_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, basalt_brick_pillar_id);
        public static final Block basalt_brick_pillar = new PillarBlock(Blocks.BASALT.getSettings().registryKey(basalt_brick_pillar_key));


        public static final Identifier chiseled_red_nether_bricks_id = Identifier.of("blockexpansion", "chiseled_red_nether_bricks");
        public static final RegistryKey<Block> chiseled_red_nether_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_red_nether_bricks_id);
        public static final Block chiseled_red_nether_bricks = new PillarBlock(Blocks.RED_NETHER_BRICKS.getSettings().registryKey(chiseled_red_nether_bricks_key));


        public static final Identifier cracked_granite_bricks_id = Identifier.of("blockexpansion", "cracked_granite_bricks");
        public static final RegistryKey<Block> cracked_granite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_granite_bricks_id);
        public static final Block cracked_granite_bricks = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(cracked_granite_bricks_key));


        public static final Identifier cracked_prismarine_bricks_id = Identifier.of("blockexpansion", "cracked_prismarine_bricks");
        public static final RegistryKey<Block> cracked_prismarine_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_prismarine_bricks_id);
        public static final Block cracked_prismarine_bricks = new PillarBlock(Blocks.PRISMARINE.getSettings().registryKey(cracked_prismarine_bricks_key));


        public static final Identifier dripstone_brick_stairs_id = Identifier.of("blockexpansion", "dripstone_brick_stairs");
        public static final RegistryKey<Block> dripstone_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, dripstone_brick_stairs_id);
        public static final Block dripstone_brick_stairs = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(dripstone_brick_stairs_key));


        public static final Identifier stone_brick_pillar_id = Identifier.of("blockexpansion", "stone_brick_pillar");
        public static final RegistryKey<Block> stone_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, stone_brick_pillar_id);
        public static final Block stone_brick_pillar = new PillarBlock(Blocks.STONE.getSettings().registryKey(stone_brick_pillar_key));


        public static final Identifier cut_diamond_id = Identifier.of("blockexpansion", "cut_diamond");
        public static final RegistryKey<Block> cut_diamond_key = RegistryKey.of(RegistryKeys.BLOCK, cut_diamond_id);
        public static final Block cut_diamond = new PillarBlock(Blocks.DIAMOND_BLOCK.getSettings().registryKey(cut_diamond_key));


        public static final Identifier cracked_andesite_bricks_id = Identifier.of("blockexpansion", "cracked_andesite_bricks");
        public static final RegistryKey<Block> cracked_andesite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_andesite_bricks_id);
        public static final Block cracked_andesite_bricks = new PillarBlock(Blocks.ANDESITE.getSettings().registryKey(cracked_andesite_bricks_key));


        public static final Identifier obsidian_bricks_id = Identifier.of("blockexpansion", "obsidian_bricks");
        public static final RegistryKey<Block> obsidian_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, obsidian_bricks_id);
        public static final Block obsidian_bricks = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(obsidian_bricks_key));


        public static final Identifier obsidian_brick_wall_id = Identifier.of("blockexpansion", "obsidian_brick_wall");
        public static final RegistryKey<Block> obsidian_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, obsidian_brick_wall_id);
        public static final Block obsidian_brick_wall = new PillarBlock(Blocks.OBSIDIAN.getSettings().registryKey(obsidian_brick_wall_key));


        public static final Identifier granite_brick_pillar_id = Identifier.of("blockexpansion", "granite_brick_pillar");
        public static final RegistryKey<Block> granite_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, granite_brick_pillar_id);
        public static final Block granite_brick_pillar = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(granite_brick_pillar_key));


        public static final Identifier chiseled_end_stone_bricks_id = Identifier.of("blockexpansion", "chiseled_end_stone_bricks");
        public static final RegistryKey<Block> chiseled_end_stone_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_end_stone_bricks_id);
        public static final Block chiseled_end_stone_bricks = new PillarBlock(Blocks.END_STONE.getSettings().registryKey(chiseled_end_stone_bricks_key));


        public static final Identifier cracked_calcite_bricks_id = Identifier.of("blockexpansion", "cracked_calcite_bricks");
        public static final RegistryKey<Block> cracked_calcite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_calcite_bricks_id);
        public static final Block cracked_calcite_bricks = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(cracked_calcite_bricks_key));


        public static final Identifier amethyst_bricks_id = Identifier.of("blockexpansion", "amethyst_bricks");
        public static final RegistryKey<Block> amethyst_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, amethyst_bricks_id);
        public static final Block amethyst_bricks = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(amethyst_bricks_key));


        public static final Identifier calcite_bricks_id = Identifier.of("blockexpansion", "calcite_bricks");
        public static final RegistryKey<Block> calcite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, calcite_bricks_id);
        public static final Block calcite_bricks = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(calcite_bricks_key));


        public static final Identifier cut_lapis_slab_id = Identifier.of("blockexpansion", "cut_lapis_slab");
        public static final RegistryKey<Block> cut_lapis_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_lapis_slab_id);
        public static final Block cut_lapis_slab = new PillarBlock(Blocks.LAPIS_BLOCK.getSettings().registryKey(cut_lapis_slab_key));


        public static final Identifier diorite_brick_slab_id = Identifier.of("blockexpansion", "diorite_brick_slab");
        public static final RegistryKey<Block> diorite_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, diorite_brick_slab_id);
        public static final Block diorite_brick_slab = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(diorite_brick_slab_key));


        public static final Identifier cut_iron_slab_id = Identifier.of("blockexpansion", "cut_iron_slab");
        public static final RegistryKey<Block> cut_iron_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_iron_slab_id);
        public static final Block cut_iron_slab = new PillarBlock(Blocks.IRON_BLOCK.getSettings().registryKey(cut_iron_slab_key));


        public static final Identifier chiseled_dripstone_bricks_id = Identifier.of("blockexpansion", "chiseled_dripstone_bricks");
        public static final RegistryKey<Block> chiseled_dripstone_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_dripstone_bricks_id);
        public static final Block chiseled_dripstone_bricks = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(chiseled_dripstone_bricks_key));


        public static final Identifier granite_bricks_id = Identifier.of("blockexpansion", "granite_bricks");
        public static final RegistryKey<Block> granite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, granite_bricks_id);
        public static final Block granite_bricks = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(granite_bricks_key));


        public static final Identifier diorite_brick_pillar_id = Identifier.of("blockexpansion", "diorite_brick_pillar");
        public static final RegistryKey<Block> diorite_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, diorite_brick_pillar_id);
        public static final Block diorite_brick_pillar = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(diorite_brick_pillar_key));


        public static final Identifier cut_coal_slab_id = Identifier.of("blockexpansion", "cut_coal_slab");
        public static final RegistryKey<Block> cut_coal_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_coal_slab_id);
        public static final Block cut_coal_slab = new PillarBlock(Blocks.COAL_BLOCK.getSettings().registryKey(cut_coal_slab_key));


        public static final Identifier cut_emerald_stairs_id = Identifier.of("blockexpansion", "cut_emerald_stairs");
        public static final RegistryKey<Block> cut_emerald_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_emerald_stairs_id);
        public static final Block cut_emerald_stairs = new PillarBlock(Blocks.EMERALD_BLOCK.getSettings().registryKey(cut_emerald_stairs_key));


        public static final Identifier tuff_brick_slab_id = Identifier.of("blockexpansion", "tuff_brick_slab");
        public static final RegistryKey<Block> tuff_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, tuff_brick_slab_id);
        public static final Block tuff_brick_slab = new PillarBlock(Blocks.TUFF.getSettings().registryKey(tuff_brick_slab_key));


        public static final Identifier dripstone_brick_slab_id = Identifier.of("blockexpansion", "dripstone_brick_slab");
        public static final RegistryKey<Block> dripstone_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, dripstone_brick_slab_id);
        public static final Block dripstone_brick_slab = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(dripstone_brick_slab_key));


        public static final Identifier amethyst_brick_wall_id = Identifier.of("blockexpansion", "amethyst_brick_wall");
        public static final RegistryKey<Block> amethyst_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, amethyst_brick_wall_id);
        public static final Block amethyst_brick_wall = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(amethyst_brick_wall_key));


        public static final Identifier dripstone_bricks_id = Identifier.of("blockexpansion", "dripstone_bricks");
        public static final RegistryKey<Block> dripstone_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, dripstone_bricks_id);
        public static final Block dripstone_bricks = new PillarBlock(Blocks.DRIPSTONE_BLOCK.getSettings().registryKey(dripstone_bricks_key));


        public static final Identifier cut_gold_stairs_id = Identifier.of("blockexpansion", "cut_gold_stairs");
        public static final RegistryKey<Block> cut_gold_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_gold_stairs_id);
        public static final Block cut_gold_stairs = new PillarBlock(Blocks.GOLD_BLOCK.getSettings().registryKey(cut_gold_stairs_key));


        public static final Identifier basalt_brick_wall_id = Identifier.of("blockexpansion", "basalt_brick_wall");
        public static final RegistryKey<Block> basalt_brick_wall_key = RegistryKey.of(RegistryKeys.BLOCK, basalt_brick_wall_id);
        public static final Block basalt_brick_wall = new PillarBlock(Blocks.BASALT.getSettings().registryKey(basalt_brick_wall_key));


        public static final Identifier chiseled_prismarine_bricks_id = Identifier.of("blockexpansion", "chiseled_prismarine_bricks");
        public static final RegistryKey<Block> chiseled_prismarine_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_prismarine_bricks_id);
        public static final Block chiseled_prismarine_bricks = new PillarBlock(Blocks.PRISMARINE.getSettings().registryKey(chiseled_prismarine_bricks_key));


        public static final Identifier cut_diamond_slab_id = Identifier.of("blockexpansion", "cut_diamond_slab");
        public static final RegistryKey<Block> cut_diamond_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_diamond_slab_id);
        public static final Block cut_diamond_slab = new PillarBlock(Blocks.DIAMOND_BLOCK.getSettings().registryKey(cut_diamond_slab_key));


        public static final Identifier cut_emerald_id = Identifier.of("blockexpansion", "cut_emerald");
        public static final RegistryKey<Block> cut_emerald_key = RegistryKey.of(RegistryKeys.BLOCK, cut_emerald_id);
        public static final Block cut_emerald = new PillarBlock(Blocks.EMERALD_BLOCK.getSettings().registryKey(cut_emerald_key));


        public static final Identifier chiseled_amethyst_bricks_id = Identifier.of("blockexpansion", "chiseled_amethyst_bricks");
        public static final RegistryKey<Block> chiseled_amethyst_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_amethyst_bricks_id);
        public static final Block chiseled_amethyst_bricks = new PillarBlock(Blocks.AMETHYST_BLOCK.getSettings().registryKey(chiseled_amethyst_bricks_key));


        public static final Identifier cut_emerald_slab_id = Identifier.of("blockexpansion", "cut_emerald_slab");
        public static final RegistryKey<Block> cut_emerald_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_emerald_slab_id);
        public static final Block cut_emerald_slab = new PillarBlock(Blocks.EMERALD_BLOCK.getSettings().registryKey(cut_emerald_slab_key));


        public static final Identifier end_stone_pillar_id = Identifier.of("blockexpansion", "end_stone_pillar");
        public static final RegistryKey<Block> end_stone_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, end_stone_pillar_id);
        public static final Block end_stone_pillar = new PillarBlock(Blocks.END_STONE.getSettings().registryKey(end_stone_pillar_key));


        public static final Identifier chiseled_granite_bricks_id = Identifier.of("blockexpansion", "chiseled_granite_bricks");
        public static final RegistryKey<Block> chiseled_granite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, chiseled_granite_bricks_id);
        public static final Block chiseled_granite_bricks = new PillarBlock(Blocks.GRANITE.getSettings().registryKey(chiseled_granite_bricks_key));


        public static final Identifier calcite_brick_slab_id = Identifier.of("blockexpansion", "calcite_brick_slab");
        public static final RegistryKey<Block> calcite_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, calcite_brick_slab_id);
        public static final Block calcite_brick_slab = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(calcite_brick_slab_key));


        public static final Identifier basalt_bricks_id = Identifier.of("blockexpansion", "basalt_bricks");
        public static final RegistryKey<Block> basalt_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, basalt_bricks_id);
        public static final Block basalt_bricks = new PillarBlock(Blocks.BASALT.getSettings().registryKey(basalt_bricks_key));


        public static final Identifier calcite_brick_pillar_id = Identifier.of("blockexpansion", "calcite_brick_pillar");
        public static final RegistryKey<Block> calcite_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, calcite_brick_pillar_id);
        public static final Block calcite_brick_pillar = new PillarBlock(Blocks.CALCITE.getSettings().registryKey(calcite_brick_pillar_key));


        public static final Identifier andesite_brick_slab_id = Identifier.of("blockexpansion", "andesite_brick_slab");
        public static final RegistryKey<Block> andesite_brick_slab_key = RegistryKey.of(RegistryKeys.BLOCK, andesite_brick_slab_id);
        public static final Block andesite_brick_slab = new PillarBlock(Blocks.ANDESITE.getSettings().registryKey(andesite_brick_slab_key));


        public static final Identifier red_nether_brick_pillar_id = Identifier.of("blockexpansion", "red_nether_brick_pillar");
        public static final RegistryKey<Block> red_nether_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, red_nether_brick_pillar_id);
        public static final Block red_nether_brick_pillar = new PillarBlock(Blocks.RED_NETHER_BRICKS.getSettings().registryKey(red_nether_brick_pillar_key));


        public static final Identifier cut_redstone_slab_id = Identifier.of("blockexpansion", "cut_redstone_slab");
        public static final RegistryKey<Block> cut_redstone_slab_key = RegistryKey.of(RegistryKeys.BLOCK, cut_redstone_slab_id);
        public static final Block cut_redstone_slab = new PillarBlock(Blocks.REDSTONE_BLOCK.getSettings().registryKey(cut_redstone_slab_key));


        public static final Identifier cut_gold_id = Identifier.of("blockexpansion", "cut_gold");
        public static final RegistryKey<Block> cut_gold_key = RegistryKey.of(RegistryKeys.BLOCK, cut_gold_id);
        public static final Block cut_gold = new PillarBlock(Blocks.GOLD_BLOCK.getSettings().registryKey(cut_gold_key));


        public static final Identifier andesite_brick_pillar_id = Identifier.of("blockexpansion", "andesite_brick_pillar");
        public static final RegistryKey<Block> andesite_brick_pillar_key = RegistryKey.of(RegistryKeys.BLOCK, andesite_brick_pillar_id);
        public static final Block andesite_brick_pillar = new PillarBlock(Blocks.ANDESITE.getSettings().registryKey(andesite_brick_pillar_key));


        public static final Identifier cut_lapis_stairs_id = Identifier.of("blockexpansion", "cut_lapis_stairs");
        public static final RegistryKey<Block> cut_lapis_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_lapis_stairs_id);
        public static final Block cut_lapis_stairs = new PillarBlock(Blocks.LAPIS_BLOCK.getSettings().registryKey(cut_lapis_stairs_key));


        public static final Identifier tuff_brick_stairs_id = Identifier.of("blockexpansion", "tuff_brick_stairs");
        public static final RegistryKey<Block> tuff_brick_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, tuff_brick_stairs_id);
        public static final Block tuff_brick_stairs = new PillarBlock(Blocks.TUFF.getSettings().registryKey(tuff_brick_stairs_key));


        public static final Identifier cracked_tuff_bricks_id = Identifier.of("blockexpansion", "cracked_tuff_bricks");
        public static final RegistryKey<Block> cracked_tuff_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, cracked_tuff_bricks_id);
        public static final Block cracked_tuff_bricks = new PillarBlock(Blocks.TUFF.getSettings().registryKey(cracked_tuff_bricks_key));


        public static final Identifier cut_redstone_stairs_id = Identifier.of("blockexpansion", "cut_redstone_stairs");
        public static final RegistryKey<Block> cut_redstone_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_redstone_stairs_id);
        public static final Block cut_redstone_stairs = new PillarBlock(Blocks.REDSTONE_BLOCK.getSettings().registryKey(cut_redstone_stairs_key));


        public static final Identifier diorite_bricks_id = Identifier.of("blockexpansion", "diorite_bricks");
        public static final RegistryKey<Block> diorite_bricks_key = RegistryKey.of(RegistryKeys.BLOCK, diorite_bricks_id);
        public static final Block diorite_bricks = new PillarBlock(Blocks.DIORITE.getSettings().registryKey(diorite_bricks_key));


        public static final Identifier cut_coal_id = Identifier.of("blockexpansion", "cut_coal");
        public static final RegistryKey<Block> cut_coal_key = RegistryKey.of(RegistryKeys.BLOCK, cut_coal_id);
        public static final Block cut_coal = new PillarBlock(Blocks.COAL_BLOCK.getSettings().registryKey(cut_coal_key));


        public static final Identifier red_nether_brick_fence_id = Identifier.of("blockexpansion", "red_nether_brick_fence");
        public static final RegistryKey<Block> red_nether_brick_fence_key = RegistryKey.of(RegistryKeys.BLOCK, red_nether_brick_fence_id);
        public static final Block red_nether_brick_fence = new PillarBlock(Blocks.RED_NETHER_BRICKS.getSettings().registryKey(red_nether_brick_fence_key));


        public static final Identifier cut_diamond_stairs_id = Identifier.of("blockexpansion", "cut_diamond_stairs");
        public static final RegistryKey<Block> cut_diamond_stairs_key = RegistryKey.of(RegistryKeys.BLOCK, cut_diamond_stairs_id);
        public static final Block cut_diamond_stairs = new PillarBlock(Blocks.DIAMOND_BLOCK.getSettings().registryKey(cut_diamond_stairs_key));


        public static final Identifier cut_lapis_id = Identifier.of("blockexpansion", "cut_lapis");
        public static final RegistryKey<Block> cut_lapis_key = RegistryKey.of(RegistryKeys.BLOCK, cut_lapis_id);
        public static final Block cut_lapis = new PillarBlock(Blocks.LAPIS_BLOCK.getSettings().registryKey(cut_lapis_key));

        @Override
        public void onInitialize() {

                // registeries

                Registry.register(Registries.BLOCK, cut_netherite_id, cut_netherite);
                Registry.register(Registries.ITEM, cut_netherite_id, new BlockItem(cut_netherite, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_netherite_id))));



                Registry.register(Registries.BLOCK, dripstone_brick_pillar_id, dripstone_brick_pillar);
                Registry.register(Registries.ITEM, dripstone_brick_pillar_id, new BlockItem(dripstone_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, dripstone_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cut_netherite_stairs_id, cut_netherite_stairs);
                Registry.register(Registries.ITEM, cut_netherite_stairs_id, new BlockItem(cut_netherite_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_netherite_stairs_id))));



                Registry.register(Registries.BLOCK, diorite_brick_wall_id, diorite_brick_wall);
                Registry.register(Registries.ITEM, diorite_brick_wall_id, new BlockItem(diorite_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, diorite_brick_wall_id))));



                Registry.register(Registries.BLOCK, chiseled_diorite_bricks_id, chiseled_diorite_bricks);
                Registry.register(Registries.ITEM, chiseled_diorite_bricks_id, new BlockItem(chiseled_diorite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_diorite_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_basalt_bricks_id, cracked_basalt_bricks);
                Registry.register(Registries.ITEM, cracked_basalt_bricks_id, new BlockItem(cracked_basalt_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_basalt_bricks_id))));



                Registry.register(Registries.BLOCK, diorite_brick_stairs_id, diorite_brick_stairs);
                Registry.register(Registries.ITEM, diorite_brick_stairs_id, new BlockItem(diorite_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, diorite_brick_stairs_id))));



                Registry.register(Registries.BLOCK, cut_iron_stairs_id, cut_iron_stairs);
                Registry.register(Registries.ITEM, cut_iron_stairs_id, new BlockItem(cut_iron_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_iron_stairs_id))));



                Registry.register(Registries.BLOCK, obsidian_brick_slab_id, obsidian_brick_slab);
                Registry.register(Registries.ITEM, obsidian_brick_slab_id, new BlockItem(obsidian_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, obsidian_brick_slab_id))));



                Registry.register(Registries.BLOCK, cut_coal_stairs_id, cut_coal_stairs);
                Registry.register(Registries.ITEM, cut_coal_stairs_id, new BlockItem(cut_coal_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_coal_stairs_id))));



                Registry.register(Registries.BLOCK, tuff_brick_wall_id, tuff_brick_wall);
                Registry.register(Registries.ITEM, tuff_brick_wall_id, new BlockItem(tuff_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, tuff_brick_wall_id))));



                Registry.register(Registries.BLOCK, granite_brick_wall_id, granite_brick_wall);
                Registry.register(Registries.ITEM, granite_brick_wall_id, new BlockItem(granite_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, granite_brick_wall_id))));



                Registry.register(Registries.BLOCK, chiseled_obsidian_bricks_id, chiseled_obsidian_bricks);
                Registry.register(Registries.ITEM, chiseled_obsidian_bricks_id, new BlockItem(chiseled_obsidian_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_obsidian_bricks_id))));



                Registry.register(Registries.BLOCK, cut_gold_slab_id, cut_gold_slab);
                Registry.register(Registries.ITEM, cut_gold_slab_id, new BlockItem(cut_gold_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_gold_slab_id))));



                Registry.register(Registries.BLOCK, granite_brick_stairs_id, granite_brick_stairs);
                Registry.register(Registries.ITEM, granite_brick_stairs_id, new BlockItem(granite_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, granite_brick_stairs_id))));



                Registry.register(Registries.BLOCK, dripstone_brick_wall_id, dripstone_brick_wall);
                Registry.register(Registries.ITEM, dripstone_brick_wall_id, new BlockItem(dripstone_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, dripstone_brick_wall_id))));



                Registry.register(Registries.BLOCK, nether_brick_pillar_id, nether_brick_pillar);
                Registry.register(Registries.ITEM, nether_brick_pillar_id, new BlockItem(nether_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, nether_brick_pillar_id))));



                Registry.register(Registries.BLOCK, amethyst_brick_slab_id, amethyst_brick_slab);
                Registry.register(Registries.ITEM, amethyst_brick_slab_id, new BlockItem(amethyst_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, amethyst_brick_slab_id))));



                Registry.register(Registries.BLOCK, basalt_brick_slab_id, basalt_brick_slab);
                Registry.register(Registries.ITEM, basalt_brick_slab_id, new BlockItem(basalt_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, basalt_brick_slab_id))));



                Registry.register(Registries.BLOCK, basalt_brick_stairs_id, basalt_brick_stairs);
                Registry.register(Registries.ITEM, basalt_brick_stairs_id, new BlockItem(basalt_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, basalt_brick_stairs_id))));



                Registry.register(Registries.BLOCK, chiseled_tuff_bricks_id, chiseled_tuff_bricks);
                Registry.register(Registries.ITEM, chiseled_tuff_bricks_id, new BlockItem(chiseled_tuff_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_tuff_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_purpur_id, cracked_purpur);
                Registry.register(Registries.ITEM, cracked_purpur_id, new BlockItem(cracked_purpur, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_purpur_id))));



                Registry.register(Registries.BLOCK, andesite_brick_stairs_id, andesite_brick_stairs);
                Registry.register(Registries.ITEM, andesite_brick_stairs_id, new BlockItem(andesite_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, andesite_brick_stairs_id))));



                Registry.register(Registries.BLOCK, cracked_dripstone_bricks_id, cracked_dripstone_bricks);
                Registry.register(Registries.ITEM, cracked_dripstone_bricks_id, new BlockItem(cracked_dripstone_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_dripstone_bricks_id))));



                Registry.register(Registries.BLOCK, chiseled_andesite_bricks_id, chiseled_andesite_bricks);
                Registry.register(Registries.ITEM, chiseled_andesite_bricks_id, new BlockItem(chiseled_andesite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_andesite_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_red_nether_bricks_id, cracked_red_nether_bricks);
                Registry.register(Registries.ITEM, cracked_red_nether_bricks_id, new BlockItem(cracked_red_nether_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_red_nether_bricks_id))));



                Registry.register(Registries.BLOCK, cut_iron_id, cut_iron);
                Registry.register(Registries.ITEM, cut_iron_id, new BlockItem(cut_iron, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_iron_id))));



                Registry.register(Registries.BLOCK, chiseled_basalt_bricks_id, chiseled_basalt_bricks);
                Registry.register(Registries.ITEM, chiseled_basalt_bricks_id, new BlockItem(chiseled_basalt_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_basalt_bricks_id))));



                Registry.register(Registries.BLOCK, calcite_brick_stairs_id, calcite_brick_stairs);
                Registry.register(Registries.ITEM, calcite_brick_stairs_id, new BlockItem(calcite_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, calcite_brick_stairs_id))));



                Registry.register(Registries.BLOCK, andesite_brick_wall_id, andesite_brick_wall);
                Registry.register(Registries.ITEM, andesite_brick_wall_id, new BlockItem(andesite_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, andesite_brick_wall_id))));



                Registry.register(Registries.BLOCK, tuff_brick_pillar_id, tuff_brick_pillar);
                Registry.register(Registries.ITEM, tuff_brick_pillar_id, new BlockItem(tuff_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, tuff_brick_pillar_id))));



                Registry.register(Registries.BLOCK, obsidian_brick_stairs_id, obsidian_brick_stairs);
                Registry.register(Registries.ITEM, obsidian_brick_stairs_id, new BlockItem(obsidian_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, obsidian_brick_stairs_id))));



                Registry.register(Registries.BLOCK, cut_redstone_id, cut_redstone);
                Registry.register(Registries.ITEM, cut_redstone_id, new BlockItem(cut_redstone, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_redstone_id))));



                Registry.register(Registries.BLOCK, amethyst_brick_stairs_id, amethyst_brick_stairs);
                Registry.register(Registries.ITEM, amethyst_brick_stairs_id, new BlockItem(amethyst_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, amethyst_brick_stairs_id))));



                Registry.register(Registries.BLOCK, obsidian_brick_pillar_id, obsidian_brick_pillar);
                Registry.register(Registries.ITEM, obsidian_brick_pillar_id, new BlockItem(obsidian_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, obsidian_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cracked_diorite_bricks_id, cracked_diorite_bricks);
                Registry.register(Registries.ITEM, cracked_diorite_bricks_id, new BlockItem(cracked_diorite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_diorite_bricks_id))));



                Registry.register(Registries.BLOCK, chiseled_purpur_id, chiseled_purpur);
                Registry.register(Registries.ITEM, chiseled_purpur_id, new BlockItem(chiseled_purpur, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_purpur_id))));



                Registry.register(Registries.BLOCK, cut_netherite_slab_id, cut_netherite_slab);
                Registry.register(Registries.ITEM, cut_netherite_slab_id, new BlockItem(cut_netherite_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_netherite_slab_id))));



                Registry.register(Registries.BLOCK, cracked_amethyst_bricks_id, cracked_amethyst_bricks);
                Registry.register(Registries.ITEM, cracked_amethyst_bricks_id, new BlockItem(cracked_amethyst_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_amethyst_bricks_id))));



                Registry.register(Registries.BLOCK, calcite_brick_wall_id, calcite_brick_wall);
                Registry.register(Registries.ITEM, calcite_brick_wall_id, new BlockItem(calcite_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, calcite_brick_wall_id))));



                Registry.register(Registries.BLOCK, prismarine_pillar_id, prismarine_pillar);
                Registry.register(Registries.ITEM, prismarine_pillar_id, new BlockItem(prismarine_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, prismarine_pillar_id))));



                Registry.register(Registries.BLOCK, andesite_bricks_id, andesite_bricks);
                Registry.register(Registries.ITEM, andesite_bricks_id, new BlockItem(andesite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, andesite_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_end_stone_bricks_id, cracked_end_stone_bricks);
                Registry.register(Registries.ITEM, cracked_end_stone_bricks_id, new BlockItem(cracked_end_stone_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_end_stone_bricks_id))));



                Registry.register(Registries.BLOCK, granite_brick_slab_id, granite_brick_slab);
                Registry.register(Registries.ITEM, granite_brick_slab_id, new BlockItem(granite_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, granite_brick_slab_id))));



                Registry.register(Registries.BLOCK, cracked_obsidian_bricks_id, cracked_obsidian_bricks);
                Registry.register(Registries.ITEM, cracked_obsidian_bricks_id, new BlockItem(cracked_obsidian_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_obsidian_bricks_id))));



                Registry.register(Registries.BLOCK, amethyst_brick_pillar_id, amethyst_brick_pillar);
                Registry.register(Registries.ITEM, amethyst_brick_pillar_id, new BlockItem(amethyst_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, amethyst_brick_pillar_id))));



                Registry.register(Registries.BLOCK, tuff_bricks_id, tuff_bricks);
                Registry.register(Registries.ITEM, tuff_bricks_id, new BlockItem(tuff_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, tuff_bricks_id))));



                Registry.register(Registries.BLOCK, chiseled_calcite_bricks_id, chiseled_calcite_bricks);
                Registry.register(Registries.ITEM, chiseled_calcite_bricks_id, new BlockItem(chiseled_calcite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_calcite_bricks_id))));



                Registry.register(Registries.BLOCK, basalt_brick_pillar_id, basalt_brick_pillar);
                Registry.register(Registries.ITEM, basalt_brick_pillar_id, new BlockItem(basalt_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, basalt_brick_pillar_id))));



                Registry.register(Registries.BLOCK, chiseled_red_nether_bricks_id, chiseled_red_nether_bricks);
                Registry.register(Registries.ITEM, chiseled_red_nether_bricks_id, new BlockItem(chiseled_red_nether_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_red_nether_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_granite_bricks_id, cracked_granite_bricks);
                Registry.register(Registries.ITEM, cracked_granite_bricks_id, new BlockItem(cracked_granite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_granite_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_prismarine_bricks_id, cracked_prismarine_bricks);
                Registry.register(Registries.ITEM, cracked_prismarine_bricks_id, new BlockItem(cracked_prismarine_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_prismarine_bricks_id))));



                Registry.register(Registries.BLOCK, dripstone_brick_stairs_id, dripstone_brick_stairs);
                Registry.register(Registries.ITEM, dripstone_brick_stairs_id, new BlockItem(dripstone_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, dripstone_brick_stairs_id))));



                Registry.register(Registries.BLOCK, stone_brick_pillar_id, stone_brick_pillar);
                Registry.register(Registries.ITEM, stone_brick_pillar_id, new BlockItem(stone_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, stone_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cut_diamond_id, cut_diamond);
                Registry.register(Registries.ITEM, cut_diamond_id, new BlockItem(cut_diamond, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_diamond_id))));



                Registry.register(Registries.BLOCK, cracked_andesite_bricks_id, cracked_andesite_bricks);
                Registry.register(Registries.ITEM, cracked_andesite_bricks_id, new BlockItem(cracked_andesite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_andesite_bricks_id))));



                Registry.register(Registries.BLOCK, obsidian_bricks_id, obsidian_bricks);
                Registry.register(Registries.ITEM, obsidian_bricks_id, new BlockItem(obsidian_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, obsidian_bricks_id))));



                Registry.register(Registries.BLOCK, obsidian_brick_wall_id, obsidian_brick_wall);
                Registry.register(Registries.ITEM, obsidian_brick_wall_id, new BlockItem(obsidian_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, obsidian_brick_wall_id))));



                Registry.register(Registries.BLOCK, granite_brick_pillar_id, granite_brick_pillar);
                Registry.register(Registries.ITEM, granite_brick_pillar_id, new BlockItem(granite_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, granite_brick_pillar_id))));



                Registry.register(Registries.BLOCK, chiseled_end_stone_bricks_id, chiseled_end_stone_bricks);
                Registry.register(Registries.ITEM, chiseled_end_stone_bricks_id, new BlockItem(chiseled_end_stone_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_end_stone_bricks_id))));



                Registry.register(Registries.BLOCK, cracked_calcite_bricks_id, cracked_calcite_bricks);
                Registry.register(Registries.ITEM, cracked_calcite_bricks_id, new BlockItem(cracked_calcite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_calcite_bricks_id))));



                Registry.register(Registries.BLOCK, amethyst_bricks_id, amethyst_bricks);
                Registry.register(Registries.ITEM, amethyst_bricks_id, new BlockItem(amethyst_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, amethyst_bricks_id))));



                Registry.register(Registries.BLOCK, calcite_bricks_id, calcite_bricks);
                Registry.register(Registries.ITEM, calcite_bricks_id, new BlockItem(calcite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, calcite_bricks_id))));



                Registry.register(Registries.BLOCK, cut_lapis_slab_id, cut_lapis_slab);
                Registry.register(Registries.ITEM, cut_lapis_slab_id, new BlockItem(cut_lapis_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_lapis_slab_id))));



                Registry.register(Registries.BLOCK, diorite_brick_slab_id, diorite_brick_slab);
                Registry.register(Registries.ITEM, diorite_brick_slab_id, new BlockItem(diorite_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, diorite_brick_slab_id))));



                Registry.register(Registries.BLOCK, cut_iron_slab_id, cut_iron_slab);
                Registry.register(Registries.ITEM, cut_iron_slab_id, new BlockItem(cut_iron_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_iron_slab_id))));



                Registry.register(Registries.BLOCK, chiseled_dripstone_bricks_id, chiseled_dripstone_bricks);
                Registry.register(Registries.ITEM, chiseled_dripstone_bricks_id, new BlockItem(chiseled_dripstone_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_dripstone_bricks_id))));



                Registry.register(Registries.BLOCK, granite_bricks_id, granite_bricks);
                Registry.register(Registries.ITEM, granite_bricks_id, new BlockItem(granite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, granite_bricks_id))));



                Registry.register(Registries.BLOCK, diorite_brick_pillar_id, diorite_brick_pillar);
                Registry.register(Registries.ITEM, diorite_brick_pillar_id, new BlockItem(diorite_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, diorite_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cut_coal_slab_id, cut_coal_slab);
                Registry.register(Registries.ITEM, cut_coal_slab_id, new BlockItem(cut_coal_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_coal_slab_id))));



                Registry.register(Registries.BLOCK, cut_emerald_stairs_id, cut_emerald_stairs);
                Registry.register(Registries.ITEM, cut_emerald_stairs_id, new BlockItem(cut_emerald_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_emerald_stairs_id))));



                Registry.register(Registries.BLOCK, tuff_brick_slab_id, tuff_brick_slab);
                Registry.register(Registries.ITEM, tuff_brick_slab_id, new BlockItem(tuff_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, tuff_brick_slab_id))));



                Registry.register(Registries.BLOCK, dripstone_brick_slab_id, dripstone_brick_slab);
                Registry.register(Registries.ITEM, dripstone_brick_slab_id, new BlockItem(dripstone_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, dripstone_brick_slab_id))));



                Registry.register(Registries.BLOCK, amethyst_brick_wall_id, amethyst_brick_wall);
                Registry.register(Registries.ITEM, amethyst_brick_wall_id, new BlockItem(amethyst_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, amethyst_brick_wall_id))));



                Registry.register(Registries.BLOCK, dripstone_bricks_id, dripstone_bricks);
                Registry.register(Registries.ITEM, dripstone_bricks_id, new BlockItem(dripstone_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, dripstone_bricks_id))));



                Registry.register(Registries.BLOCK, cut_gold_stairs_id, cut_gold_stairs);
                Registry.register(Registries.ITEM, cut_gold_stairs_id, new BlockItem(cut_gold_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_gold_stairs_id))));



                Registry.register(Registries.BLOCK, basalt_brick_wall_id, basalt_brick_wall);
                Registry.register(Registries.ITEM, basalt_brick_wall_id, new BlockItem(basalt_brick_wall, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, basalt_brick_wall_id))));



                Registry.register(Registries.BLOCK, chiseled_prismarine_bricks_id, chiseled_prismarine_bricks);
                Registry.register(Registries.ITEM, chiseled_prismarine_bricks_id, new BlockItem(chiseled_prismarine_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_prismarine_bricks_id))));



                Registry.register(Registries.BLOCK, cut_diamond_slab_id, cut_diamond_slab);
                Registry.register(Registries.ITEM, cut_diamond_slab_id, new BlockItem(cut_diamond_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_diamond_slab_id))));



                Registry.register(Registries.BLOCK, cut_emerald_id, cut_emerald);
                Registry.register(Registries.ITEM, cut_emerald_id, new BlockItem(cut_emerald, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_emerald_id))));



                Registry.register(Registries.BLOCK, chiseled_amethyst_bricks_id, chiseled_amethyst_bricks);
                Registry.register(Registries.ITEM, chiseled_amethyst_bricks_id, new BlockItem(chiseled_amethyst_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_amethyst_bricks_id))));



                Registry.register(Registries.BLOCK, cut_emerald_slab_id, cut_emerald_slab);
                Registry.register(Registries.ITEM, cut_emerald_slab_id, new BlockItem(cut_emerald_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_emerald_slab_id))));



                Registry.register(Registries.BLOCK, end_stone_pillar_id, end_stone_pillar);
                Registry.register(Registries.ITEM, end_stone_pillar_id, new BlockItem(end_stone_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, end_stone_pillar_id))));



                Registry.register(Registries.BLOCK, chiseled_granite_bricks_id, chiseled_granite_bricks);
                Registry.register(Registries.ITEM, chiseled_granite_bricks_id, new BlockItem(chiseled_granite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, chiseled_granite_bricks_id))));



                Registry.register(Registries.BLOCK, calcite_brick_slab_id, calcite_brick_slab);
                Registry.register(Registries.ITEM, calcite_brick_slab_id, new BlockItem(calcite_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, calcite_brick_slab_id))));



                Registry.register(Registries.BLOCK, basalt_bricks_id, basalt_bricks);
                Registry.register(Registries.ITEM, basalt_bricks_id, new BlockItem(basalt_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, basalt_bricks_id))));



                Registry.register(Registries.BLOCK, calcite_brick_pillar_id, calcite_brick_pillar);
                Registry.register(Registries.ITEM, calcite_brick_pillar_id, new BlockItem(calcite_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, calcite_brick_pillar_id))));



                Registry.register(Registries.BLOCK, andesite_brick_slab_id, andesite_brick_slab);
                Registry.register(Registries.ITEM, andesite_brick_slab_id, new BlockItem(andesite_brick_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, andesite_brick_slab_id))));



                Registry.register(Registries.BLOCK, red_nether_brick_pillar_id, red_nether_brick_pillar);
                Registry.register(Registries.ITEM, red_nether_brick_pillar_id, new BlockItem(red_nether_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, red_nether_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cut_redstone_slab_id, cut_redstone_slab);
                Registry.register(Registries.ITEM, cut_redstone_slab_id, new BlockItem(cut_redstone_slab, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_redstone_slab_id))));



                Registry.register(Registries.BLOCK, cut_gold_id, cut_gold);
                Registry.register(Registries.ITEM, cut_gold_id, new BlockItem(cut_gold, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_gold_id))));



                Registry.register(Registries.BLOCK, andesite_brick_pillar_id, andesite_brick_pillar);
                Registry.register(Registries.ITEM, andesite_brick_pillar_id, new BlockItem(andesite_brick_pillar, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, andesite_brick_pillar_id))));



                Registry.register(Registries.BLOCK, cut_lapis_stairs_id, cut_lapis_stairs);
                Registry.register(Registries.ITEM, cut_lapis_stairs_id, new BlockItem(cut_lapis_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_lapis_stairs_id))));



                Registry.register(Registries.BLOCK, tuff_brick_stairs_id, tuff_brick_stairs);
                Registry.register(Registries.ITEM, tuff_brick_stairs_id, new BlockItem(tuff_brick_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, tuff_brick_stairs_id))));



                Registry.register(Registries.BLOCK, cracked_tuff_bricks_id, cracked_tuff_bricks);
                Registry.register(Registries.ITEM, cracked_tuff_bricks_id, new BlockItem(cracked_tuff_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cracked_tuff_bricks_id))));



                Registry.register(Registries.BLOCK, cut_redstone_stairs_id, cut_redstone_stairs);
                Registry.register(Registries.ITEM, cut_redstone_stairs_id, new BlockItem(cut_redstone_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_redstone_stairs_id))));



                Registry.register(Registries.BLOCK, diorite_bricks_id, diorite_bricks);
                Registry.register(Registries.ITEM, diorite_bricks_id, new BlockItem(diorite_bricks, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, diorite_bricks_id))));



                Registry.register(Registries.BLOCK, cut_coal_id, cut_coal);
                Registry.register(Registries.ITEM, cut_coal_id, new BlockItem(cut_coal, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_coal_id))));



                Registry.register(Registries.BLOCK, red_nether_brick_fence_id, red_nether_brick_fence);
                Registry.register(Registries.ITEM, red_nether_brick_fence_id, new BlockItem(red_nether_brick_fence, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, red_nether_brick_fence_id))));



                Registry.register(Registries.BLOCK, cut_diamond_stairs_id, cut_diamond_stairs);
                Registry.register(Registries.ITEM, cut_diamond_stairs_id, new BlockItem(cut_diamond_stairs, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_diamond_stairs_id))));



                Registry.register(Registries.BLOCK, cut_lapis_id, cut_lapis);
                Registry.register(Registries.ITEM, cut_lapis_id, new BlockItem(cut_lapis, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, cut_lapis_id))));


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