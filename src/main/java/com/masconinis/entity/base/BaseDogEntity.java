package com.masconinis.entity.base;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;

public abstract class BaseDogEntity extends Wolf {

    protected BaseDogEntity(EntityType<? extends Wolf> entityType, Level level) {
        super(entityType, level);
    }

}