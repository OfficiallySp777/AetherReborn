
package com.officiallysp.aether.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import com.officiallysp.aether.procedures.HealingStoneChargedRightClickedInAirProcedure;
import com.officiallysp.aether.itemgroup.AetherTabItemGroup;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class HealingStoneChargedItem extends AetherrebornModElements.ModElement {
	@ObjectHolder("aetherreborn:healing_stone_charged")
	public static final Item block = null;
	public HealingStoneChargedItem(AetherrebornModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AetherTabItemGroup.tab).maxStackSize(64));
			setRegistryName("healing_stone_charged");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				HealingStoneChargedRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
