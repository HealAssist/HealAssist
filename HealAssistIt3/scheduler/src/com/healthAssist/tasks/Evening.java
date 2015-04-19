package com.healthAssist.tasks;

import java.util.Date;
import java.util.TimerTask;

import com.healthAssist.dao.NotificationsDAO;

public class Evening extends TimerTask {

	public void run() {

		System.out.println("Evening Server started...");
		System.out.println(new Date());
		
		String sql = "select cd.course_id, cd.TABLET_ID,cad.CASE_TITLE, ud.user_id, ud.USER_NAME from course_details cd, PRESCRIPTION_DETAILS pd, CASE_DETAILS cad, user_details ud where cd.no_times_day in ('001', '011', '101', '111') and sysdate between to_date(cd.start_date,'mm/dd/yyyy') and to_date(cd.end_date, 'mm/dd/yyyy') and cd.prescription_id = pd.prescription_id and pd.case_id = cad.case_id and cad.user_id = ud.user_id";
		
		NotificationsDAO ndao = new NotificationsDAO();
		ndao.createNotifications(sql, "9PM");

	}
}