
package com.officiallysp.aether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.officiallysp.aether.itemgroup.AetherTabItemGroup;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class SkyrootAxeItem extends AetherrebornModElements.ModElement {
	@ObjectHolder("aetherreborn:skyroot_axe")
	public static final Item block = null;
	public SkyrootAxeItem(AetherrebornModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 59;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(AetherTabItemGroup.tab)) {
		}.setRegistryName("skyroot_axe"));
	}
}
