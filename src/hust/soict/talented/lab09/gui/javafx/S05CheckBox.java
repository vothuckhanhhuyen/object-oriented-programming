/**
 * 
 */
package hust.soict.talented.lab09.gui.javafx;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;
/**
 * @author vothuckhanhhuyen
 *
 */
public class S05CheckBox extends Application {
	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Language");
		CheckBox box1 = new CheckBox("Java");
		CheckBox box2 = new CheckBox("C#");
		CheckBox box3 = new CheckBox("Python");
		box1.setSelected(true);
		Button button = new Button("Submit");
		button.setOnAction(e -> {
			String message = "Your language: ";
			if (box1.isSelected()) {
				message += box1.getText();
			}
			if (box2.isSelected()) {
				message += box2.getText();
			}
			if (box3.isSelected()) {
				message += box3.getText();
			}
			System.out.println(message);
		});
		HBox layout = new HBox(10);
		layout.getChildren().addAll(box1, box2, box3);
		VBox layoutV = new VBox();
		layoutV.getChildren().addAll(label, layout, button);
		Scene scene = new Scene(layoutV);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

