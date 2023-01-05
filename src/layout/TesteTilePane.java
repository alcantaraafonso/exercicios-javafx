package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;


/**
 * Este layout é indicado para quando se deseja usar uma estrutura de layuout como o flow, mas onde os elementos (tiles)
 * possuem tamanho fixo.
 * 
 * Assim como o FlowLayout, a orientação padrão é HORIZONTAL
 * 
 * @author alcan
 *
 */
public class TesteTilePane extends TilePane {

	public TesteTilePane() {
		List<Quadrado> quadrados = new ArrayList<>();
		
		for (int i = 1; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setTileAlignment(Pos.BOTTOM_RIGHT);
		setVgap(10);
		setHgap(10);
		
		getChildren().addAll(quadrados);
	}
	
}

