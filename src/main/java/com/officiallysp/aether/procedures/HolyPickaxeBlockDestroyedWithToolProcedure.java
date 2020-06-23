package com.officiallysp.aether.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import com.officiallysp.aether.item.AmbrosiumShardItem;
import com.officiallysp.aether.AetherrebornModElements;

@AetherrebornModElements.ModElement.Tag
public class HolyPickaxeBlockDestroyedWithToolProcedure extends AetherrebornModElements.ModElement {
	public HolyPickaxeBlockDestroyedWithToolProcedure(AetherrebornModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HolyPickaxeBlockDestroyedWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.1)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(AmbrosiumShardItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
