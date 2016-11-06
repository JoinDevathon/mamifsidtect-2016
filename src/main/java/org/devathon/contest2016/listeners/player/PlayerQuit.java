package org.devathon.contest2016.listeners.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.devathon.contest2016.DevathonPlugin;
import org.devathon.contest2016.MechaManager;

public class PlayerQuit implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        if (DevathonPlugin.getInstance().getMechaManager().playerHasMecha(event.getPlayer())) {
            //TODO insert method to despawn player mecha when they leave the server
        }

        event.setQuitMessage(null);
    }

}
