package de.pokefred.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {}

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Test");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        // TODO null check if resource exists
        Parent root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/main.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() {}
}
