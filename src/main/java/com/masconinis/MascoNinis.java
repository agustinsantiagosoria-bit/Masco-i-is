package com.masconinis;

import net.minecraftforge.fml.common.Mod;

import com.masconinis.registry.ModEntities;
import com.masconinis.registry.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MascoNinis.MOD_ID)
public class MascoNinis {
    public static final String MOD_ID = "masconinis";
    private final IEventBus modEventBus;

    public MascoNinis() {
        modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.register(modEventBus);
        ModItems.register(modEventBus);
    }
}
