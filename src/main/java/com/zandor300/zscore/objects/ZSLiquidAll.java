package com.zandor300.zscore.objects;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSLiquidAll {

	private ZSLiquid liquid;
	private Block block;
	private ZSItemBucket bucket;

	public ZSLiquidAll(String modid, String unlocalizedName, CreativeTabs tab) {
		liquid = new ZSLiquid(unlocalizedName);
		block = new ZSBlockLiquid(modid, liquid, Material.water, null).setBlockName(unlocalizedName);
		GameRegistry.registerBlock(block, modid + "_" + block.getUnlocalizedName().substring(5));
		liquid.setUnlocalizedName(block.getUnlocalizedName());

		bucket = new ZSItemBucket(modid, unlocalizedName, tab, block);
		bucket.setUnlocalizedName(unlocalizedName + " Bucket").setContainerItem(Items.bucket);
		GameRegistry.registerItem(bucket, "yourBucket");
		FluidContainerRegistry.registerFluidContainer(liquid, new ItemStack(bucket), new ItemStack(Items.bucket));
	}

	public ZSLiquid getLiquid() {
		return liquid;
	}

	public Block getBlock() {
		return block;
	}

	public ZSItemBucket getBucket() {
		return bucket;
	}
}
