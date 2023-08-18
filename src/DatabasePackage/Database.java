package DatabasePackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import BusinessLogic.Booking;
import BusinessLogic.Metro;
import BusinessLogic.Passenger;

import BusinessLogic.route;
import application.*;
public class Database 
{	
	private int count=0;
	//functions
	static Database  gofpattern = null;
	public static Database  getInstance() {
		if(gofpattern == null)
		{
			gofpattern = new Database ();
		}
		return gofpattern;
		
		
	}
	
	private static final String querys = "select * from Admin where Ad_id = ? and Ad_psw =?";
	public boolean enterLogINDetails (String type , int username , String psw)
	{
			  String result = "";
			   try
			   {   Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
					PreparedStatement st =  con.prepareStatement(querys);
						st.setInt(1, username);
						 st.setString(2, psw);
			         System.out.println(st);
			         ResultSet resultSet = st.executeQuery();
			         while (resultSet.next()) {  return true;   }
			        // return false;   
			   }
			   catch (Exception e)
			   {
			       e.printStackTrace();
			   }
			
			   return false;		
	}
	private static final String queryg = "select * from passenger where Pass_username = ? and Pass_psw =?";
	public boolean enterLogINDetailsP (String type , String username , String psw)
	{
			  String result = "";
			   try
			   {   Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
					PreparedStatement st =  con.prepareStatement(queryg);
						st.setString(1, username);
						 st.setString(2, psw);
			         System.out.println(st);
			         ResultSet resultSet = st.executeQuery();
			         while (resultSet.next()) {  return true;   }
			        // return false;   
			   }
			   catch (Exception e)
			   {
			       e.printStackTrace();
			   }
			
			   return false;		
	}
	private static final String queryR = "select * from Receptionist where Rp_username = ? and Rp_psw =?";
	public boolean enterLogINDetailsR (String type , String username , String psw)
	{
			  String result = "";
			   try
			   {   Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
					PreparedStatement st =  con.prepareStatement(queryR);
						st.setString(1, username);
						 st.setString(2, psw);
			         System.out.println(st);
			         ResultSet resultSet = st.executeQuery();
			         while (resultSet.next()) {  return true;   }
			        // return false;   
			   }
			   catch (Exception e)
			   {
			       e.printStackTrace();
			   }
			
			   return false;		
	}
	
	private static final String queryCP = "Insert into Passenger (Pass_name,Pass_id,Pass_phNO,Pass_username,Pass_psw) values ( ?,?,?,?,?)";
	public void createPassengerInfo (String Pname ,int PID ,int PHNO, String username, String psw) throws ClassNotFoundException, SQLException
	{
		String result = "";
		      Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryCP);
					st.setString(1, Pname);
					 st.setInt(2, PID);
					 st.setInt(3, PHNO);
					 st.setString(4, username);
					 st.setString(5, psw);
					
		        st.executeUpdate();
	}
	private static final String querySP = "Select * from Passenger where Pass_id=?";
	public void searchPassengerInfo (int id)
	{
		 String result = "";
		   try
		   {   Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(querySP);
					st.setInt(1, id);
					
		         System.out.println(st);
		         ResultSet resultSet = st.executeQuery();
		         while (resultSet.next()) { 
		        	 //name, id, phno, username, psw
		        	 String name = resultSet.getString("Pass_name");
		        	 int pass_id = resultSet.getInt("Pass_id");
		        	 int phno = resultSet.getInt("Pass_phNO");
		        	 String username = resultSet.getString("Pass_username");
		        	 
		        	 System.out.println(name + " " + pass_id + " " + phno + " " + username);
		         }
		        // return false;   
		   }
		   catch (Exception e)
		   {
		       e.printStackTrace();
		   }
	}
	
	private static final String queryVP = "Select * from Passenger where Pass_id=?";
	public boolean verifyPassenger(int id)
	{
			  String result = "";
			   try
			   {   Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
					PreparedStatement st =  con.prepareStatement(queryVP);
						st.setInt(1, id);
			         System.out.println(st);
			         ResultSet resultSet = st.executeQuery();
			         while (resultSet.next()) {  return true;   }
			        // return false;   
			   }
			   catch (Exception e)
			   {
			       e.printStackTrace();
			   }
			
			   return false;		
	}
	
	private static final String queryUP = "Update Passenger SET Pass_name = ?, Pass_phNO = ?, Pass_psw = ? WHERE Pass_id = ?";
	public void updatePassenger (int id, String name, int phno, String psw) throws SQLException, ClassNotFoundException
	{
		String result = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement(queryUP);
				st.setString(1, name);
				 st.setInt(2, phno);
				 st.setString(3, psw);
				 st.setInt(4, id);
				
	        st.executeUpdate();
		
	}
	
	private static final String queryDP = "Delete FROM Passenger WHERE Pass_id = ?";
	public void deletePassenger (int id) throws SQLException, ClassNotFoundException
	{
		String result = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement(queryDP);
				 st.setInt(	1, id);
				
	        st.executeUpdate();
	}
	
	public String searchRideInfo(int id)
	{
		return null;
		
	}
	
	public void updateTicket (int id)
	{
		
	}
	private static final String queryCBC = "Select PassengerCount ,Totalpassengers,  Fair  from Route where Route_name = ?";
	public boolean checkRouteCounter(String name)
	{
		String result = "";
		   try
		   {   Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryCBC);
					st.setString(1, name);
				
					
		         System.out.println(st);
		         ResultSet resultSet = st.executeQuery();
		         while (resultSet.next()) { 
		        	 int ctr = resultSet.getInt("PassengerCount");
		        	 int seats = resultSet.getInt("Totalpassengers");
		        	 double fare = resultSet.getDouble("Fair");
		        	 System.out.println(name + ", Fare = " + fare);
		        	 
		         if(ctr < seats)
		        	 return true;
		        	 
		        	 // ctr++;
		        	 // updateROuteCounter(name,ctr);
		        	//  saveBooking(ctr,fare);
		        	  
		        	 return true;
		        	 
		         }
		   }
		   catch (Exception e)
		   {
		       e.printStackTrace();
		   }
		return false;
	}
	/*
	private static final String queryURC = "Update Route SET  PassengerCount =? WHERE  Route_name = ?";
	public void updateROuteCounter(String name,int ctr) throws SQLException, ClassNotFoundException
	{
		String result = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement( queryURC);
				 st.setInt(1, ctr);
				 st.setString(2, name);
				
				
	        st.executeUpdate();
		
	}
	private static final String queryIB = "Insert into Booking (book_id,Amount) values ( ?,?)";
	public void saveBooking (int ctr,double fare) throws SQLException, ClassNotFoundException
	{
		
		String result = "";
	      Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement(queryIB);
				st.setInt(1, ctr);
				 //st.setString(2,(String) NULL);
				 st.setDouble(2, fare);
				
				
	        st.executeUpdate();
	}*/
	private static final String queryGRRF = "Select Fair from Route where Route_name= ? ";
	public double GetRouteFare(String Rname) throws ClassNotFoundException, SQLException
	{

		String result = "";
		    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryGRRF);
				st.setString(1, Rname);
				 System.out.println(st);
				 ResultSet resultSet = st.executeQuery();
				 Double RFair =0.0;
		        while (resultSet.next()) { 
		        	 RFair = resultSet.getDouble("Fair");	
				
		        }
		
		        return RFair;
		
	}
	private static final String queryGBC = "Select PassengerCount from Route where Route_name = ?";
	public int getBookingCounter (String name) throws SQLException, ClassNotFoundException
	{
		String result = "";
		      Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryGBC);
					st.setString(1, name);
					
		         System.out.println(st);
		         ResultSet resultSet = st.executeQuery();
		         int ctr = 0;
		         while (resultSet.next()) { 
		        	  ctr = resultSet.getInt("PassengerCount");
		        	 
		        	// System.out.println(name + " " + ctr);
		         }
		  
		return ctr;
		
	}
	
	private static final String queryCR = "Insert into Route (Route_name, Fair, time, PassengerCount, Totalpassengers) values ( ?,?,?,?,?)";
	public void saveRouteInfo (String route, double fair , String time, int seats) throws ClassNotFoundException, SQLException
	{
		String result = "";
		      Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryCR);
					st.setString(1, route);
					 st.setDouble(2, fair);
					 st.setString(3, time);
					 st.setInt(4, 0);
					 st.setInt(5, seats);
					
		        st.executeUpdate();
	}
	
	private static final String queryVR = "Select * from Route where Route_name=?";
	public boolean verifyRoute(String name)
	{
			  String result = "";
			   try
			   {   Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
					PreparedStatement st =  con.prepareStatement(queryVR);
						st.setString(1,name);
			         System.out.println(st);
			         ResultSet resultSet = st.executeQuery();
			         while (resultSet.next()) {  return true;   }
			        // return false;   
			   }
			   catch (Exception e)
			   {
			       e.printStackTrace();
			   }
			
			   return false;		
	}
	
	private static final String querySR = "Select * from Route where Route_name=?";
	public void searchRoute(String name)
	{
		 String result = "";
		   try
		   {   Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(querySR);
					st.setString(1, name);
					
		         System.out.println(st);
		         ResultSet resultSet = st.executeQuery();
		         while (resultSet.next()) { 
		        	 String Rname = resultSet.getString("Route_name");
		        	 int fare = resultSet.getInt("Fair");
		        	 String time = resultSet.getString("time");
		        	 int pCount = resultSet.getInt("PassengerCount");
		        	 int seats = resultSet.getInt("Totalpassengers");
		        	 
		        	 System.out.println(Rname + " " + fare + " " + time + " " + pCount + " " + seats);
		         }
		        // return false;   
		   }
		   catch (Exception e)
		   {
		       e.printStackTrace();
		   }
		
		
	}
	
	private static final String queryDR = "Delete FROM Route WHERE  Route_name=?";
	public void deleteRoute (String name) throws SQLException, ClassNotFoundException
	{
		String result = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement(queryDR);
				 st.setString(	1, name);
				
	        st.executeUpdate();
	}
	
	private static final String queryUR = "Update Route SET Fair = ?, time = ?, Totalpassengers = ? WHERE Route_name = ?";
	public void updateRoute(String route , double fair, String time, int seats) throws SQLException, ClassNotFoundException
	{
			String result = "";
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryUR);
					 st.setDouble(1, fair);
					 st.setString(2, time);
					 st.setInt(3, seats);
					 st.setString(4, route);
					
		        st.executeUpdate();
	}
	
	private static final String queryRC = "Insert into Complaint (details) values (?)";
	public void registerComplaint (String details) throws ClassNotFoundException, SQLException
	{
		String result = "";
		      Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
				PreparedStatement st =  con.prepareStatement(queryRC);
					st.setString(1, details);
			
		        st.executeUpdate();
	}
	private static final String queryURC = "Update Route SET PassengerCount = ? WHERE Route_name = ?";
	public void updateRouteCounter(String name) throws ClassNotFoundException, SQLException
	{
		String result = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Blackshield123");
			PreparedStatement st =  con.prepareStatement(queryUR);
			 count++;
				 st.setInt(1, count);
				 st.setString(2, name);
	        st.executeUpdate();
	}
}
