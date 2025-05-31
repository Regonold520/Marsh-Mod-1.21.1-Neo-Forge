package net.marshmod.item;

import net.marshmod.MarshMod;
import net.marshmod.item.custom.Ambrosia;
import net.marshmod.item.custom.Mirror;
import net.marshmod.item.custom.ModArmorMaterials;
import net.marshmod.item.custom.ModFoodProperties;
import net.marshmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MarshMod.MODID);

    public static final DeferredItem<ArmorItem> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));

    public static final DeferredItem<ArmorItem> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));

    public static final DeferredItem<ArmorItem> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));

    public static final DeferredItem<ArmorItem> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static final DeferredItem<Item> TR3ES_DISC = ITEMS.register("tr3es_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.T3EES_KEY).stacksTo(1)));

    public static final DeferredItem<Item> ESCAPE_DISC = ITEMS.register("escape_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ESCAPE_KEY).stacksTo(1)));

    public static final DeferredItem<Mirror> MIRROR = ITEMS.register("mirror",
            () -> new Mirror(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Ambrosia> AMBROSIA = ITEMS.register("ambrosia",
            () -> new Ambrosia(new Item.Properties().food(ModFoodProperties.AMBROSIA).stacksTo(16)));

    public static final DeferredItem<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ROSE_GOLD = ITEMS.register("raw_rose_gold",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModToolTiers.ROSE_GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ROSE_GOLD, 5, -2.4f))));

    public static final DeferredItem<PickaxeItem> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
                () -> new PickaxeItem(ModToolTiers.ROSE_GOLD, new Item.Properties()
                        .attributes(PickaxeItem.createAttributes(ModToolTiers.ROSE_GOLD, 1.0F, -2.8f))));

    public static final DeferredItem<AxeItem> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
                () -> new AxeItem(ModToolTiers.ROSE_GOLD, new Item.Properties()
                        .attributes(AxeItem.createAttributes(ModToolTiers.ROSE_GOLD, 6, -3.2f))));

    public static final DeferredItem<ShovelItem> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
                () -> new ShovelItem(ModToolTiers.ROSE_GOLD, new Item.Properties()
                        .attributes(ShovelItem.createAttributes(ModToolTiers.ROSE_GOLD, 1.5F, -3.0f))));

    public static final DeferredItem<HoeItem> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
                () -> new HoeItem(ModToolTiers.ROSE_GOLD, new Item.Properties()
                        .attributes(HoeItem.createAttributes(ModToolTiers.ROSE_GOLD, 0, -3.0f))));


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
