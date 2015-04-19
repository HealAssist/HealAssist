package com.healthAssist.dao;

import java.sql.SQLException;
import java.sql.Statement;

import com.healthAssist.beans.NotificationDetails;
import com.healthAssist.connection.DBConnection;

public class NotificationsDAO{
	public synchronized void createNotifications(String sql, String time){
		DBConnection db = null;

		try {
			db = new DBConnection();
			
			Statement st = db.getConnection().createStatement();

			db.rs = st.executeQuery(sql);
			if (db.rs != null) {
				while (db.rs.next()) {
					String userName = db.rs.getString("USER_NAME");
					String comment = "Hi " + userName + " you have to intake '"
							+ db.rs.getString("TABLET_ID") + "' for '" + db.rs.getString("CASE_TITLE") + "' on "+time;

					NotificationDetails nd = new NotificationDetails();
					nd.setUserId(db.rs.getString("USER_ID"));
					nd.setCourseId(db.rs.getString("COURSE_ID"));
					nd.setNotificationComment(comment);
					if(nd.insertNotification()){
						System.out.println("A new notification is created for "+userName+"("+nd.getUserId()+")");
						System.out.println(comment);
					}

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (db != null && db.con != null) {
				try {
					db.con.close();
					if (db.ps != null)
						db.ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
