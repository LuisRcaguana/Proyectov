package controlador;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Control {
	@FXML
	private Stage contenedor;
	@FXML
	private AnchorPane pAccion;
	@FXML
	private Button btnFin;
	
	public Control() {
		
	}
	public void main(Stage contenedor, AnchorPane pAccion) {
		this.contenedor=contenedor;
		this.pAccion=pAccion;
		
	}
	
	public void pulsarBotonFin() {
		contenedor.close();
	}
	
	public void pulsarBotonInicio(){
		double w=contenedor.getWidth();
		double h=contenedor.getHeight();
		
		contenedor.setWidth(w);
		contenedor.setHeight(h);
		contenedor.setScene(new Scene(pAccion));
	}
}
