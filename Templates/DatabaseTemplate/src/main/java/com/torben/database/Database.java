package com.torben.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String HOST = new Main().getConfig().getString("database.port");
    private final int PORT = new Main().getConfig().getInt("database.port");
    private final String DATABASE = new Main().getConfig().getString("database.db-name");
    private final String USERNAME = new Main().getConfig().getString("database.username");
    private final String PASSWORD = new Main().getConfig().getString("database.password");

    Main main;

    private Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?useSSL=false",
                USERNAME,
                PASSWORD);
    }

    public boolean isConnected() { return connection != null; }


    public void disconnect(){

        if (isConnected()){

        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
