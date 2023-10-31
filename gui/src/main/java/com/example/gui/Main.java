package com.example.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();

		// Draw a point at (50, 50)
		Circle circle = new Circle(50, 50, 5);
		root.getChildren().add(circle);

		// Draw a line from (100, 100) to (200, 200)
		Line line = new Line(100, 100, 200, 200);
		root.getChildren().add(line);

		Scene scene = new Scene(root, 400, 400);

		primaryStage.setTitle("Drawing App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
