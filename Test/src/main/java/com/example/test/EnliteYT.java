package com.example.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;

public class EnliteYT extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Circle circle = new Circle(50);
    @Override
    public void start(Stage primaryStage) {
        ButtonListener listen = new ButtonListener();
        circle.setFill(Color.CADETBLUE);
        Button button = new Button("Change");
        button.setOnAction(listen);

        StackPane stackPaneFirst = new StackPane();
        stackPaneFirst.getChildren().add(circle);
        StackPane stackPaneSecond = new StackPane();
        stackPaneSecond.getChildren().add(button);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPaneFirst);
        borderPane.setBottom(stackPaneSecond);

        Scene scene = new Scene(borderPane,3*250,2*250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class ButtonListener implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent){
            if (circle.getRadius() == 0) circle.setRadius(100);
            else circle.setRadius(circle.getRadius() - 10);
        }
    }
}
