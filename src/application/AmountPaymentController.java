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

import javafx.event.ActionEvent;

public class AmountPaymentController {
	 @FXML
	    private Button BBButton;

	    @FXML
	    private TextField accnum;

	    @FXML
	    private Button cardpaymentconfirmbtn;

	    @FXML
	    private TextField paymentamt;

	    @FXML
	    void MakeCardPaymentBtn(ActionEvent event) {
	    	infoBox("Payment paid sucessfully!!",null,"Successful");
		}
	   private void infoBox(String info, String header, String title) {
			
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    	 alert.setContentText(info);
	         alert.setTitle(title);
	         alert.setHeaderText(header);
	         alert.showAndWait();
	    }

	    @FXML
	    void gotomakePayControllerftn(ActionEvent event) throws IOException {
	    	Stage stage = (Stage)  BBButton.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("MakePayment.fxml"));
			primaryStage.setTitle("Make Payment");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
	    }

}