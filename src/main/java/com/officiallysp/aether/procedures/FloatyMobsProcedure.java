package com.officiallysp.aether.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Collection;

import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class FloatyMobsProcedure extends AetherrebornModElements.ModElement {
	public FloatyMobsProcedure(AetherrebornModElements instance) {
		super(instance, 102);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FloatyMobs!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		while (((new Object() {
			boolean check() {
				if (entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.JUMP_BOOST)
							return true;
					}
				}
				return false;
			}
		}.check()) && (new Object() {
			boolean check() {
				if (entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.JUMP_BOOST)
							return true;
					}
				}
				return false;
			}
		}.check()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 1, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 1, (int) 1, (false), (false)));
		}
	}
}
