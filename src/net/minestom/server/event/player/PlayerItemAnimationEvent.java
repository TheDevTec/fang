package net.minestom.server.event.player;

import net.minestom.server.entity.Player;
import net.minestom.server.event.CancellableEvent;
import net.minestom.server.event.PlayerEvent;

/**
 * Used when a {@link Player} finish the animation of an item.
 *
 * @see ItemAnimationType
 */
public class PlayerItemAnimationEvent extends PlayerEvent implements CancellableEvent {

    private final ItemAnimationType armAnimationType;

    private boolean cancelled;

    public PlayerItemAnimationEvent(Player player, ItemAnimationType armAnimationType) {
        super(player);
        this.armAnimationType = armAnimationType;
    }

    /**
     * Gets the animation.
     *
     * @return the animation
     */
    public ItemAnimationType getArmAnimationType() {
        return armAnimationType;
    }

    public enum ItemAnimationType {
        BOW,
        CROSSBOW,
        TRIDENT,
        SHIELD,
        EAT
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
