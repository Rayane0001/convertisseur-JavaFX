package fr.univartois.butinfo.ihm.converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConverterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ConverterApplication.class.getResource("converter.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Currency Converter");
        // Définir la taille maximale de la fenêtre
        stage.setMaxHeight(500);
        stage.setMaxWidth(700);
        // Définir la taille minimale de la fenêtre
        stage.setMinHeight(500);
        stage.setMinWidth(700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}