
package com.officiallysp.aether.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.officiallysp.aether.block.AetherGrassBlock;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class AetherTabItemGroup extends AetherrebornModElements.ModElement {
	public AetherTabItemGroup(AetherrebornModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabaether_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AetherGrassBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
