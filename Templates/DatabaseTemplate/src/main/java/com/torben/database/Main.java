package com.torben.database;

import org.bukkit.plugin.java.JavaPlugin;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends JavaPlugin {


    private Database database;

    @Override
    public void onEnable() {

        // Plugin startup logic
        saveDefaultConfig();

        database = new Database();
        try {
            database.connect();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        System.out.println(database.isConnected());
    }

    @Override
    public void onDisable(){
        database.disconnect();
    }

}
