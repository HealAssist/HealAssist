package database.access.facade;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import database.access.tableobject.DatabaseTable;

public class QueryBuilder {
	public static String constructInsert(DatabaseTable table){
		try{
			String tableName = table.getTableName();				
			String[] attrList = table.getAttributeMap().keySet().toArray(new String[0]);
			HashMap<String, String> attrCollection = table.getAttributeMap();			
			String statement = 
					"INSERT INTO " + tableName; 											
					
			// *** modify for non-string values (vals that don't need ' ', 
			// i.e, (fName, lName) Values ('John', 'Doe') vs ('String', 1)			
			String attrNames = " ( ";
			String attrValues = " ( ";
			attrNames += attrList[0];
			attrValues += attrCollection.get( attrList[0] );
			for(String attribute: Arrays.copyOfRange(attrList, 1, attrList.length)){
				attrNames += ", " + attribute;
				attrValues += ", " + attrCollection.get(attribute);				
			}
			attrNames += " ) ";
			attrValues += " ) ";
			
			statement+= attrNames + " VALUES " + attrValues;
			return statement;			
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
	}
}