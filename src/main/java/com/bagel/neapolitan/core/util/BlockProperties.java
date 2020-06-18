package com.bagel.neapolitan.core.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockProperties {
	public static final Block.Properties VANILLA 			= Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT);
    public static final Block.Properties CHOCOLATE 			= Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final Block.Properties CHOCOLATE_BRICKS 	= Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final Block.Properties CHOCOLATE_TILES 	= Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    
    public static final Block.Properties STRAWBERRY_BUSH 	= Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0F).sound(SoundType.CROP);
    
    public static final Block.Properties CHOCOLATE_CAKE 	= Block.Properties.from(Blocks.CAKE);
    public static final Block.Properties STRAWBERRY_CAKE 	= Block.Properties.from(Blocks.CAKE);
    public static final Block.Properties VANILLA_CAKE 		= Block.Properties.from(Blocks.CAKE);
}