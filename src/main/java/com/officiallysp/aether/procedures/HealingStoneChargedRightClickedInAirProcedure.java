package com.officiallysp.aether.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import com.officiallysp.aether.item.HealingStoneDischargedItem;
import com.officiallysp.aether.item.HealingStoneChargedItem;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class HealingStoneChargedRightClickedInAirProcedure extends AetherrebornModElements.ModElement {
	public HealingStoneChargedRightClickedInAirProcedure(AetherrebornModElements instance) {
		super(instance, 89);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HealingStoneChargedRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 138000, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 138000, (int) 1));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(HealingStoneDischargedItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory
					.clearMatchingItems(p -> new ItemStack(HealingStoneChargedItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
	}
}
