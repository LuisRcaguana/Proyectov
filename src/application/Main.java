package application;
	

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import controlador.Control;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

public class Main extends Application {
	
	private AnchorPane panelInicio;
	private AnchorPane panelAccion;
	private Stage contenedor;
	
	@Override
	public void start(Stage primaryStage) {
		this.contenedor = primaryStage;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Semple.fxml"));
		FXMLLoader loader2 = new FXMLLoader(getClass().getResource("ventana2.fxml"));
		
		try {
			
			panelInicio = (AnchorPane) loader.load();
			panelAccion = (AnchorPane) loader2.load();
			
			Control c = loader.getController();
			c.main(contenedor, panelAccion);
			
			contenedor.setTitle("Proyecto1");
			contenedor.setScene(new Scene(panelInicio));
			contenedor.centerOnScreen();
			contenedor.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
