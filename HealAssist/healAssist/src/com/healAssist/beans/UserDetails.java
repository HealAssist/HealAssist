package com.healAssist.beans;
import java.sql.SQLException;

import com.healAssist.connection.*;
public class UserDetails {

			private String fullName;
			private String userEmail;
			private String userPhone;
			private String gender;
			private String age;
			private String address;
			private String city;
			private String country;
			private String userName;
			private String password;
			private String userType;
			
			public String getUserType() {
				return userType;
			}


			public void setUserType(String userType) {
				this.userType = userType;
			}


			public String getFullName() {
				return fullName;
			}


			public void setFullName(String fullName) {
				this.fullName = fullName;
			}


			public String getUserEmail() {
				return userEmail;
			}


			public void setUserEmail(String userEmail) {
				this.userEmail = userEmail;
			}


			public String getUserPhone() {
				return userPhone;
			}


			public void setUserPhone(String userPhone) {
				this.userPhone = userPhone;
			}


			public String getGender() {
				return gender;
			}


			public void setGender(String gender) {
				this.gender = gender;
			}


			public String getAge() {
				return age;
			}


			public void setAge(String age) {
				this.age = age;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}


			public String getCity() {
				return city;
			}


			public void setCity(String city) {
				this.city = city;
			}


			public String getCountry() {
				return country;
			}


			public void setCountry(String country) {
				this.country = country;
			}


			public String getUserName() {
				return userName;
			}


			public void setUserName(String userName) {
				this.userName = userName;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				this.password = password;
			}


		
			
		
			public boolean InsertUser(){
				String sql="INSERT INTO USER_DETAILS ( USER_ID,USER_AGE,USER_PHONE,USER_EMAIL,USER_TYPE_ID,USER_GENDER,USER_NAME,USER_FULL_NAME,USER_PASSWORD,USER_ADDRESS,USER_CITY,USER_COUNTRY) VALUES(user_id_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)";	
			
				try {
			
					DBConnection db = new DBConnection();
					
					db.ps = db.getConnection().prepareStatement(sql);
					
					
					
					//db.ps.setInt(1, SEQ.NEXTVAL());
					db.ps.setString(1, getAge());
					db.ps.setString(2, getUserPhone());
					db.ps.setString(3, getUserEmail());
					db.ps.setString(4, getUserType());
					db.ps.setString(5, getGender());
					db.ps.setString(6, getUserName());
					db.ps.setString(7, getFullName());
					db.ps.setString(8, getPassword());
					db.ps.setString(9, getAddress());
					db.ps.setString(10, getCity());
					db.ps.setString(11, getCountry());

					return db.ps.executeUpdate()>0?true:false;
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				return false;
					
			}
		}




			
			







