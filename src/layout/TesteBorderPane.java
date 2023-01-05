package layout;

import javafx.scene.layout.BorderPane;

/**
 * Este layout tem como premissa organizar seus elementos a partir de indicações na tela,
 * como esquerda, direita, topo, fundo e centro
 * @author alcan
 *
 */
public class TesteBorderPane extends BorderPane {
	
	public TesteBorderPane() {
		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1);
		
		Caixa c2 = new Caixa().comTexto("Esquerda1");
		setLeft(c2);
		
		Caixa c3 = new Caixa().comTexto("Direita");
		setRight(c3);
		
		Caixa c4 = new Caixa().comTexto("Fundo");
		setBottom(c4);
		
		Caixa c5 = new Caixa().comTexto("Centro");
		setCenter(c5);
		
	}

}
