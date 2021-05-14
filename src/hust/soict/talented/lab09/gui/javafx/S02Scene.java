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
public class S02Scene extends Application {
	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		Stage window = primaryStage;
		
		Button button1 = new Button("Say Hello world");
		StackPane layout1 = new StackPane();
		layout1.getChildren().addAll(button1);
		Scene scene1 = new Scene(layout1);
		
		Button button2 = new Button("Say Hello world back");
		VBox layout2 = new VBox();
		layout2.getChildren().addAll(button2);
		Scene scene2 = new Scene(layout2);
		
		button1.setOnAction(event -> {
			window.setScene(scene2);
		});
		button2.setOnAction(event -> {
			window.setScene(scene1);
		});
		
		window.setScene(scene1);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
