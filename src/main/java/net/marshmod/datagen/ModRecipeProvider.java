package net.marshmod.datagen;

import net.marshmod.MarshMod;
import net.marshmod.block.ModBlocks;
import net.marshmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_INGOT, 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK)
                .unlockedBy("has_rose_gold_block", has(ModBlocks.ROSE_GOLD_BLOCK)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ROSE_GOLD_BLOCK.get())
                .requires(ModItems.RAW_ROSE_GOLD, 9)
                .unlockedBy("has_raw_rose_gold", has(ModItems.RAW_ROSE_GOLD)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ROSE_GOLD, 9)
                .requires(ModBlocks.RAW_ROSE_GOLD_BLOCK)
                .unlockedBy("has_raw_rose_gold_block", has(ModBlocks.RAW_ROSE_GOLD_BLOCK))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(MarshMod.MODID, "raw_rose_gold_from_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ROSE_GOLD, 1)
                .requires(Items.RAW_COPPER, 2)
                .requires(Items.RAW_GOLD, 2)
                .unlockedBy("has_raw_gold", has(Items.RAW_GOLD))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(MarshMod.MODID, "raw_rose_gold_mixture"));



        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.MIRROR.get())
                .pattern("RRR")
                .pattern("RER")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('E', Items.ENDER_EYE)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT)).save(recipeOutput);

        oreSmelting(recipeOutput,
                List.of(ModItems.RAW_ROSE_GOLD.get()),
                RecipeCategory.MISC,
                ModItems.ROSE_GOLD_INGOT.get(),
                0.7f,
                200,
                "rose_gold");

        oreBlasting(recipeOutput,
                List.of(ModItems.RAW_ROSE_GOLD.get()),
                RecipeCategory.MISC,
                ModItems.ROSE_GOLD_INGOT.get(),
                0.7f,
                100,
                "rose_gold");

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SWORD.get())
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE.get())
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE.get())
                .pattern("RR")
                .pattern("RS")
                .pattern(" S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL.get())
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE.get())
                .pattern("RR")
                .pattern(" S")
                .pattern(" S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy("has_rose_gold_ingot", has(ModItems.ROSE_GOLD_INGOT))
                .save(recipeOutput);


    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MarshMod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
