package application;

import java.io.IOException;
import java.sql.SQLException;

import BusinessLogic.Metro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.PasswordField;

public class CreatePassengerController {
	@FXML
	private Button createbtn;
	@FXML
	private TextField psngrname;
	@FXML
	private TextField psngrid;
	@FXML
	private TextField psngrphno;
	@FXML
	private TextField psngrusrname;
	@FXML
	private PasswordField psngrpswd;
	
	 @FXML
	    private Button BackBButton;

	
	Metro control = new Metro();

    @FXML
    void createdPassnger(ActionEvent event) throws NumberFormatException, ClassNotFoundException, SQLException {
    	
    	control.getInstance().CreatePassenger(psngrname.getText(), Integer.parseInt(psngrid.getText()), Integer.parseInt(psngrphno.getText()), psngrusrname.getText(),psngrpswd.getText());
    	infoBox("Passenger Created sucessfully!!",null,"Successful");
	}
   private void infoBox(String info, String header, String title) {
		
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	 alert.setContentText(info);
         alert.setTitle(title);
         alert.setHeaderText(header);
         alert.showAndWait();
    }
   

   @FXML
   void gotoMngPassenger(ActionEvent event) throws IOException {
	   Stage stage = (Stage) BackBButton.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("MngPssngrInfo.fxml"));
		primaryStage.setTitle("Mng Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
   }


}
