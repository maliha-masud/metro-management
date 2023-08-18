package BusinessLogic;
import java.sql.SQLException;
import java.util.*;

import DatabasePackage.Database;
public class route {
	
	//attributes

	private String route;
	private double fair;
	private String time;
	
	Database db = new Database();
	
	
	//Constructors
	public route() {}
	public route(String route, double fair, String time) {
		super();
		this.route = route;
		this.fair = fair;
		this.time = time;
	}
	
	
	//getters setters
	
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public double getFair() {
		return fair;
	}
	public void setFair(double fair) {
		this.fair = fair;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	//functions
	public void createRoute (String route, double fair , String time , int seats) throws ClassNotFoundException, SQLException
	{
		db.getInstance().saveRouteInfo(route, fair, time, seats);
	}
	
	public boolean verifyRoute(String name)
	{
		return db.getInstance().verifyRoute(name);
	}
	
	public void updateRoute (String route, double fair , String time , int seats) throws ClassNotFoundException, SQLException
	{
		db.getInstance().updateRoute(route, fair, time, seats);
	}
	
	public void searchRoute(String route) throws ClassNotFoundException, SQLException
	{
		db.getInstance().searchRoute(route);
	}
	
	public void deleteRoute (String route) throws ClassNotFoundException, SQLException
	{
		db.getInstance().deleteRoute(route);
	}
	
	public int checkBookingcounter(String route) throws ClassNotFoundException, SQLException
	{
		return db.getInstance().getBookingCounter(route);
	}
	
	public boolean checkRouteCounter(String name)
	{
		return db.checkRouteCounter(name);
	}
	
	public double getRouteFare(String Rname) throws ClassNotFoundException, SQLException
	{
		return db.getInstance().GetRouteFare(Rname);
		
	}
	public void updateRouteCounter(String name) throws ClassNotFoundException, SQLException
	{
	    db.getInstance().updateRouteCounter(name);
	}
}
