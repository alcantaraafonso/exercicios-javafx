package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
	
	/**
	 * Stage é a tela e coloca-se itens visuais no Stage
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox box = new VBox();
		
		Button buttonA = new Button("A");
		Button buttonB = new Button("B");
		Button buttonC = new Button("C");
		
		buttonA.setOnAction(e -> System.out.println("A") );
		buttonB.setOnAction(e -> System.out.println("B") );
		buttonC.setOnAction(e -> System.exit(0) );
		
		box.getChildren().add(buttonA);
		box.getChildren().add(buttonB);
		box.getChildren().add(buttonC);
		
		Scene scene = new Scene(box, 200, 400);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
