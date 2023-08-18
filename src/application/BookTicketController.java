package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import BusinessLogic.Metro;
import javafx.event.ActionEvent;

public class BookTicketController {
	 @FXML
	    private Button BBButton;

	    @FXML
	    private TextField RRname;

	    @FXML
	    private Button bookticketbtn1;

	    @FXML
	    private Label gettingAmount;

	    @FXML
	    private Button payticketbtn;

	    @FXML
	    private TextField pssnggrID;
	    
	    Metro controller = new Metro();
	  
      
	    @FXML
	    void BookTicketClick(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
         boolean val = controller.getInstance().verifyPassenger(Integer.parseInt(pssnggrID.getText()));
         if(val == true)
         {
        	 boolean val2 = controller.getInstance().verifyRoute(RRname.getText());
        	 if(val2 == true)
        	 {
        		boolean val3 = controller.getInstance().checkRouteCounter(RRname.getText());
        		if(val3 == true)
        		{
        			//authenticate receptionist
        			String Route = RRname.getText();
        			System.out.println(Route);
        			double the_totalprice= Metro.getInstance().GetFare(Route);
        			System.out.println(the_totalprice);
        			String str = Double.toString(the_totalprice);
        			gettingAmount.setText(str);
        			

        		//	Metro.getInstance().updateRouteCounter(RRname.getText());
        			
        		}
        	 }
         }
	    }
	    
	    

	    @FXML
	    void Payticket(ActionEvent event) throws IOException {
	    	Stage stage = (Stage) payticketbtn.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
	    	Parent root = FXMLLoader.load(getClass().getResource("MakePayment.fxml"));
			primaryStage.setTitle("Payment Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
	    }

	    @FXML
	    void gotoUser(ActionEvent event) throws IOException {
	    	Stage stage = (Stage) BBButton.getScene().getWindow();
			stage.close();
			Stage primaryStage = new Stage();
			//authenticate receptionist
			
			Parent root = FXMLLoader.load(getClass().getResource("PassengerFtns.fxml"));
			primaryStage.setTitle("Passenger Page");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
	    }

	}
