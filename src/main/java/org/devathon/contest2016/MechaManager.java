package org.devathon.contest2016;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class MechaManager {

    private HashMap<UUID, Boolean> playerHasMecha;
    private HashMap<UUID, Mecha> playerMechaMap;

    public MechaManager() {
        this.playerHasMecha = new HashMap<UUID, Boolean>();
        this.playerMechaMap = new HashMap<UUID, Mecha>();
    }

    public HashMap<UUID, Boolean> getPlayerHasMecha() {
        return playerHasMecha;
    }

    public HashMap<UUID, Mecha> getPlayerMechaMap() {
        return playerMechaMap;
    }

    public boolean playerHasMecha(Player player) {
        if (playerHasMecha.get(player.getUniqueId())) {
            return true;
        }

        return false;
    }

    public boolean playerHasMecha(UUID uuid) {
        if (playerHasMecha.get(uuid)) {
            return true;
        }

        return false;
    }

    public Mecha getPlayerMecha(Player player) {
        if (!playerHasMecha(player)) {
            return null;
        }

        return playerMechaMap.get(player.getUniqueId());
    }

    public Mecha getPlayerMecha(UUID uuid) {
        if (!playerHasMecha(uuid)) {
            return null;
        }

        return playerMechaMap.get(uuid);
    }
}
