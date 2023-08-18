package BusinessLogic;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;

import DatabasePackage.Database;
public class Passenger 
{
	private String name;
	  private int id;
	  private int phNo;
	  private ArrayList<Booking> bookings = new ArrayList<Booking>();
	  private ArrayList<Complaint> complaints = new ArrayList<Complaint>();
	  Complaint complaint = new Complaint();
	  private ArrayList<Ride> rides = new ArrayList<Ride>();
	  Database db = new Database();
  public Passenger(String name, int id, int phNo, ArrayList<Booking> bookings, ArrayList<Complaint> complaints,
			ArrayList<Ride> rides) {
		super();
		this.name = name;
		this.id = id;
		this.phNo = phNo;
		this.bookings = bookings;
		this.complaints = complaints;
		this.rides = rides;
	}
  
  
  public Passenger() {
	super();
  }

	
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
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public ArrayList<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}
	public ArrayList<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(ArrayList<Complaint> complaints) {
		this.complaints = complaints;
	}
	public ArrayList<Ride> getRides() {
		return rides;
	}
	public void setRides(ArrayList<Ride> rides) {
		this.rides = rides;
	}
	
	
	//functions
	public boolean logIn(String type ,String username , String psw)
	{
		return db.enterLogINDetailsP(type, username, psw);
	}
	
	
	public void create()
	{
		
	}
	
	public void addPassenger(String name , int id , int phNO)
	{
		
		
	}
	
	public Passenger getPassengerInfo(int id)
	{
		return null;
		
	}
	
	public void displayInformation(Passenger passenger )
	{
		
	}
	
	public boolean updatePassenger(String name , int id , int phNO)
		{
			return false;
				
		}
	
	public boolean deletePassenger(Passenger passenger)
	{
		return false;
			
	}
	
	public void makePayment(double amount)
	{
		
	}
	
	public void registerComplaint(String details) throws ClassNotFoundException, SQLException
	{
		complaints.add(0, complaint);
		complaints.get(0).complaintDetails(details);
	}

}

