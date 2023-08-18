package BusinessLogic;
import java.sql.SQLException;
import java.util.*;

import DatabasePackage.Database;
public class Complaint 
{
	private String user_id;
	Database db = new Database();
	
	public Complaint() {}
	public Complaint(String user_id) {
		super();
		this.user_id = user_id;
	}

	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	//functions
	
	
	public void create()
	{
		
	}
	
	public void complaintDetails(String details) throws ClassNotFoundException, SQLException
	{
		db.getInstance().registerComplaint(details);
	}
	
	
}
