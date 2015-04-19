package com.healAssist.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.healAssist.beans.*;
import com.healAssist.connection.DBConnection;

public class ViewAllLogic {
	public List<UserDetails> getAllUsers() {

		System.out.println("in home logic");
		List<UserDetails> list = new ArrayList<UserDetails>();
		
		

		String sql = "select * from user_details";

		try {
			
			DBConnection db = new DBConnection();
			db.ps = db.getConnection().prepareStatement(sql);
			db.rs = db.ps.executeQuery();

			while (db.rs.next()) {
				UserDetails temp = new UserDetails();

				
				temp.setAge(db.rs.getString(1));
				temp.setUserPhone(db.rs.getString(2));
				temp.setUserEmail(db.rs.getString(3));
				temp.setGender(db.rs.getString(5));
				temp.setUserName(db.rs.getString(6));
				temp.setFullName(db.rs.getString(7));
				temp.setAddress(db.rs.getString(9));
				temp.setCity(db.rs.getString(10));
				temp.setCountry(db.rs.getString(11));

				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
