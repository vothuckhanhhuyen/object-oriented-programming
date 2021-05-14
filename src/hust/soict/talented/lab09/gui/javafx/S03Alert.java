/**
 * 
 */
package hust.soict.talented.lab09.gui.javafx;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * @author vothuckhanhhuyen
 *
 */
public class S03Alert extends Application {
	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Alert Example");
		Button button = new Button();
		button.setText("Close");
		button.setOnAction(e -> {
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Alert Information");
			alert.setContentText("Choose your option");
			
			ButtonType buttonTypeYes = new ButtonType("YES", ButtonBar.ButtonData.YES);
			ButtonType buttonTypeNo = new ButtonType("NO", ButtonBar.ButtonData.NO);
			
			alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
			Optional<ButtonType> result = alert.showAndWait();
			
			if (result.get() == buttonTypeYes) {
				System.out.println("Code for yes");
			} else {
				System.out.println("Code for no");
			}
			
			String message = result.get().getText();
			Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
			alert1.setTitle("Information");
			alert1.setHeaderText("Notification");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}