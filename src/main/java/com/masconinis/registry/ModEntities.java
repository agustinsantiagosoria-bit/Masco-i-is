package com.masconinis.registry;

import com.masconinis.MascoNinis;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.masconinis.entity.LeoncitoEntity;

import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MascoNinis.MOD_ID);

    public static final RegistryObject<EntityType<LeoncitoEntity>> LEONCITO =
        ENTITIES.register(
                "leoncito",
                () -> EntityType.Builder
                        .of(LeoncitoEntity::new, MobCategory.CREATURE)
                        .sized(0.6F, 0.85F)
                        .build("leoncito")
        );


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}