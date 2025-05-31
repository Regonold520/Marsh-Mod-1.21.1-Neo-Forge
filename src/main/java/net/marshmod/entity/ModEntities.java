package net.marshmod.entity;

import net.marshmod.MarshMod;
import net.marshmod.entity.custom.TerranceEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MarshMod.MODID);

    public static final Supplier<EntityType<TerranceEntity>> TERRANCE =
            ENTITY_TYPES.register("terrance", () -> EntityType.Builder.of(TerranceEntity::new, MobCategory.CREATURE).sized(0.75f, 0.35f)
                    .build("terrance"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
