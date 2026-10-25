package com.masconinis.entity;

import com.masconinis.entity.base.BaseDogEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;

/**
 * Primera mascota del mod.
 *
 * Inspirada en el perro real Leoncito.
 */
public class LeoncitoEntity extends BaseDogEntity {

    public LeoncitoEntity(EntityType<? extends Wolf> entityType, Level level) {
        super(entityType, level);
    }

}