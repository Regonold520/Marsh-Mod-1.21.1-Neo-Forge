package net.marshmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties AMBROSIA = new FoodProperties.Builder().nutrition(13).saturationModifier(0.5F).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 800), 100).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 2), 100).build();
}
