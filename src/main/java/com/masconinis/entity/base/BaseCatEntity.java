package com.masconinis.entity.base;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;

public abstract class BaseCatEntity extends Cat {

    protected BaseCatEntity(EntityType<? extends Cat> entityType, Level level) {
        super(entityType, level);
    }

}
