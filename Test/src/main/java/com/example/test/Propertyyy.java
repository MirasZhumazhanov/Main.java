package com.example.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Propertyyy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        pane.getChildren().add(circle);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        Scene scene = new Scene(pane,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
