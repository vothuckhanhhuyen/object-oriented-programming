/**
 * 
 */
package hust.soict.talented.lab09.gui.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * @author vothuckhanhhuyen
 *
 */
public class S04Exit extends Application {
	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("Click me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> {
			System.out.println("Bye bye");
			System.exit(0);
		});
		btn.setOnAction(event -> {
			System.out.println("Hello Huyen");
		});
		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);
		Scene scene = new Scene(root);
		primaryStage.setTitle("My Title");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
