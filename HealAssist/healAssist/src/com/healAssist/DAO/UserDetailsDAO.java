package com.healAssist.DAO;

import com.healAssist.connection.DBConnection;
import com.healAssist.beans.*;

public class UserDetailsDAO {

	public UserDetails BusinessLogic(String id){
		DBConnection db =null;
		UserDetails c = null;
		String query="select  * from  user_details where user_id="+id+"";

		try {
			db= new DBConnection();
			db.ps = db.getConnection().prepareStatement(query);
			db.rs = db.ps.executeQuery();
			c=new UserDetails();
			while(db.rs.next()){
				c.setAge(db.rs.getString(2));
				c.setUserPhone(db.rs.getString(3));
				c.setUserEmail(db.rs.getString(4));
				c.setGender(db.rs.getString(6));
				c.setUserName(db.rs.getString(7));
				c.setFullName(db.rs.getString(8));
				c.setPassword(db.rs.getString(9));
				c.setAddress(db.rs.getString(10));
				c.setCity(db.rs.getString(11));
				c.setCountry(db.rs.getString(12));

				return c;
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		return c;
}
}