package BusinessLogic;
import java.util.*;
import java.util.ArrayList;
public class RideDescription
{
	//attributes
	private route routte;
	private int no_of_Pass;
	private ArrayList<Ride> rides = new ArrayList<Ride>();

		
		//constructor
		public RideDescription(route routte, int no_of_Pass, ArrayList<Ride> rides) {
			super();
			this.routte = routte;
			this.no_of_Pass = no_of_Pass;
			this.rides = rides;
		}
		
		//setters and getters
		
		public void setRoutte(route routte) {
			this.routte = routte;
		}
		public route getRoutte() {
			return routte;
		}
		public int getNo_of_Pass() {
			return no_of_Pass;
		}

		public void setNo_of_Pass(int no_of_Pass) {
			this.no_of_Pass = no_of_Pass;
		}

		public ArrayList<Ride> getRides() {
			return rides;
		}

		public void setRides(ArrayList<Ride> rides) {
			this.rides = rides;
		}

	//functions
		
		public String getRideDescription(int id)
		{
			return null;
			
		}
	
		public void  addTimeSlot(int id, String time)
		{
			return;
			
		}
	
		public void  updateTimeSlot(int id, String time)
		{
			return;
			
		}
		
		public int  searchTimeSlot(String time)
		{
			return 0;
			
		}
		
		public void  deleteTimeSlot(int id, String time)
		{
		
			
		}
	 
		public String  createDescription(String Description)
		{
			return Description;
		
			
		}
		
		public void  searchRoute(route routte)
		{
	
			
		}
		
		public void  deleteRoute(route routte)
		{
	
			
		}
		
		
		public void  AllDettails(route routte)
		{
	
			
		}
		
	 
	    
}
