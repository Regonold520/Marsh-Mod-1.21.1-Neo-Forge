package net.marshmod.item;

import net.marshmod.MarshMod;
import net.marshmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarshMod.MODID);

    public static Supplier<CreativeModeTab> GEO_FOSSILS_TAB = CREATIVE_MODE_TAB.register("marsh_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.MIRROR.asItem()))
                    .title(Component.literal("Marsh Items"))

                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
                            output.accept(ModItems.ROSE_GOLD_INGOT);
                            output.accept(ModItems.RAW_ROSE_GOLD);
                            output.accept(ModItems.ROSE_GOLD_SWORD);
                            output.accept(ModItems.ROSE_GOLD_PICKAXE);
                            output.accept(ModItems.ROSE_GOLD_AXE);
                            output.accept(ModItems.ROSE_GOLD_SHOVEL);
                            output.accept(ModItems.ROSE_GOLD_HOE);
                            output.accept(ModItems.MIRROR);
                            output.accept(ModItems.AMBROSIA);
                            output.accept(ModBlocks.ROSE_GOLD_BLOCK);
                            output.accept(ModBlocks.RAW_ROSE_GOLD_BLOCK);

                            output.accept(ModItems.ROSE_GOLD_HELMET);
                            output.accept(ModItems.ROSE_GOLD_CHESTPLATE);
                            output.accept(ModItems.ROSE_GOLD_LEGGINGS);
                            output.accept(ModItems.ROSE_GOLD_BOOTS);


                            output.accept(ModItems.TR3ES_DISC);
                            output.accept(ModItems.ESCAPE_DISC);
                        }
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
