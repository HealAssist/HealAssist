package com.healthAssist.beans;


import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.healthAssist.connection.DBConnection;

public class NotificationDetails {
	private String notificationId;
	private String userId;
	private String readStatus;
	private String activeStatus;
	private String notificationSentTime;
	private String notificationReadTime;
	private String notificationComment;
	private String courseId;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getNotificationSentTime() {
		return notificationSentTime;
	}
	public void setNotificationSentTime(String notificationSentTime) {
		this.notificationSentTime = notificationSentTime;
	}
	public String getNotificationReadTime() {
		return notificationReadTime;
	}
	public void setNotificationReadTime(String notificationReadTime) {
		this.notificationReadTime = notificationReadTime;
	}
	public String getNotificationComment() {
		return notificationComment;
	}
	public void setNotificationComment(String notificationComment) {
		this.notificationComment = notificationComment;
	}
	public synchronized boolean insertNotification() {
		
		DBConnection db = null;
		try{
		String sql = "INSERT INTO NOTIFICATIONS_DETAILS ( NOTIFICATION_ID, USER_ID, NOTIFICATION_SENT_TIME, NOTIFICATION_COMMENT, COUSER_ID ) VALUES ( notification_id_seq.nextval, ?, ?, ?, ? )";
		db = new DBConnection();
		db.ps = db.getConnection().prepareStatement(sql);
		int parameterIndex = 1;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		db.ps.setString(parameterIndex++, this.userId);
		db.ps.setString(parameterIndex++, dateFormat.format(date));
		db.ps.setString(parameterIndex++, this.notificationComment);
		db.ps.setString(parameterIndex++, this.courseId);
		
		if(db.ps.executeUpdate() > 0)
			return true;
		
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		} finally {
			if (db != null && db.con != null) {
				try {
					db.con.close();
					if (db.ps != null)
						db.ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
		
	}
	
	
}
