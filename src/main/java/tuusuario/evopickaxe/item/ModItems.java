package com.tuusuario.evopickaxe.item;

import com.tuusuario.evopickaxe.EvoPickaxeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, EvoPickaxeMod.MOD_ID);

    public static final RegistryObject<Item> EVOLVING_PICKAXE = ITEMS.register(
        "evolving_pickaxe",
        () -> new EvolvingPickaxeItem(new Item.Properties().tab(CreativeModeTab.TOOLS))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
