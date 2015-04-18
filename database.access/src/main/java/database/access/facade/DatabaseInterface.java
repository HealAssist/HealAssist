package database.access.facade;

import java.sql.Connection;
import java.sql.Statement;

import database.access.tableobject.DatabaseTable;

public class DatabaseInterface {	
	public Boolean insert(DatabaseTable table){
		try(Connection conn = DatabaseConnection.getConnection()){ //Do try with resources to open connection			
			String insertStr = QueryBuilder.constructInsert(table);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(insertStr);
			return true;			
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
}