package com.zandor300.zscore.objects;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSItemBucket extends Item {

	private final String modid;

	public ZSItemBucket(String modid, String unlocalizedName, CreativeTabs tab, Block block) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
		this.modid = modid.toLowerCase();

		GameRegistry.registerItem(this, getUnlocalizedName());
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
