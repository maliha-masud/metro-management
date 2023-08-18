package BusinessLogic;


import java.sql.SQLException;
import java.util.*;

import DatabasePackage.Database;
public class Admin {

	
	//attributes
		private String name;
		private int id;
		private String psw;
	     Database db = new Database();
	     route Route = new route();
	public Admin(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getPsw() {
		return psw;
	}


	public void setPsw(String psw) {
		this.psw = psw;
	}


	public Admin() {
		// TODO Auto-generated constructor stub
	}


	//getters setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//functions
	public boolean logIn(String type, int username , String psw)
	{
		//if(type == "Admin")
			return db.getInstance().enterLogINDetails(type, username, psw);
	}
	
	public Boolean addRoute(String route , double fair)
	{
		return null;
		
	}

	 public route searchRoute(route route )
	 {
		return route;
		 
	 }
	 
	 public void updateRoute(route route)
	{
			
	}
	 
	 public void deleteRoute(route route)
	{
			
	}
	 
	 public void createPassenger(String Pname ,int PID ,int PHNO, String username, String psw) throws ClassNotFoundException, SQLException
	{
			db.getInstance().createPassengerInfo(Pname, PID, PHNO, username, psw);	
	} 
	 
	 public void SearchPassenger(int PID) throws ClassNotFoundException, SQLException
		{
				db.getInstance().searchPassengerInfo( PID);	
		} 
	 
	 public boolean verifyPassenger(int id)
		{
		 	return db.getInstance().verifyPassenger(id);
		}
	 
	 public void updatePassenger(int id, String Pname ,int PHNO, String psw) throws ClassNotFoundException, SQLException
		{
				db.getInstance().updatePassenger(id, Pname, PHNO, psw);	
		}
	 
	 public void deletePassenger(int PID) throws ClassNotFoundException, SQLException
		{
				db.getInstance().deletePassenger(PID);
		}
	 //----------------------------------------------------------------------------------------------------------------------------------
	 public void createRoute(String route, double fair , String time, int seats) throws ClassNotFoundException, SQLException
		{
			Route.createRoute(route, fair, time, seats);
		}
		
		
		public void updateRoute(String route, double fair , String time, int seats) throws ClassNotFoundException, SQLException
		{
			Route.updateRoute(route, fair, time, seats);
		}
		public void deleteRoute(String route) throws ClassNotFoundException, SQLException
		{
			Route.deleteRoute(route);
		}
		
		public void searchRoute(String name) throws ClassNotFoundException, SQLException
		{
			Route.searchRoute(name);
		}
		public int checkBookingCounter(String route) throws ClassNotFoundException, SQLException
		{
			return Route.checkBookingcounter(route);
		}
}
