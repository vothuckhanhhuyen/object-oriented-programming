package hust.soict.talented.gui.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXHello extends Application {
	private Button btnHello; 
	
	@Override
	public void start(Stage primaryStage) {
		btnHello = new Button();
		btnHello.setText("Say Hello");
		btnHello.setOnAction(evt -> System.out.println("Hello World!"));
		StackPane root = new StackPane(); 
		root.getChildren().add(btnHello); 
		Scene scene = new Scene(root, 300, 100); 
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Hello"); 
		primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}