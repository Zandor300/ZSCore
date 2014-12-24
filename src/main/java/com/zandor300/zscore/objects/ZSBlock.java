package com.zandor300.zscore.objects;

import com.zandor300.zscore.ZSCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSBlock extends Block {

	private final String modid;

	public ZSBlock(String modid, String unlocalizedName, CreativeTabs tab, Material material, float hardness, float resistance, SoundType stepSound) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(stepSound);

		this.modid = modid.toLowerCase();
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
