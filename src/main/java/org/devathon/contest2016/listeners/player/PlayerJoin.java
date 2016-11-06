package org.devathon.contest2016.listeners.player;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.devathon.contest2016.DevathonPlugin;
import org.devathon.contest2016.Mecha;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        DevathonPlugin.getInstance().getMechaManager().getPlayerHasMecha().put(event.getPlayer().getUniqueId(), false);
        DevathonPlugin.getInstance().getMechaManager().getPlayerMechaMap().put(event.getPlayer().getUniqueId(), new Mecha());

        event.setJoinMessage(null);
        event.getPlayer().sendMessage(ChatColor.GOLD + "Look in the book to find out how the mech suit works!");
    }

}
