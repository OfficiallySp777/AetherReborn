
package com.officiallysp.aether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.officiallysp.aether.itemgroup.AetherTabItemGroup;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class GravititeShovelItem extends AetherrebornModElements.ModElement {
	@ObjectHolder("aetherreborn:gravitite_shovel")
	public static final Item block = null;
	public GravititeShovelItem(AetherrebornModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(AetherTabItemGroup.tab)) {
		}.setRegistryName("gravitite_shovel"));
	}
}
