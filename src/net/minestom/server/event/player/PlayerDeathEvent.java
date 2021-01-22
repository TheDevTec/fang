package net.minestom.server.event.player;

import net.minestom.server.chat.JsonMessage;
import net.minestom.server.entity.Player;
import net.minestom.server.event.PlayerEvent;

/**
 * Called when a player die in {@link Player#kill()}.
 */
public class PlayerDeathEvent extends PlayerEvent {

    private JsonMessage deathText;
    private JsonMessage chatMessage;

    public PlayerDeathEvent(Player player, JsonMessage deathText, JsonMessage chatMessage) {
        super(player);
        this.deathText = deathText;
        this.chatMessage = chatMessage;
    }

    /**
     * Gets the text displayed in the death screen.
     *
     * @return the death text, can be null
     */
    public JsonMessage getDeathText() {
        return deathText;
    }

    /**
     * Changes the text displayed in the death screen.
     *
     * @param deathText the death text to display, null to remove
     */
    public void setDeathText(JsonMessage deathText) {
        this.deathText = deathText;
    }

    /**
     * Gets the message sent to chat.
     *
     * @return the death chat message
     */
    public JsonMessage getChatMessage() {
        return chatMessage;
    }

    /**
     * Changes the text sent in chat
     *
     * @param chatMessage the death message to send, null to remove
     */
    public void setChatMessage(JsonMessage chatMessage) {
        this.chatMessage = chatMessage;
    }
}
