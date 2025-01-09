package com.mycompany.proyectoferreteria; // Asegúrate de que el paquete sea correcto

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Asegúrate de que DatabaseManager esté importado correctamente
// import com.mycompany.proyectoferreteria.DatabaseManager;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Inicializa la base de datos
        // Asegúrate de que DatabaseManager esté correctamente configurado y esté en el paquete correcto
        DatabaseManager.initializeDatabase();

        // Configura la interfaz de usuario de JavaFX
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX y SQLite");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
