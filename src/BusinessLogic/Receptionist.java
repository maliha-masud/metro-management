package BusinessLogic;


import java.util.*;
import java.util.ArrayList;

import DatabasePackage.Database;

public class Receptionist
{
	//attributes
		private String name;
		private int id;
		private ArrayList<Receipt> receipts = new ArrayList<Receipt>();
		 Database db = new Database();
		//Constructors	
		public Receptionist(String name, int id, ArrayList<Receipt> receipts) {
			super();
			this.name = name;
			this.id = id;
			this.receipts = receipts;
		}
		
		

		public Receptionist() {
			super();
		}



		//getters and setters
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

		public ArrayList<Receipt> getReceipts() {
			return receipts;
		}

		public void setReceipts(ArrayList<Receipt> receipts) {
			this.receipts = receipts;
		}

		
	
       //function
		public boolean logIn(String type, String username , String psw)
		{
			return db.enterLogINDetailsR(type, username, psw);
		}

	  
	
   
    
    //
  
  
}
