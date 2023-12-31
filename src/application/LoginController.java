package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

import BusinessLogic.Metro;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ChoiceBox;

public class LoginController {
	ObservableList<String> UserList = FXCollections.observableArrayList("Admin","Receptionist","Passenger");
	@FXML
	private TextField getUserName;
	@FXML
	private Button submitacclogin;
	@FXML
	private PasswordField getPassword;
	@FXML
	public ChoiceBox<String> typeofuser = new ChoiceBox<>();
	
	   @FXML
	    private Button backbutto;
	
	public Metro controller = new Metro();
	
	@FXML
	private void initialize()
	{
		typeofuser.setItems(UserList);
		typeofuser.setValue("Choose Type");
	}
	
	public void showAlert() {
	    Platform.runLater(new Runnable() {
	      public void run() {
	          Alert alert = new Alert(Alert.AlertType.INFORMATION);
	          alert.setTitle("Error Message...");
	          alert.setHeaderText("No User Type Chosen");
	          alert.setContentText("You should select an account type!");
	          alert.showAndWait();
	      }
	    });
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void movetoFunctions(ActionEvent event) throws IOException
	{
		// TODO Autogenerated
		
		
		boolean val = controller.getInstance().logIN(typeofuser.getValue(),getUserName.getText(), getPassword.getText());
		//boolean val = controller.logIN(typeofuser.getValue(), getUserName.getText(), getPassword.getText());
		
		//System.out.println(typeofuser.getValue());
		
		if(val == true && typeofuser.getValue() == "Admin")
		{
		    Stage stage = (Stage) submitacclogin.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("AdminFtns.fxml"));
				primaryStage.setTitle("Admin Page");
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
		}
		
		if(val == true && typeofuser.getValue() == "Receptionist")
		{
			Stage stage = (Stage) submitacclogin.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			//authenticate receptionist
			
			Parent root = FXMLLoader.load(getClass().getResource("AdminFtns.fxml"));
			primaryStage.setTitle("Receptionist Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}
		
		
		if(val == true && typeofuser.getValue() == "Passenger")
		{
			Stage stage = (Stage) submitacclogin.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();	
			Parent root = FXMLLoader.load(getClass().getResource("PassengerFtns.fxml"));
			primaryStage.setTitle("Passenger Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}
	}
		
		

	    @FXML
	   public void gotoPrevious(ActionEvent event) throws IOException {

	    	 Stage stage = (Stage) backbutto.getScene().getWindow();
				stage.close();
				Stage primaryStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("WelcomeScene.fxml"));
					primaryStage.setTitle("Welcome Page");
					primaryStage.setScene(new Scene(root));
					primaryStage.show();
	    }

		//}
		/*
			else if(typeofuser.getValue() == "Receptionist")
			{
				//authenticate receptionist
				
				Parent root = FXMLLoader.load(getClass().getResource("RcpFtns.fxml"));
				primaryStage.setTitle("Receptionist Page");
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
			}
			else if(typeofuser.getValue() == "Passenger")
			{
				//authenticate passenger
				Parent root = FXMLLoader.load(getClass().getResource("PassengerFtns.fxml"));
				primaryStage.setTitle("User Page");
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
			}
			else
			{
				showAlert();
			}*/
		
	
};
