package com.bagel.neapolitan.core.registry;

import com.bagel.neapolitan.core.Neapolitan;
import com.bagel.neapolitan.core.other.NeapolitanFoods;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.SoupItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Neapolitan.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NeapolitanItems {
	public static final RegistryHelper HELPER = Neapolitan.REGISTRY_HELPER;
	
	
	public static final RegistryObject<Item> CHOCOLATE_BAR	 		= HELPER.createItem("chocolate_bar", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_BAR).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM	= HELPER.createItem("chocolate_ice_cream", () -> new SoupItem(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> CHOCOLATE_CAKE			= HELPER.createItem("chocolate_cake", () -> new BlockItem(NeapolitanBlocks.CHOCOLATE_CAKE.get(), new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1)));	

	public static final RegistryObject<Item> STRAWBERRY_PIPS		= HELPER.createItem("strawberry_pips", () -> new BlockNamedItem(NeapolitanBlocks.STRAWBERRY_BUSH.get(), new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> STRAWBERRIES 			= HELPER.createItem("strawberries", () -> new Item(new Item.Properties().food(NeapolitanFoods.STRAWBERRIES).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM	= HELPER.createItem("strawberry_ice_cream", () -> new SoupItem(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> STRAWBERRY_CAKE		= HELPER.createItem("strawberry_cake", () -> new BlockItem(NeapolitanBlocks.STRAWBERRY_CAKE.get(), new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1)));	
	public static final RegistryObject<Item> STRAWBERRY_SCONES		= HELPER.createItem("strawberry_scones", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	
	public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE	= HELPER.createItem("strawberry_smoothie", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	

	public static final RegistryObject<Item> VANILLA_BEANS			= HELPER.createItem("vanilla_beans", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	
	public static final RegistryObject<Item> DRIED_VANILLA_BEANS	= HELPER.createItem("dried_vanilla_beans", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	
	public static final RegistryObject<Item> VANILLA_ICE_CREAM		= HELPER.createItem("vanilla_ice_cream", () -> new SoupItem(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> VANILLA_CAKE			= HELPER.createItem("vanilla_cake", () -> new BlockItem(NeapolitanBlocks.VANILLA_CAKE.get(), new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1)));	
	public static final RegistryObject<Item> VANILLA_PUDDING		= HELPER.createItem("vanilla_pudding", () -> new SoupItem(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));

	public static final RegistryObject<Item> CHOCOLATE_STRAWBERRIES		= HELPER.createItem("chocolate_strawberries", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	
	public static final RegistryObject<Item> WHITE_STRAWBERRIES			= HELPER.createItem("white_strawberries", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));	
	public static final RegistryObject<Item> VANILLA_CHOCOLATE_FINGERS	= HELPER.createItem("vanilla_chocolate_fingers", () -> new Item(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> NEAPOLITAN_ICE_CREAM		= HELPER.createItem("neapolitan_ice_cream", () -> new SoupItem(new Item.Properties().food(NeapolitanFoods.CHOCOLATE_STRAWBERRIES).containerItem(Items.BOWL).maxStackSize(1).group(ItemGroup.FOOD)));

}