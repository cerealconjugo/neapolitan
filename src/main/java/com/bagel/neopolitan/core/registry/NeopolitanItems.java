package com.bagel.neopolitan.core.registry;

import com.bagel.neopolitan.common.item.EffectMilkBucketItem;
import com.bagel.neopolitan.core.Neopolitan;
import com.bagel.neopolitan.core.util.RegistryUtils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NeopolitanItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Neopolitan.MODID);
    public static final DeferredRegister<Item> ITEM_OVERRIDES = new DeferredRegister<>(ForgeRegistries.ITEMS, "minecraft");
	
	public static final RegistryObject<Item> CHOCOLATE_MILK_BUCKET	= RegistryUtils.createItem("chocolate_milk_bucket", () -> new EffectMilkBucketItem(EffectType.HARMFUL, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	public static final RegistryObject<Item> STRAWBERRY_MILK_BUCKET	= RegistryUtils.createItem("strawberry_milk_bucket", () -> new EffectMilkBucketItem(EffectType.BENEFICIAL, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> CHOCOLATE_BAR	 		= RegistryUtils.createItem("chocolate_bar", () -> new Item(new Item.Properties().food(NeopolitanFoods.CHOCOLATE_BAR).group(ItemGroup.FOOD)));
//	public static final RegistryObject<Item> STRAWBERRY 			= RegistryUtils.createItem("strawberry", () -> new Item(new Item.Properties().food(NeopolitanFoods.STRAWBERRY).group(ItemGroup.FOOD)));
//	public static final RegistryObject<Item> CHOCOLATE_STRAWBERRY 	= RegistryUtils.createItem("chocolate_strawberry", () -> new Item(new Item.Properties().food(NeopolitanFoods.CHOCOLATE_STRAWBERRY).group(ItemGroup.FOOD)));
//	
	public static final RegistryObject<Item> COOKIE = ITEM_OVERRIDES.register("cookie", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(NeopolitanFoods.COOKIE)));
}
