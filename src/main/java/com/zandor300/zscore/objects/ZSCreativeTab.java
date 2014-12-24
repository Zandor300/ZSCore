package com.zandor300.zscore.objects;

import com.zandor300.zscore.ZSCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zandor on 24-12-2014.
 */
public class ZSCreativeTab {

	public static CreativeTabs createNew(String modId, final Item displayItem, final String name) {
		return new CreativeTabs(modId) {
			@Override
			public Item getTabIconItem() {
				return displayItem;
			}

			@Override
			public String getTranslatedTabLabel() {
				return name;
			}
		};
	}
}
