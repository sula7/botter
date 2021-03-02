package postgres;

import java.sql.*;
import models.botParams;

public class postgres {
    public Connection conn;

    public postgres() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/botter", "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        Statement stmt = null;
        String query = "CREATE TABLE IF NOT EXISTS bot (id bigserial PRIMARY KEY NOT NULL, name varchar(100), source_api varchar(50), provider varchar(50), concurrency_level int, owner_name varchar(100), owner_contacts varchar(100));";
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    protected void insertBot(botParams params) {
        Statement stmt = null;
        String query = String.format(
                "INSERT INTO bot (name, source_api, provider, concurrency_level, owner_name, owner_contacts) VALUES ('%s', '%s', '%s', %d, '%s', '%s')",
                params.name, params.sourceAPI, params.runningProvider, params.maxConcurrency, params.ownerName,
                params.ownerContacts);
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
