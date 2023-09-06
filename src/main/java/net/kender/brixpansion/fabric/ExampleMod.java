package net.kender.brixpansion.fabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

  // This logger is used to write text to the console and the log file.
  // It is considered best practice to use your mod id as the logger's name.
  // That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger LOGGER = LoggerFactory.getLogger("brixpansion-refabricated");

  public static final Block cut_netherite = new cut_netherite(FabricBlockSettings.create().strength(4.0f));

  public static final Block dripstone_brick_pillar = new dripstone_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_netherite_stairs = new cut_netherite_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f)); 

  public static final Block diorite_brick_wall = new diorite_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_diorite_bricks = new chiseled_diorite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_basalt_bricks = new cracked_basalt_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block diorite_brick_stairs = new diorite_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f)); 

  public static final Block cut_iron_stairs = new cut_iron_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block obsidian_brick_slab = new obsidian_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_coal_stairs = new cut_coal_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_coal = new cut_coal(FabricBlockSettings.create().strength(4.0f));

  public static final Block tuff_brick_wall = new tuff_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block granite_brick_wall = new granite_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_obsidian_bricks = new chiseled_obsidian_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_gold_slab = new cut_gold_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block granite_brick_stairs = new granite_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f)); 

  public static final Block dripstone_brick_wall = new dripstone_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block nether_brick_pillar = new nether_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block amethyst_brick_slab = new amethyst_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block basalt_brick_slab = new basalt_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block basalt_brick_stairs = new basalt_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));   

  public static final Block chiseled_tuff_bricks = new chiseled_tuff_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_purpur = new cracked_purpur(FabricBlockSettings.create().strength(4.0f));

  public static final Block andesite_brick_stairs = new andesite_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_dripstone_bricks = new cracked_dripstone_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_andesite_bricks = new chiseled_andesite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_red_nether_bricks = new cracked_red_nether_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_iron = new cut_iron(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_basalt_bricks = new chiseled_basalt_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block calcite_brick_stairs = new calcite_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f)); 

  public static final Block andesite_brick_wall = new andesite_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block tuff_brick_pillar = new tuff_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block obsidian_brick_stairs = new obsidian_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_redstone = new cut_redstone(FabricBlockSettings.create().strength(4.0f));

  public static final Block amethyst_brick_stairs = new amethyst_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block obsidian_brick_pillar = new obsidian_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_diorite_bricks = new cracked_diorite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_purpur = new chiseled_purpur(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_netherite_slab = new cut_netherite_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_amethyst_bricks = new cracked_amethyst_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block calcite_brick_wall = new calcite_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block prismarine_pillar = new prismarine_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block andesite_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_end_stone_bricks = new cracked_end_stone_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block granite_brick_slab = new granite_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_obsidian_bricks = new cracked_obsidian_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block amethyst_brick_pillar = new amethyst_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block tuff_bricks = new tuff_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_calcite_bricks = new chiseled_calcite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block basalt_brick_pillar = new basalt_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_red_nether_bricks = new chiseled_red_nether_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_granite_bricks = new cracked_granite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_prismarine_bricks = new cracked_prismarine_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block dripstone_brick_stairs = new dripstone_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block stone_brick_pillar = new stone_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_diamond = new cut_diamond(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_andesite_bricks = new cracked_andesite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block obsidian_bricks = new obsidian_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block obsidian_brick_wall = new obsidian_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block granite_brick_pillar = new granite_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_end_stone_bricks = new chiseled_end_stone_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cracked_calcite_bricks = new cracked_calcite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block amethyst_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block calcite_bricks = new calcite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_lapis_slab = new cut_lapis_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block diorite_brick_slab = new diorite_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_iron_slab = new cut_iron_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_dripstone_bricks = new chiseled_dripstone_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block granite_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block diorite_brick_pillar = new diorite_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_coal_slab = new cut_coal_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_emerald_stairs = new cut_emerald_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));     

  public static final Block tuff_brick_slab = new tuff_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block dripstone_brick_slab = new dripstone_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block amethyst_brick_wall = new amethyst_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block dripstone_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_gold_stairs = new cut_gold_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block basalt_brick_wall = new basalt_brick_wall(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_prismarine_bricks = new chiseled_prismarine_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_diamond_slab = new cut_diamond_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_emerald = new cut_emerald(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_amethyst_bricks = new chiseled_amethyst_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_emerald_slab = new cut_emerald_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block end_stone_pillar = new end_stone_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block chiseled_granite_bricks = new chiseled_granite_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block calcite_brick_slab = new calcite_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block basalt_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block calcite_brick_pillar = new calcite_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block andesite_brick_slab = new andesite_brick_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block red_nether_brick_pillar = new red_nether_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_redstone_slab = new cut_redstone_slab(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_gold = new cut_gold(FabricBlockSettings.create().strength(4.0f));

  public static final Block andesite_brick_pillar = new andesite_brick_pillar(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_lapis_stairs = new cut_lapis_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));

  public static final Block tuff_brick_stairs = new tuff_brick_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));       

  public static final Block cracked_tuff_bricks = new cracked_tuff_bricks(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_redstone_stairs = new cut_redstone_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));   

  public static final Block diorite_bricks = new Block(FabricBlockSettings.create().strength(4.0f));

  public static final Block red_nether_brick_fence = new red_nether_brick_fence(FabricBlockSettings.create().strength(4.0f));

  public static final Block cut_diamond_stairs = new cut_diamond_stairs(getBaseBlockState(),FabricBlockSettings.create().strength(4.0f));
  
  public static final Block cut_lapis = new cut_lapis(FabricBlockSettings.create().strength(4.0f));

  public static final Block example_block = new Block(FabricBlockSettings.create().strength(4.0f).breakInstantly());


  @Override
  public void onInitialize() {
   
   //registeries
    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "example_block"), example_block);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "example_block"), new BlockItem(example_block, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_netherite"), cut_netherite);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_netherite"), new BlockItem(cut_netherite, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "dripstone_brick_pillar"), dripstone_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "dripstone_brick_pillar"), new BlockItem(dripstone_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_netherite_stairs"), cut_netherite_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_netherite_stairs"), new BlockItem(cut_netherite_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "diorite_brick_wall"), diorite_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "diorite_brick_wall"), new BlockItem(diorite_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_diorite_bricks"), chiseled_diorite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_diorite_bricks"), new BlockItem(chiseled_diorite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_basalt_bricks"), cracked_basalt_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_basalt_bricks"), new BlockItem(cracked_basalt_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "diorite_brick_stairs"), diorite_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "diorite_brick_stairs"), new BlockItem(diorite_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_iron_stairs"), cut_iron_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_iron_stairs"), new BlockItem(cut_iron_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "obsidian_brick_slab"), obsidian_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "obsidian_brick_slab"), new BlockItem(obsidian_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_coal_stairs"), cut_coal_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_coal_stairs"), new BlockItem(cut_coal_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "tuff_brick_wall"), tuff_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "tuff_brick_wall"), new BlockItem(tuff_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "granite_brick_wall"), granite_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "granite_brick_wall"), new BlockItem(granite_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_obsidian_bricks"), chiseled_obsidian_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_obsidian_bricks"), new BlockItem(chiseled_obsidian_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_gold_slab"), cut_gold_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_gold_slab"), new BlockItem(cut_gold_slab, new FabricItemSettings())); 

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "granite_brick_stairs"), granite_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "granite_brick_stairs"), new BlockItem(granite_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "dripstone_brick_wall"), dripstone_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "dripstone_brick_wall"), new BlockItem(dripstone_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "nether_brick_pillar"), nether_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "nether_brick_pillar"), new BlockItem(nether_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "amethyst_brick_slab"), amethyst_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "amethyst_brick_slab"), new BlockItem(amethyst_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "basalt_brick_slab"), basalt_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "basalt_brick_slab"), new BlockItem(basalt_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "basalt_brick_stairs"), basalt_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "basalt_brick_stairs"), new BlockItem(basalt_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_tuff_bricks"), chiseled_tuff_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_tuff_bricks"), new BlockItem(chiseled_tuff_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_purpur"), cracked_purpur);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_purpur"), new BlockItem(cracked_purpur, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "andesite_brick_stairs"), andesite_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "andesite_brick_stairs"), new BlockItem(andesite_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_dripstone_bricks"), cracked_dripstone_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_dripstone_bricks"), new BlockItem(cracked_dripstone_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_andesite_bricks"), chiseled_andesite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_andesite_bricks"), new BlockItem(chiseled_andesite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_red_nether_bricks"), cracked_red_nether_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_red_nether_bricks"), new BlockItem(cracked_red_nether_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_iron"), cut_iron);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_iron"), new BlockItem(cut_iron, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_basalt_bricks"), chiseled_basalt_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_basalt_bricks"), new BlockItem(chiseled_basalt_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "calcite_brick_stairs"), calcite_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "calcite_brick_stairs"), new BlockItem(calcite_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "andesite_brick_wall"), andesite_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "andesite_brick_wall"), new BlockItem(andesite_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "tuff_brick_pillar"), tuff_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "tuff_brick_pillar"), new BlockItem(tuff_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "obsidian_brick_stairs"), obsidian_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "obsidian_brick_stairs"), new BlockItem(obsidian_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_redstone"), cut_redstone);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_redstone"), new BlockItem(cut_redstone, new FabricItemSettings()));   

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "amethyst_brick_stairs"), amethyst_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "amethyst_brick_stairs"), new BlockItem(amethyst_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "obsidian_brick_pillar"), obsidian_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "obsidian_brick_pillar"), new BlockItem(obsidian_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_diorite_bricks"), cracked_diorite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_diorite_bricks"), new BlockItem(cracked_diorite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_purpur"), chiseled_purpur);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_purpur"), new BlockItem(chiseled_purpur, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_netherite_slab"), cut_netherite_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_netherite_slab"), new BlockItem(cut_netherite_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_amethyst_bricks"), cracked_amethyst_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_amethyst_bricks"), new BlockItem(cracked_amethyst_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "calcite_brick_wall"), calcite_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "calcite_brick_wall"), new BlockItem(calcite_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "prismarine_pillar"), prismarine_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "prismarine_pillar"), new BlockItem(prismarine_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "andesite_bricks"), andesite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "andesite_bricks"), new BlockItem(andesite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_end_stone_bricks"), cracked_end_stone_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_end_stone_bricks"), new BlockItem(cracked_end_stone_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "granite_brick_slab"), granite_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "granite_brick_slab"), new BlockItem(granite_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_obsidian_bricks"), cracked_obsidian_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_obsidian_bricks"), new BlockItem(cracked_obsidian_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "amethyst_brick_pillar"), amethyst_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "amethyst_brick_pillar"), new BlockItem(amethyst_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "tuff_bricks"), tuff_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "tuff_bricks"), new BlockItem(tuff_bricks, new FabricItemSettings()));     

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_calcite_bricks"), chiseled_calcite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_calcite_bricks"), new BlockItem(chiseled_calcite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "basalt_brick_pillar"), basalt_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "basalt_brick_pillar"), new BlockItem(basalt_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_red_nether_bricks"), chiseled_red_nether_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_red_nether_bricks"), new BlockItem(chiseled_red_nether_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_granite_bricks"), cracked_granite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_granite_bricks"), new BlockItem(cracked_granite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_prismarine_bricks"), cracked_prismarine_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_prismarine_bricks"), new BlockItem(cracked_prismarine_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "dripstone_brick_stairs"), dripstone_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "dripstone_brick_stairs"), new BlockItem(dripstone_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "stone_brick_pillar"), stone_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "stone_brick_pillar"), new BlockItem(stone_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_diamond"), cut_diamond);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_diamond"), new BlockItem(cut_diamond, new FabricItemSettings()));     

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_andesite_bricks"), cracked_andesite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_andesite_bricks"), new BlockItem(cracked_andesite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "obsidian_bricks"), obsidian_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "obsidian_bricks"), new BlockItem(obsidian_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "obsidian_brick_wall"), obsidian_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "obsidian_brick_wall"), new BlockItem(obsidian_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "granite_brick_pillar"), granite_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "granite_brick_pillar"), new BlockItem(granite_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_end_stone_bricks"), chiseled_end_stone_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_end_stone_bricks"), new BlockItem(chiseled_end_stone_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_calcite_bricks"), cracked_calcite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_calcite_bricks"), new BlockItem(cracked_calcite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "amethyst_bricks"), amethyst_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "amethyst_bricks"), new BlockItem(amethyst_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "calcite_bricks"), calcite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "calcite_bricks"), new BlockItem(calcite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_lapis_slab"), cut_lapis_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_lapis_slab"), new BlockItem(cut_lapis_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "diorite_brick_slab"), diorite_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "diorite_brick_slab"), new BlockItem(diorite_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_iron_slab"), cut_iron_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_iron_slab"), new BlockItem(cut_iron_slab, new FabricItemSettings())); 

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_dripstone_bricks"), chiseled_dripstone_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_dripstone_bricks"), new BlockItem(chiseled_dripstone_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "granite_bricks"), granite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "granite_bricks"), new BlockItem(granite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "diorite_brick_pillar"), diorite_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "diorite_brick_pillar"), new BlockItem(diorite_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_coal_slab"), cut_coal_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_coal_slab"), new BlockItem(cut_coal_slab, new FabricItemSettings())); 

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_emerald_stairs"), cut_emerald_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_emerald_stairs"), new BlockItem(cut_emerald_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "tuff_brick_slab"), tuff_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "tuff_brick_slab"), new BlockItem(tuff_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "dripstone_brick_slab"), dripstone_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "dripstone_brick_slab"), new BlockItem(dripstone_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "amethyst_brick_wall"), amethyst_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "amethyst_brick_wall"), new BlockItem(amethyst_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "dripstone_bricks"), dripstone_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "dripstone_bricks"), new BlockItem(dripstone_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_gold_stairs"), cut_gold_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_gold_stairs"), new BlockItem(cut_gold_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "basalt_brick_wall"), basalt_brick_wall);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "basalt_brick_wall"), new BlockItem(basalt_brick_wall, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_prismarine_bricks"), chiseled_prismarine_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_prismarine_bricks"), new BlockItem(chiseled_prismarine_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_diamond_slab"), cut_diamond_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_diamond_slab"), new BlockItem(cut_diamond_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_emerald"), cut_emerald);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_emerald"), new BlockItem(cut_emerald, new FabricItemSettings()));     

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_amethyst_bricks"), chiseled_amethyst_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_amethyst_bricks"), new BlockItem(chiseled_amethyst_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_emerald_slab"), cut_emerald_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_emerald_slab"), new BlockItem(cut_emerald_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "end_stone_pillar"), end_stone_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "end_stone_pillar"), new BlockItem(end_stone_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "chiseled_granite_bricks"), chiseled_granite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "chiseled_granite_bricks"), new BlockItem(chiseled_granite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "calcite_brick_slab"), calcite_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "calcite_brick_slab"), new BlockItem(calcite_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "basalt_bricks"), basalt_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "basalt_bricks"), new BlockItem(basalt_bricks, new FabricItemSettings())); 

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "calcite_brick_pillar"), calcite_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "calcite_brick_pillar"), new BlockItem(calcite_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "andesite_brick_slab"), andesite_brick_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "andesite_brick_slab"), new BlockItem(andesite_brick_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "red_nether_brick_pillar"), red_nether_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "red_nether_brick_pillar"), new BlockItem(red_nether_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_redstone_slab"), cut_redstone_slab);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_redstone_slab"), new BlockItem(cut_redstone_slab, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_gold"), cut_gold);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_gold"), new BlockItem(cut_gold, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "andesite_brick_pillar"), andesite_brick_pillar);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "andesite_brick_pillar"), new BlockItem(andesite_brick_pillar, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_lapis_stairs"), cut_lapis_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_lapis_stairs"), new BlockItem(cut_lapis_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "tuff_brick_stairs"), tuff_brick_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "tuff_brick_stairs"), new BlockItem(tuff_brick_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cracked_tuff_bricks"), cracked_tuff_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cracked_tuff_bricks"), new BlockItem(cracked_tuff_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_redstone_stairs"), cut_redstone_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_redstone_stairs"), new BlockItem(cut_redstone_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "diorite_bricks"), diorite_bricks);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "diorite_bricks"), new BlockItem(diorite_bricks, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_coal"), cut_coal);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_coal"), new BlockItem(cut_coal, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "red_nether_brick_fence"), red_nether_brick_fence);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "red_nether_brick_fence"), new BlockItem(red_nether_brick_fence, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_diamond_stairs"), cut_diamond_stairs);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_diamond_stairs"), new BlockItem(cut_diamond_stairs, new FabricItemSettings()));

    Registry.register(Registries.BLOCK, new Identifier("brixpansion", "cut_lapis"), cut_lapis);
    Registry.register(Registries.ITEM, new Identifier("brixpansion", "cut_lapis"), new BlockItem(cut_lapis, new FabricItemSettings()));

   //creative inventory

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