package com.mycompany.proyectoferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseManager {

    // Ruta de la base de datos SQLite (puedes especificar una ruta completa o dejarla relativa)
    private static final String URL = "jdbc:sqlite:sample.db"; // base de datos llamada "sample.db"

    // Método para establecer la conexión con la base de datos
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }

    // Método para crear la tabla en la base de datos si no existe
    public static void initializeDatabase() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL, "
                + "email TEXT NOT NULL UNIQUE);";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            // Crear la tabla
            stmt.execute(createTableSQL);
            System.out.println("Base de datos y tabla creadas (si no existían).");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla: " + e.getMessage());
        }
    }

    // Puedes agregar más métodos para insertar, actualizar o consultar datos en la base de datos aquí
}
