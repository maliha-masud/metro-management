package BusinessLogic;
import java.util.ArrayList;
import java.util.*;
public class TimeTable {

	public TimeTable(ArrayList<route> routes) {
		super();
		this.routes = routes;
	}

	//attributes
	 private ArrayList<route> routes = new ArrayList<route>();
	
	//getters and setters
	
	public ArrayList<route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<route> routes) {
		this.routes = routes;
	}
	
	//functions

	public void create()
	{
		
	}
	
	public void addTimeSlot(int id , String time)
	{
		
	}
	
	public String getTimeSlot(String time)
	{
		return time;
		
	}
	
	public boolean updateTimeSlot(int id, String time)
	{
		return false;
		
	}
	
	public boolean deleteTimeSlot(int id, String time)
	{
		return false;
		
	}
	
	public void getAllDetails()
	{
		
	}
}
