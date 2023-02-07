package com.example.test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root,Color.AZURE);
        Image icon = new Image("/src/OlympicFlag.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Hey!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}