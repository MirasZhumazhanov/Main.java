package com.example.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lollipop extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();
        VBox vBox = new VBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();
        TextArea textArea = new TextArea();
        textArea.setMinSize(50,50);
        for (int i = 1; i <= 3; i++) {
            Button button = new Button(i + "");
            button.setMinSize(60,50);
            button.setStyle("");
            hBox1.getChildren().addAll(button);
        }
        for(int i = 4; i <= 6; i++){
            Button button = new Button(i + "");
            button.setMinSize(60,50);
            hBox2.getChildren().addAll(button);
        }
        for (int i = 7; i <= 9; i++) {
            Button button = new Button(i + "");
            button.setMinSize(60,50);
            hBox3.getChildren().addAll(button);
        }
        vBox.getChildren().addAll(textArea,hBox1,hBox2,hBox3);


        Scene scene = new Scene(vBox,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
