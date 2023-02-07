package com.example.test;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      Pane pane = new Pane();
      Text text = new Text("Fading Word");
      Color color = new Color(0.4,0.3,0.7,0.6);
      text.setFill(color);
      text.setStyle("-fx-font-weight:bold;");
      text.setX(110);
      text.setY(90);
      pane.getChildren().add(text);

      Timeline timeLine = new Timeline(new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
          boolean b = true;
          @Override
          public void handle(ActionEvent actionEvent) {
                if(b){
                    text.setStyle("-fx-font-size: 30");
                    b = !b;
                }
                else{
                    text.setStyle("-fx-font-size: 15");
                    b = !b;
                }
          }
      }));
      timeLine.setCycleCount(Timeline.INDEFINITE);
      timeLine.play();

      Scene scene = new Scene(pane,300,200);
      stage.setScene(scene);
      stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}