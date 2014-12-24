package com.zandor300.zscore.objects;

import com.zandor300.zscore.ZSCore;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by Smith on 2-12-2014.
 */
public class ZSItemFood extends ItemFood {

	private final String modid;

	public ZSItemFood(String modid, String unlocalizedName, int id, boolean b, CreativeTabs tab) {
		super(id, b);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);

		this.modid = modid.toLowerCase();

		GameRegistry.registerItem(this, getUnlocalizedName());
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", modid + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", modid + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
