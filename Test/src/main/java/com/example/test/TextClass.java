package com.example.test;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/OlympicFlag.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(400);
        imageView.setFitWidth(600);
        pane.getChildren().add(imageView);
        imageView.fitHeightProperty().bind(pane.heightProperty());
        imageView.fitWidthProperty().bind(pane.widthProperty());

        FadeTransition ft = new FadeTransition(Duration.millis(3000),imageView);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(5);
        ft.setAutoReverse(true);
        ft.play();

        Scene scene = new Scene(pane,3*150,2*150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
