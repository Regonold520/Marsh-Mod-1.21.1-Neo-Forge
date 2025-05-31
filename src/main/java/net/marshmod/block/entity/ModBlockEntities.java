package net.marshmod.block.entity;

import net.marshmod.MarshMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MarshMod.MODID);

//    public static final Supplier<BlockEntityType<SynthesiserBlockEntity>> SYNTH_BE =
//            BLOCK_ENTITIES.register("synth_be", () -> BlockEntityType.Builder.of(
//                    SynthesiserBlockEntity::new, ModBlocks.SYNTH.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
