package BusinessLogic;
import java.util.*;
import java.util.ArrayList;
public class Ride 
{
	
	//attributes
	  private int id;
	  private RideDescription ride_obj;
	  private ArrayList<Station> stations = new ArrayList<Station>();
	  private ArrayList<Passenger> passenger = new ArrayList<Passenger>();
	  
	  
	  
		
		 //constructors
	      public Ride(int id, RideDescription ride_obj, ArrayList<Station> stations, ArrayList<Passenger> passenger) {
			super();
			this.id = id;
			this.ride_obj = ride_obj;
			this.stations = stations;
			this.passenger = passenger;
		}
	 
	      //setters and getterd
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RideDescription getRide_obj() {
		return ride_obj;
	}

	public void setRide_obj(RideDescription ride_obj) {
		this.ride_obj = ride_obj;
	}

	public ArrayList<Station> getStations() {
		return stations;
	}

	public void setStations(ArrayList<Station> stations) {
		this.stations = stations;
	}

	public ArrayList<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(ArrayList<Passenger> passenger) {
		this.passenger = passenger;
	}

	
	
	 
}
