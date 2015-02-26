package com.healAssist.beans;

import java.sql.SQLException;

import com.healAssist.connection.DBConnection;

public class LoginDetails {
	
			private int userNo;
			private String password;
			private String userType;
			private String loginDate;
			private int loginAtt;

			public int getUserNo() {
				return userNo;
			}
			public void setUserNo(int userNo) {
				this.userNo = userNo;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getUserType() {
				return userType;
			}
			public void setUserType(String userType) {
				this.userType = userType;
			}
			public String getLoginDate() {
				return loginDate;
			}
			public void setLoginDate(String loginDate) {
				this.loginDate = loginDate;
			}
			public int getLoginAtt() {
				return loginAtt;
			}
			public void setLoginAtt(int loginAtt) {
				this.loginAtt = loginAtt;
			}
			
			public boolean InsertLogin(){
				//String sql1="select user_id from user_details";
				String sql="insert into Login_details(user_no,password,user_type,login_attempts) values(?,?,?,?)";	
			
				try {
			
					DBConnection db = new DBConnection();
//					db.ps = DBConnection.getConnection().prepareStatement(sql1);
					db.ps = db.getConnection().prepareStatement(sql);
					
					
				    db.ps.setInt(1, getUserNo());
					db.ps.setString(2, getPassword());
					db.ps.setString(3,"user");
					db.ps.setInt(4, 0);
					
					return db.ps.executeUpdate()>0?true:false;
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				return false;
					
			}
			}




