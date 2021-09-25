package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        stage.setTitle("Calculator");
        Scene scene = new Scene(fxmlLoader.load(), 230, 300);
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}