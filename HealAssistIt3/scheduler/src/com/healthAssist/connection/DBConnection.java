package com.healthAssist.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	public static Connection con = null;
	public PreparedStatement ps = null; 
	public ResultSet rs = null;
	public PreparedStatement ps2=null;
	public ResultSet rs2=null;
	public PreparedStatement ps1=null;
	public ResultSet rs1=null;
	
	@Override
	protected void finalize() throws Throwable {
		con.close();
		super.finalize();
	}
	
	public DBConnection(){}
	public Connection getConnection(){
		try{
		Class.forName("oracle.jdbc.OracleDriver");
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "heal_assist", "heal_assist");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	

}
