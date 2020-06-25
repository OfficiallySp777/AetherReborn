
package com.officiallysp.aether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.officiallysp.aether.itemgroup.AetherTabItemGroup;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class AmbrosiumShardItem extends AetherrebornModElements.ModElement {
	@ObjectHolder("aetherreborn:ambrosium_shard")
	public static final Item block = null;
	public AmbrosiumShardItem(AetherrebornModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AetherTabItemGroup.tab).maxStackSize(64));
			setRegistryName("ambrosium_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
