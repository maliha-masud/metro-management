package BusinessLogic;
import java.util.*;
public abstract class Payment
{

	
	   //attributs
		private double amount;
		private Booking booking;
		
		
		//Constructor
		public Payment(double amount, Booking booking) {
			super();
			this.amount = amount;
			this.booking = booking;
		}
		
		//getters and setters
		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Booking getBooking() {
			return booking;
		}

		public void setBooking(Booking booking) {
			this.booking = booking;
		}

		
	
	
	//functions
	
	public abstract void makePayment(double amount);
	
	
}
