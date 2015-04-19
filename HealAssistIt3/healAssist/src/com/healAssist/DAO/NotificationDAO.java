package com.healAssist.DAO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.healAssist.beans.NotificationDetails;
import com.healAssist.connection.DBConnection;

public class NotificationDAO {
	public String getUserNotifications(String id) {
		DBConnection db = null;
		NotificationDetails c = null;
		String query = "select * from NOTIFICATIONS_DETAILS nd where nd.user_id =" + id
				+ " and nd.read_status ='U' order by nd.notification_sent_time desc";

		JSONObject json;
		JSONArray notArr;
		try {
			db = new DBConnection();
			db.ps = db.getConnection().prepareStatement(query);
			db.rs = db.ps.executeQuery();

			notArr = new JSONArray();
			while (db.rs.next()) {

				json = new JSONObject();
				json.put("notificationId", db.rs.getString(1));
				json.put("userId", db.rs.getString(2));
				json.put("readStatus", db.rs.getString(3));
				json.put("activeStatus", db.rs.getString(4));
				json.put("notificationSentTime", db.rs.getString(5));
				json.put("notificationReadTime", db.rs.getString(6));
				json.put("notificationComment", db.rs.getString(7));
				json.put("courseId", db.rs.getString(8));

				notArr.put(json);
			}
			System.out.println(notArr.toString());
			return notArr.toString();

		} catch (Exception e) {
			e.printStackTrace();
			notArr = new JSONArray();
			return notArr.toString();
		}

	}

	public boolean updNotification(String notificationId) {
		DBConnection db = null;
		String query = "UPDATE NOTIFICATIONS_DETAILS SET READ_STATUS ='R' , NOTIFICATION_READ_TIME = ? WHERE NOTIFICATION_ID = ?";

		try {
			db = new DBConnection();
			db.ps = db.getConnection().prepareStatement(query);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			
			db.ps.setString(1, dateFormat.format(date));
			db.ps.setString(2, notificationId);
			
			if(db.ps.executeUpdate() > 0){
				return true;
			};
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
