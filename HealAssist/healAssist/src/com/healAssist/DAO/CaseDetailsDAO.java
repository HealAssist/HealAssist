package com.healAssist.DAO;

import com.healAssist.connection.DBConnection;
import com.healAssist.beans.*;

public class CaseDetailsDAO {

	public CaseDetails BusinessLogic(String id){
		DBConnection db =null;
		CaseDetails c = null;
		String query="select  * from  case_details where user_id="+id+"";

		try {
			db= new DBConnection();
			db.ps = db.getConnection().prepareStatement(query);
			db.rs = db.ps.executeQuery();
			c=new CaseDetails();
			
//			Name       Null     Type          
//			---------- -------- ------------- 
//			CASE_ID    NOT NULL VARCHAR2(10)  
//			USER_ID             VARCHAR2(10)  
//			DOCTOR_ID           VARCHAR2(10)  
//			CASE_DATE           DATE          
//			CASE_TITLE
			while(db.rs.next()){
				c.setDoctorId(db.rs.getString(3));
				c.setCaseDate(db.rs.getString(4));
				c.setCaseTitle(db.rs.getString(4));
				

				return c;
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		return c;
}
}