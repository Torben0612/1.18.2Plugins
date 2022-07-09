package com.torben.music;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        saveResource("AllStar.nbs", false);

        if (this.getDataFolder().exists()){
            this.getDataFolder().mkdir();

        }

        getCommand("playsong").setExecutor(new PlaySongCommand(this));
        getCommand("stopsong").setExecutor(new StopSongCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
