package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		URL arquivoFXML = getClass().getResource("/fxml/view/Login.fxml");
		String cssFile = getClass().getResource("/fxml/view/login.css").toExternalForm();
		
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(cssFile);
		
		primaryStage.setResizable(false);//não deixa o usuário redimensionar a tela e nem deixa arrastar a tela
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
