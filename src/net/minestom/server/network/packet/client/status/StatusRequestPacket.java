package net.minestom.server.network.packet.client.status;

import net.minestom.server.MinecraftServer;
import net.minestom.server.entity.Player;
import net.minestom.server.network.packet.client.ClientPreplayPacket;
import net.minestom.server.network.packet.server.handshake.ResponsePacket;
import net.minestom.server.network.player.PlayerConnection;
import net.minestom.server.ping.ResponseData;
import net.minestom.server.ping.ResponseDataConsumer;
import net.minestom.server.utils.binary.BinaryReader;

public class StatusRequestPacket implements ClientPreplayPacket {

    @Override
    public void process(PlayerConnection connection) {
        ResponseDataConsumer consumer = MinecraftServer.getResponseDataConsumer();
        ResponseData responseData = new ResponseData();

        // Fill default params
        responseData.setName(MinecraftServer.VERSION_NAME);
        responseData.setProtocol(MinecraftServer.PROTOCOL_VERSION);
        responseData.setOnline(MinecraftServer.getConnectionManager().getOnlinePlayers().size());
        responseData.setMaxPlayer(MinecraftServer.getMaxPlayers());
        responseData.setFavicon("");
        responseData.setDescription("");
        for(Player p : MinecraftServer.getConnectionManager().getOnlinePlayers())
        responseData.addPlayer(p.getUsername(), p.getUuid());
        
        if (consumer != null)
            consumer.accept(connection, responseData);

        ResponsePacket responsePacket = new ResponsePacket();
        responsePacket.jsonResponse = responseData.build().toString();

        connection.sendPacket(responsePacket);
    }

    @Override
    public void read(BinaryReader reader) {
        // Empty
    }
}
