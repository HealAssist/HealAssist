package com.healthAssist.tasks;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.TimerTask;

import com.healthAssist.beans.NotificationDetails;
import com.healthAssist.connection.DBConnection;
import com.healthAssist.dao.NotificationsDAO;

public class Morning extends TimerTask {

	public void run() {

		System.out.println("Morning Server started...");
		System.out.println(new Date());

		String sql = "select cd.course_id, cd.TABLET_ID,cad.CASE_TITLE, ud.user_id, ud.USER_NAME from course_details cd, PRESCRIPTION_DETAILS pd, CASE_DETAILS cad, user_details ud where cd.no_times_day in ('100', '101', '110', '111') and sysdate between to_date(cd.start_date,'mm/dd/yyyy') and to_date(cd.end_date, 'mm/dd/yyyy') and cd.prescription_id = pd.prescription_id and pd.case_id = cad.case_id and cad.user_id = ud.user_id";
		
		NotificationsDAO ndao = new NotificationsDAO();
		ndao.createNotifications(sql,"7AM");
		
	}
}