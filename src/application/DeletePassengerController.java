package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import BusinessLogic.Metro;
import javafx.event.ActionEvent;

public class DeletePassengerController {
	@FXML
	private Button deletebtn;
	@FXML
	private TextField getpsngrid;
	@FXML
	private Button BBPButton;
	
	Metro controller = new Metro();

	// Event Listener on Button[#deletebtn].onAction
	@FXML
	public void DeletePassengerftn(ActionEvent event) throws NumberFormatException, ClassNotFoundException, SQLException {
		// TODO Autogenerated
		boolean val = controller.getInstance().verifyPassenger(Integer.parseInt(getpsngrid.getText()));
		controller.getInstance().deletePassenger(Integer.parseInt(getpsngrid.getText()));
			if(val == true) infoBox("Passenger deleted sucessfully!!",null,"Successful");
	}
   private void infoBox(String info, String header, String title) {
		
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	 alert.setContentText(info);
         alert.setTitle(title);
         alert.setHeaderText(header);
         alert.showAndWait();
		
	}
	// Event Listener on Button[#BBPButton].onAction
	@FXML
	public void gotoMnNGPassenger(ActionEvent event) throws IOException {
		// TODO Autogenerated
		Stage stage = (Stage) BBPButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("MngPssngrInfo.fxml"));
		primaryStage.setTitle("Mng Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
}
