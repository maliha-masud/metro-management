package BusinessLogic;
import java.util.*;
public class Booking 

{
	public Booking() {}
  public Booking(Date date, double total_amount, int pass_id, int book_id) {
		super();
		this.date = date;
		this.total_amount = total_amount;
		this.pass_id = pass_id;
		this.book_id = book_id;
	}
//attributes
   private Date date;   //for date and time
   private double total_amount;
   private int pass_id;
   int book_id;
   
   
   public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public double getTotal_amount() {
	return total_amount;
}
public void setTotal_amount(double total_amount) {
	this.total_amount = total_amount;
}
public int getPass_id() {
	return pass_id;
}
public void setPass_id(int pass_id) {
	this.pass_id = pass_id;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}

   //functions
   
public void create()
{
	
}

public void saveBooking(int id , Date date , double Amount)
{
	
}



}
