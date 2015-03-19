package com.healAssist.util;

import java.sql.SQLException;

import com.healAssist.beans.UserDetails;
import com.healAssist.connection.DBConnection;

public class HealAssistUtil {
	
	public static int getSequenceNextValue(String sequenceName){
		int sequenceValue = 0;
		DBConnection db =null;
		UserDetails c = null;
		String query="select "+sequenceName+".nextVal as sequenceVal from dual";

		try {
			db= new DBConnection();
			db.ps = db.getConnection().prepareStatement(query);
			db.rs = db.ps.executeQuery();
			while(db.rs.next()){
				sequenceValue = db.rs.getInt("sequenceVal");
				return sequenceValue;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(db != null && db.con != null){
				try {
					db.con.close();
					if(db.ps != null)
						db.ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sequenceValue;
		
	}
	
}
