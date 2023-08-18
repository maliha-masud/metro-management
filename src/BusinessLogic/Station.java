package BusinessLogic;


import java.util.*;
import java.util.ArrayList;
public class Station 
{
	//attributes
	 private String address;
	 private String name;
     private int phNO;
     private ArrayList<Ride> ride = new ArrayList<Ride>();
			
	//constructors 
	 public Station(String address, String name, int phNO, ArrayList<Ride> ride) {
			super();
			this.address = address;
			this.name = name;
			this.phNO = phNO;
			this.ride = ride;
		}

	 //getters and setters
	  public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhNO() {
		return phNO;
	}



	public void setPhNO(int phNO) {
		this.phNO = phNO;
	}



	public ArrayList<Ride> getRide() {
		return ride;
	}



	public void setRide(ArrayList<Ride> ride) {
		this.ride = ride;
	}



	
	
   
	
	
}
