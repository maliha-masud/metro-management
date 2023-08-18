package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

import BusinessLogic.Metro;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class UpdatePsngrNextController {
	@FXML
	private TextField updatename;
	@FXML
	private TextField updatePhno;
	@FXML
	private PasswordField updatepsw;
	 @FXML
	private TextField getpsngrid;
	@FXML
	private Button updatebtn;
	
	 @FXML
	    private Button BackButton;
	 
	 Metro controller = new Metro();

	// Event Listener on Button[#updatebtn].onAction
	@FXML
	public void UpdateFTN(ActionEvent event) throws NumberFormatException, ClassNotFoundException, SQLException {
		// TODO Autogenerated
		controller.getInstance().updatePassenger(Integer.parseInt(getpsngrid.getText()), updatename.getText(),Integer.parseInt(updatePhno.getText()), updatepsw.getText());
		infoBox("Passenger Updated sucessfully!!",null,"Successful");
	}
   private void infoBox(String info, String header, String title) {
		
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	 alert.setContentText(info);
         alert.setTitle(title);
         alert.setHeaderText(header);
         alert.showAndWait();
		
	}
 

   @FXML
   void goToUpdatePassngr(ActionEvent event) throws IOException {
	   Stage stage = (Stage) BackButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("UpdatePassenger.fxml"));
		primaryStage.setTitle("Mng Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
   }
}
