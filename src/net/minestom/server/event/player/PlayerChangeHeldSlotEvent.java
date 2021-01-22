package net.minestom.server.event.player;

import net.minestom.server.entity.Player;
import net.minestom.server.event.CancellableEvent;
import net.minestom.server.event.PlayerEvent;
import net.minestom.server.utils.MathUtils;
import net.minestom.server.utils.validate.Check;

/**
 * Called when a player change his held slot (by pressing 1-9 keys).
 */
public class PlayerChangeHeldSlotEvent extends PlayerEvent implements CancellableEvent {

    private byte slot;

    private boolean cancelled;

    public PlayerChangeHeldSlotEvent(Player player, byte slot) {
        super(player);
        this.slot = slot;
    }

    /**
     * Gets the slot which the player will held.
     *
     * @return the held slot
     */
    public byte getSlot() {
        return slot;
    }

    /**
     * Changes the final held slot of the player.
     *
     * @param slot the new held slot
     * @throws IllegalArgumentException if <code>slot</code> is not between 0 and 8
     */
    public void setSlot(byte slot) {
        Check.argCondition(!MathUtils.isBetween(slot, 0, 8), "The held slot needs to be between 0 and 8");
        this.slot = slot;
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
