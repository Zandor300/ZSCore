package com.zandor300.zscore.objects;

import com.zandor300.zscore.ZSCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSItem extends Item {

	private final String modid;

	public ZSItem(String modid, String unlocalizedName, CreativeTabs tab) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
		this.modid = modid.toLowerCase();
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
