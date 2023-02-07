package com.example.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnalyzeDisk extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(100,70, Color.ANTIQUEWHITE);
        StackPane stackpane = new StackPane();
        Button button = new Button("4");
        Text text = new Text("1");
        stackpane.getChildren().addAll(rectangle,text,button);


        Scene scene = new Scene(stackpane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
