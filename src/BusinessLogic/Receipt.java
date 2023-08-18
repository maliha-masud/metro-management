package BusinessLogic;
import java.util.*;


public class Receipt
{
	//attributes
	 private Booking booking;
	private Payment payment;
	private int receptionistID;
	//constructors
   public Receipt(Booking booking, Payment payment, int receptionistID) {
		super();
		this.booking = booking;
		this.payment = payment;
		this.receptionistID = receptionistID;
	}
   //setters and getters
  
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public int getReceptionistID() {
		return receptionistID;
	}

	public void setReceptionistID(int receptionistID) {
		this.receptionistID = receptionistID;
	}

	
   
}
