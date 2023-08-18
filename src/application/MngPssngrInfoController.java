package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MngPssngrInfoController {
	@FXML
	private Button createpsngrbtn;
	@FXML
	private Button searchpsngrbtn;
	@FXML
	private Button updatepsngrbtn;
	@FXML
	private Button deletepsngrbtn;
	@FXML
	private Button BBButton;

	// Event Listener on Button[#createpsngrbtn].onAction
	@FXML
	public void CreateBtn(ActionEvent event) throws IOException {
		// TODO Autogenerated
		// TODO Autogenerated
				Stage stage = (Stage)  createpsngrbtn.getScene().getWindow();
				stage.close();
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("CreatePassenger.fxml"));
				primaryStage.setTitle("Create Passenger Page");
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
		
	}
	// Event Listener on Button[#searchpsngrbtn].onAction
	@FXML
	public void SearchBtn(ActionEvent event) throws IOException {
		// TODO Autogenerated
		Stage stage = (Stage) searchpsngrbtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("SearchPassenger.fxml"));
		primaryStage.setTitle("Search Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

	}
	// Event Listener on Button[#updatepsngrbtn].onAction
	@FXML
	public void UpdateBtn(ActionEvent event) throws IOException {
		// TODO Autogenerated
		Stage stage = (Stage) updatepsngrbtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("UpdatePassenger.fxml"));
		primaryStage.setTitle("Update Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	// Event Listener on Button[#deletepsngrbtn].onAction
	@FXML
	public void DeleteBtn(ActionEvent event) throws IOException {
		// TODO Autogenerated
		Stage stage = (Stage) deletepsngrbtn.getScene().getWindow();
		stage.close();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("DeletePassenger.fxml"));
		primaryStage.setTitle("Remove Passenger Page");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	 @FXML
	    void gotoMngPassenger(ActionEvent event) throws IOException {
		 Stage stage = (Stage) BBButton.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("AdminFtns.fxml"));
			primaryStage.setTitle("Mng Passenger Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
	    }

}