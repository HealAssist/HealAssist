package com.healthAssist.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.healthAssist.tasks.Afternoon;
import com.healthAssist.tasks.Evening;
import com.healthAssist.tasks.Morning;

public class DBScheduler {

	public void callScheduler() throws Exception {

		System.out.println("Scheduler Starterd...");
		Timer timer = new Timer();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 7);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		Date mrng = cal.getTime();
		System.out.println(mrng);

		cal.set(Calendar.HOUR_OF_DAY, 13);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date aftr = cal.getTime();
		System.out.println(aftr);

		cal.set(Calendar.HOUR_OF_DAY, 21);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date evng = cal.getTime();
		System.out.println(evng);
		
		long day = 24 * 60 * 60 * 1000;
		
		timer.scheduleAtFixedRate(new Morning(), mrng, day);
		timer.scheduleAtFixedRate(new Afternoon(), aftr, day);
		timer.scheduleAtFixedRate(new Evening(), evng, day);
	}

	public static void main(String a[]) throws Exception {
		DBScheduler dbs = new DBScheduler();
		dbs.callScheduler();
	}

}