package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import BusinessLogic.Metro;
import javafx.event.ActionEvent;

public class UpdatePassengerController {
	@FXML
	private Button nextbtn;
	@FXML
	private TextField getpsngrid;
	 @FXML
	    private Button BbButton;

	 Metro controller = new Metro();

	// Event Listener on Button[#nextbtn].onAction
	@FXML
	public void NextBtn(ActionEvent event) throws IOException {
		// TODO Autogenerated
		boolean val = controller.getInstance().verifyPassenger(Integer.parseInt(getpsngrid.getText()));
		
		if(val == true)
		{
			Stage stage = (Stage) nextbtn.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("UpdatePsngrNext.fxml"));
			primaryStage.setTitle("Update Passenger Next Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}
	}
	@FXML
    void goTOMNGPassngr(ActionEvent event) throws IOException {
		Stage stage = (Stage) nextbtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("MngPssngrInfo.fxml"));
		primaryStage.setTitle("Mng Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
    }
}