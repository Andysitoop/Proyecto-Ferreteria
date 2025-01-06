package com.miempresa.vistas;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class LoginApp extends Application {

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    @Override
    public void start(Stage stage) {
        try {
            // Cargar la vista FXML
            AnchorPane root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.setTitle("Login - Ferreteria");

            // Agregar la hoja de estilos CSS
            scene.getStylesheets().add(getClass().getResource("LoginView.css").toExternalForm());

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        // Lógica de validación (en este caso es ficticia)
        if (email.equals("admin@ferreteria.com") && password.equals("1234")) {
            System.out.println("Login exitoso");
            // Aquí puedes continuar con el flujo del programa o abrir una nueva ventana
        } else {
            errorLabel.setText("Correo o contraseña incorrectos.");
        }
    }

    public static void main(String[] args) {
        // Llamar al launch desde el main de la clase Ferreteria
        launch(args);
    }
}
