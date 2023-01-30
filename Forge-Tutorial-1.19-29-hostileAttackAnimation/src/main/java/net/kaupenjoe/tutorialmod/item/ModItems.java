package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.kaupenjoe.tutorialmod.entity.ModEntityTypes;

import net.kaupenjoe.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ACMIUM = ITEMS.register("raw_acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    //tools below
    public static final RegistryObject<Item> EXAMPLE_SWORD = ITEMS.register("example_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 4, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe",
            () -> new AxeItem(Tiers.DIAMOND, 8, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 3, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    //armor below
    public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_CHESTPIECE = ITEMS.register("example_chestpiece",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("example_boots",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));



    public static final RegistryObject<Item> CHOMPER_SPAWN_EGG = ITEMS.register("chomper_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHOMPER, 0x2c68ca, 0xcde0ff,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
