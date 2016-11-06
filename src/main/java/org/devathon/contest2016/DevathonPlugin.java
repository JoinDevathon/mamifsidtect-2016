package org.devathon.contest2016;

import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

    private static DevathonPlugin instance;
    private MechaManager mechaManager;

    @Override
    public void onEnable() {
        instance = this;

        this.mechaManager = new MechaManager();
        setupListeners();
    }

    @Override
    public void onDisable() {

    }

    private void setupListeners() {

    }

    public static DevathonPlugin getInstance() {
        if (instance == null) {
            return new DevathonPlugin();
        }

        return instance;
    }

    public MechaManager getMechaManager() {
        return mechaManager;
    }
}

