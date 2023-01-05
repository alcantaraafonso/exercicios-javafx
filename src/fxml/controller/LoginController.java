package fxml.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private TextField emailField;
	@FXML
	private TextField senhaField;
	
	public void entrar() {
		System.out.println("Entrar...");
		System.out.println("Entrar..." + emailField.getText());
		System.out.println("Entrar..." + senhaField.getText());
		
	}
	
}
