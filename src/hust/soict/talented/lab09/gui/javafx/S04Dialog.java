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
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;
/**
 * @author vothuckhanhhuyen
 *
 */
public class S04Dialog extends Application {
	
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		Dialog<Pair<String, String>> dialog = new Dialog<>();
		dialog.setTitle("Login Dialog");
		dialog.setHeaderText("Sign up");
		
		ButtonType loginBT = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(loginBT, ButtonType.CANCEL);
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20, 150, 10, 10));
		
		TextField userName = new TextField();
		userName.setPromptText("Username");
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		
		grid.add(new Label("Username"), 0, 0);
		grid.add(userName, 1, 0);
		grid.add(new Label("Password"), 0, 1);
		grid.add(password, 1, 1);
		
		Node loginButton = dialog.getDialogPane().lookupButton(loginBT);
		loginButton.setDisable(true);
		
		userName.textProperty().addListener((observable, oldValue, newValue) -> {
			loginButton.setDisable(newValue.trim().isEmpty());
		});
		dialog.getDialogPane().setContent(grid);
		
		dialog.setResultConverter(dialogButton -> {
			if (dialogButton == loginBT) {
				return new Pair<>(userName.getText(), password.getText());
			} 
			return null;
		});
		
		Optional<Pair<String, String>> result = dialog.showAndWait();
		result.ifPresent(userNamepassword -> {
			System.out.println("Username = " + userNamepassword.getKey() + ", Password = " + userNamepassword.getValue());
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
