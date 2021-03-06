package net.minestom.server.event.player;

import net.minestom.server.advancements.AdvancementAction;
import net.minestom.server.entity.Player;
import net.minestom.server.event.PlayerEvent;

/**
 * Called when a {@link Player} opens the advancement screens or switch the tab
 * and when he closes the screen.
 */
public class AdvancementTabEvent extends PlayerEvent {

    private final AdvancementAction action;
    private final String tabId;

    public AdvancementTabEvent(Player player, AdvancementAction action, String tabId) {
        super(player);
        this.action = action;
        this.tabId = tabId;
    }

    /**
     * Gets the action.
     *
     * @return the action
     */
    public AdvancementAction getAction() {
        return action;
    }

    /**
     * Gets the tab id.
     * <p>
     * Not null ony if {@link #getAction()} is equal to {@link AdvancementAction#OPENED_TAB}.
     *
     * @return the tab id
     */
    public String getTabId() {
        return tabId;
    }
}
