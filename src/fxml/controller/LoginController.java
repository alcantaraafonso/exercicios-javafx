package fxml.controller;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private TextField emailField;
	@FXML
	private TextField senhaField;
	
	public void entrar() {
		
		boolean emailValido = emailField.getText().equals("afonso@beganinha.ccom.br");
		boolean senhaValido = senhaField.getText().equals("12345");
		
		if (emailValido && senhaValido) {
			Notifications
				.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
			
		} else {
			Notifications
			.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usuário e Senha inválidos")
			.showError();
			
		}
		
	}
	
}
