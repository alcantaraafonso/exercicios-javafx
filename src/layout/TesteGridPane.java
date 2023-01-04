package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true);
				
		getColumnConstraints()
			.addAll(columnConstraints(), 
					columnConstraints(), 
					columnConstraints(),
					columnConstraints(),
					columnConstraints());
		
		getRowConstraints()
			.addAll(rowConstraints(),
					rowConstraints(),
					rowConstraints(),
					rowConstraints(),
					rowConstraints());
		
		setVgap(10);
		setHgap(10);
		
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);
		
	}
	
	private ColumnConstraints columnConstraints() {
		ColumnConstraints columnConstraints = new ColumnConstraints();
		columnConstraints.setPercentWidth(20);
		columnConstraints.setFillWidth(true);
	
		return columnConstraints;
	}
	
	private RowConstraints rowConstraints() {
		RowConstraints rowConstraints = new RowConstraints();
		rowConstraints.setPercentHeight(20);
		rowConstraints.setFillHeight(true);
		
		return rowConstraints;
		
	}
	
	private ColumnConstraints fixoColumnConstraints() {
		ColumnConstraints columnConstraints = new ColumnConstraints();
//		columnConstraints.setPercentWidth(20);
		columnConstraints.setMinWidth(50);
		columnConstraints.setMaxWidth(50);
		columnConstraints.setFillWidth(true);
	
		return columnConstraints;
	}
	
	private RowConstraints fixoRwConstraints() {
		RowConstraints rowConstraints = new RowConstraints();
//		rowConstraints.setPercentHeight(20);
		rowConstraints.setMinHeight(20);
		rowConstraints.setMaxHeight(20);
		rowConstraints.setFillHeight(true);
		
		return rowConstraints;
		
	}
}
