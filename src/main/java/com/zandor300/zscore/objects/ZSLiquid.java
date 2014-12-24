package com.zandor300.zscore.objects;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSLiquid extends Fluid {

	public ZSLiquid(String unlocalizedName) {
		super(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		FluidRegistry.registerFluid(this);
	}
}
