package net.marshmod.datagen;

import net.marshmod.MarshMod;
import net.marshmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MarshMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET.get())
                .add(ModItems.ROSE_GOLD_CHESTPLATE.get())
                .add(ModItems.ROSE_GOLD_LEGGINGS.get())
                .add(ModItems.ROSE_GOLD_BOOTS.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.ROSE_GOLD_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ROSE_GOLD_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ROSE_GOLD_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ROSE_GOLD_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ROSE_GOLD_HOE.get());


    }
}
