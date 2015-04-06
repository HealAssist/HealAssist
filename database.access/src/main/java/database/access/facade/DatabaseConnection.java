package database.access.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {		
	
	public static Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:healassistDB", 
					"c##hmcparlane", "123456789");
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
