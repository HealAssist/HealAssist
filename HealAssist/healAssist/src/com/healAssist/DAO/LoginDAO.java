package com.healAssist.DAO;

import java.sql.SQLException;

import com.healAssist.connection.*;
import com.healAssist.beans.*;

public class LoginDAO {
	DBConnection db = new DBConnection();
	 public int ValidLogin(UserDetails c) {
         // whether login count is equal to 5

		if(ValidUserPwd(c.getUserName(),c.getPassword()))
			return 1;
		else
			return 0;
	 }
		
	 public int ValidLoginPatient(UserDetails c) {
		 System.out.println("hi"+c.getPassword());
	if(ValidUserPwdPatient(c.getUserName(), c.getPassword()))
			return 1;
		else
			return 0;
	 }
	 
	 public boolean ValidUserPwd(String uname, String pwd) {
         String sql = "select * from user_details where user_name =? and user_password=? and user_type_id=2";
         try {
                 db.ps2 = db.getConnection().prepareStatement(sql);
                 db.ps2.setString(1, uname);
                 db.ps2.setString(2, pwd);
                 db.rs2 = db.ps2.executeQuery();
                 if (db.rs2.next())
                         return true;
         } catch (SQLException e) {
                 e.printStackTrace();
         } finally {
                 try {
                     if(db.rs2 != null)    
                    	 db.rs2.close();
                 } catch (SQLException e) {
                         e.printStackTrace();
                 }
         }
         return false;
 }
	 
	 public boolean ValidUserPwdPatient(String uname, String pwd) {
         String sql = "select * from user_details where user_name =? and user_password=? and user_type_id=1";
         try {
                 db.ps2 = db.getConnection().prepareStatement(sql);
                 db.ps2.setString(1, uname);
                 db.ps2.setString(2, pwd);
                 db.rs2 = db.ps2.executeQuery();
                 if (db.rs2.next())
                         return true;
         } catch (SQLException e) {
                 e.printStackTrace();
         } finally {
                 try {
                     if(db.rs2 != null)    
                    	 db.rs2.close();
                 } catch (SQLException e) {
                         e.printStackTrace();
                 }
         }
         return false;
 }

}
