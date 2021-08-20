import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	// DB connection variable
	
	static Connection connection = null;
	static String databaseName = " ";	
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	
	static String username = "root";
	static String password = "Akh0987@";
	
	
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password); 
		PreparedStatement ps = connection.prepareStatement("Insert into eega.lead_actor (name) values ('sudeep');");
		// PreparedStatement ps = connection.prepareStatement("Insert into eega.Actress (name) values ('Samantha');");  
		// PreparedStatement ps = connection.prepareStatement("Insert into eega.Director (name) values ('Rajamouli');");  
		// PreparedStatement ps = connection.prepareStatement("Insert into eega.Year_Of_Release (Date) values ('2012-07-06');");     
		
		int status = ps.executeUpdate();
		
		if (status != 0) {
			System.out.println("Database was Connection");
			System.out.println("Record Was Inserted");
		}
		
		
		
		

	}

}
