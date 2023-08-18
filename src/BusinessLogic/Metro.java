package BusinessLogic;
import java.sql.SQLException;
import java.util.*;
import application.*;
//import application.LoginController;
public class Metro 
{
	
	//singleton functionality
	static Metro gofpattern = null;
	public static Metro getInstance() {
		if(gofpattern == null)
		{
			gofpattern = new Metro();
		}
		return gofpattern;
		
		
	}
	
	//attributes
		private Admin admin= new Admin();
		private Passenger passenger = new Passenger();
		private Receptionist receptionist = new Receptionist();
		private route Route = new route();
		private Booking booking = new Booking();
		private CashPayment CP = new CashPayment();
	//constructor
		
		public Metro() {};
        public Metro(Admin admin, Passenger passenger, Receptionist receptionist, RideDescription rideDescription,
		Booking booking) {
		super();
		this.admin = admin;
		this.passenger = passenger;
		this.receptionist = receptionist;
		this.booking = booking;
	}

	//getters and setters
   
   public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	//functions
	
	public boolean logIN(String type, String username, String psw)
	{	
		if(type == "Admin")
			return admin.logIn(type, Integer.parseInt(username), psw);
		
		
		else if(type == "Receptionist")
			return receptionist.logIn(type, username, psw);
			
		else if(type == "Passenger")
			return passenger.logIn(type, username, psw);
		
		return true;
	}
	
	public void CreatePassenger(String Pname ,int PID ,int PHNO, String username, String psw) throws ClassNotFoundException, SQLException
	{
		admin.createPassenger(Pname, PID, PHNO, username, psw);
	}
    
	public void searchPassenger(int PID) throws ClassNotFoundException, SQLException
	{
		admin.SearchPassenger( PID);
	}
	
	public boolean verifyPassenger(int id)
	{
		return admin.verifyPassenger(id);
	}
	
	public void updatePassenger(int id, String name, int PhNo, String psw) throws ClassNotFoundException, SQLException
	{
		admin.updatePassenger(id, name,PhNo,psw);
	}
	
	public void deletePassenger(int PID) throws ClassNotFoundException, SQLException
	{
		admin.deletePassenger( PID);
	}
	
	public void createRoute(String route, double fair , String time, int seats) throws ClassNotFoundException, SQLException
	{
	     admin.createRoute(route, fair, time, seats);
	}
	
	public boolean verifyRoute(String name)
	{
		return Route.verifyRoute(name);
	}
	
	public void updateRoute(String route, double fair , String time, int seats) throws ClassNotFoundException, SQLException
	{
		admin.updateRoute(route, fair, time, seats);
	}
	public void deleteRoute(String route) throws ClassNotFoundException, SQLException
	{
		admin.deleteRoute(route);
	}
	
	public void searchRoute(String name) throws ClassNotFoundException, SQLException
	{
		admin.searchRoute(name);
	}
	
	public boolean checkRouteCounter(String name)
	{
		return Route.checkRouteCounter(name);
	}
	
	
	public int checkBookingCounter(String route) throws ClassNotFoundException, SQLException
	{
		return admin.checkBookingCounter(route);
		
	}
	
	public void makePayment(double amount)
	{
		CP.makePayment(amount);
	}
	
	public double GetFare(String Rname) throws ClassNotFoundException, SQLException
	{
		return Route.getRouteFare(Rname);
		
	}
	
	public void registerComplaint(String complaint) throws ClassNotFoundException, SQLException
	{
		passenger.registerComplaint(complaint);
	}
	
	public void updateRouteCounter(String name) throws ClassNotFoundException, SQLException
	{
		Route.updateRouteCounter(name);
	}
	
}
