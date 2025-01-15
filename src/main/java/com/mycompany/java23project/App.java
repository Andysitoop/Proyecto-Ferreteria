package com.mycompany.java23project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("fxml", "login"), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Login Application");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML("fxml", "login"));
    }

public static Parent loadFXML(String folder, String fxml) throws IOException {
    // Construir la ruta con la carpeta y el nombre del archivo FXML
    String path = String.format("/com/mycompany/%s/%s.fxml", folder, fxml);
    return FXMLLoader.load(App.class.getResource(path));
}


    public static void main(String[] args) {
        launch();
    }
}
