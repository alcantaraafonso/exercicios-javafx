package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox boxConteudo = new VBox();
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getStyleClass().add("conteudo");
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		
		Button buttonDecremento = new Button("-");
		buttonDecremento.setOnAction(e -> {
				contador--;
				atualizarLabelNumero(labelNumero);
				
			});
		buttonDecremento.getStyleClass().add("button");
		
		
		Button buttonIncremento = new Button("+");
		buttonIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
			
		});
		buttonIncremento.getStyleClass().add("button");
		
		HBox boxButtons = new HBox();
		boxButtons.setAlignment(Pos.CENTER);
		boxButtons.setSpacing(10);
		
		boxButtons.getChildren().add(buttonDecremento);
		boxButtons.getChildren().add(buttonIncremento);
		
		
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxButtons);
	
		String cssPath = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400); 
		cenaPrincipal.getStylesheets().add(cssPath);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		
		primaryStage.show();
		
	}
	
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));	
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if (contador > 0)
			label.getStyleClass().add("verde");
		else if (contador < 0)
			label.getStyleClass().add("vermelho");
	}


	public static void main(String[] args) {
		launch(args);
	}

}
