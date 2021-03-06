package net.minestom.server.event.entity;

import net.minestom.server.entity.Entity;
import net.minestom.server.event.EntityEvent;

/**
 * Called when an entity ticks itself.
 * Same event instance used for all tick events for the same entity.
 */
public class EntityTickEvent extends EntityEvent {

    public EntityTickEvent(Entity entity) {
        super(entity);
    }

}
