package layout;

import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		getChildren().addAll(q1, q2, q3, q4, q5);
		
		setHgap(10);

		setVgap(10);
		
		setPadding(new Insets(10));
		
		/*
		 * O setOrentarion dita a orientação dos elementos na janela.
		 * A orientação padrão é HORIZONTAL
		 */
		//setOrientation(Orientation.VERTICAL);
	}
	
}
