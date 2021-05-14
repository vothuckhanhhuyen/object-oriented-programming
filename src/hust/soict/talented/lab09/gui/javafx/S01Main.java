package hust.soict.talented.lab09.gui.javafx;
/**
 * 
 */

/**
 * @author vothuckhanhhuyen
 *
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class S01Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello world");
		
		Button button = new Button();
		button.setText("Say Hello world");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello Huyen");
			}
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
