package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection conn;

    private final String driver = "com.mysql.jdbc.Driver";
    String bdd = "jdbc:mysql://127.0.0.1:3306/tienda" + "?user=" + "root" + "&password=" + "12345678" + "&useSSL=false";

    public Database() {
        conectarse();
    }

    private void conectarse() {
        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(bdd);
            if (conn != null) {
                System.out.println("Conectado :)");
            }
        } catch (Exception ex) {
            System.out.println("error in DB: " + ex.getLocalizedMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

}
