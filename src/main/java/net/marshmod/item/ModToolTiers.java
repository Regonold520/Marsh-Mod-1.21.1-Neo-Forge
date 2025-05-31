package net.marshmod.item;

import net.marshmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ROSE_GOLD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ROSE_GOLD_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT));
}
