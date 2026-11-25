package com.tuusuario.evopickaxe;

import com.tuusuario.evopickaxe.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EvoPickaxeMod.MOD_ID)
public class EvoPickaxeMod {

    public static final String MOD_ID = "evopickaxe";

    public EvoPickaxeMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
    }
}
