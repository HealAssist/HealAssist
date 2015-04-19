package com.healAssist.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healAssist.connection.*;
import com.healAssist.beans.*;

public class LoginDAO {
	DBConnection db = new DBConnection();

	// public int ValidLogin(UserDetails c) {
	// // whether login count is equal to 5
	//
	// if(ValidUserPwd(c.getUserName(),c.getPassword()))
	// return 1;
	// else
	// return 0;
	// }
	//
	// public int ValidLoginPatient(UserDetails c) {
	// System.out.println("hi"+c.getPassword());
	// if(ValidUserPwdPatient(c.getUserName(), c.getPassword()))
	// return 1;
	// else
	// return 0;
	// }

	public UserDetails ValidUserPwd(String uname, String pwd) {
		DBConnection db = null;
		UserDetails user = null;
		String sql = "select * from user_details where user_name =? and user_password=? and user_type_id=2";
		try {
			db = new DBConnection();
			db.ps = db.getConnection().prepareStatement(sql);
			db.ps.setString(1, uname);
			db.ps.setString(2, pwd);
			db.rs = db.ps.executeQuery();

			while (db.rs.next()) {
				user = new UserDetails();
				user.setUserId(db.rs.getString(1));
				user.setAge(db.rs.getString(2));
				user.setUserPhone(db.rs.getString(3));
				user.setUserEmail(db.rs.getString(4));
				user.setGender(db.rs.getString(6));
				user.setUserName(db.rs.getString(7));
				user.setFullName(db.rs.getString(8));
				user.setPassword(db.rs.getString(9));
				user.setAddress(db.rs.getString(10));
				user.setCity(db.rs.getString(11));
				user.setCountry(db.rs.getString(12));

				sql = "select cd.*, ud.user_full_name doctor_name from case_details cd, user_details ud where cd.doctor_id = ud.user_id and cd.user_id = ?";
				db.ps = db.getConnection().prepareStatement(sql);
				db.ps.setString(1, user.getUserId());
				db.rs1 = db.ps.executeQuery();

				while (db.rs1.next()) {
					CaseDetails caseD = new CaseDetails();

					caseD.setCaseId(db.rs1.getString("case_id"));
					caseD.setDoctorId(db.rs1.getString("doctor_id"));
					caseD.setDoctorName(db.rs1.getString("doctor_name"));
					caseD.setCaseDate(db.rs1.getString("case_date"));
					caseD.setCaseTitle(db.rs1.getString("case_title"));
					caseD.setCaseInfo(db.rs1.getString("case_info"));

					sql = "select * from prescription_details pd where pd.case_id = ?";
					db.ps = db.getConnection().prepareStatement(sql);
					db.ps.setString(1, caseD.getCaseId());
					db.rs2 = db.ps.executeQuery();

					while (db.rs2.next()) {
						PrescriptionDetails prsD = new PrescriptionDetails();

						prsD.setPrescriptionId(db.rs2.getString("prescription_id"));
						prsD.setCaseId(db.rs2.getString("case_id"));
						prsD.setPrescriptioDate(db.rs2.getString("prescription_date"));
						prsD.setPrescriptionRemarks(db.rs2.getString("prescription_remarks"));

						sql = "select * from course_details cod where cod.prescription_id = ?";
						db.ps = db.getConnection().prepareStatement(sql);
						db.ps.setString(1, prsD.getPrescriptionId());
						db.rs3 = db.ps.executeQuery();

						while (db.rs3.next()) {
							CourseDetails courseD = new CourseDetails();
							courseD.setPrescriptionId(db.rs3.getString("prescription_id"));
							courseD.setCourseId(db.rs3.getString("course_id"));
							courseD.setTabletId(db.rs3.getString("tablet_id"));
							courseD.setNoOfTimesDay(db.rs3.getString("no_times_day"));
							courseD.setStartDate(db.rs3.getString("start_date"));
							courseD.setEndDate(db.rs3.getString("end_date"));

							prsD.getCourses().add(courseD);
						}
						caseD.getPrescriptions().add(prsD);
					}
					user.getCases().add(caseD);
				}

			}
			System.out.println(user);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (db != null && db.rs != null)
					db.rs.close();
				if (db != null && db.rs1 != null)
					db.rs1.close();
				if (db != null && db.rs2 != null)
					db.rs2.close();
				if (db != null && db.rs3 != null)
					db.rs3.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	public UserDetails ValidUserPwdPatient(String uname, String pwd) {
		DBConnection db = null;
		UserDetails user = null;
		String sql = "select * from user_details where user_name =? and user_password=? and user_type_id=1";
		try {
			db = new DBConnection();
			db.ps2 = db.getConnection().prepareStatement(sql);
			db.ps2.setString(1, uname);
			db.ps2.setString(2, pwd);
			db.rs2 = db.ps2.executeQuery();

			while (db.rs2.next()) {
				user = new UserDetails();
				user.setUserId(db.rs2.getString(1));
				user.setAge(db.rs2.getString(2));
				user.setUserPhone(db.rs2.getString(3));
				user.setUserEmail(db.rs2.getString(4));
				user.setGender(db.rs2.getString(6));
				user.setUserName(db.rs2.getString(7));
				user.setFullName(db.rs2.getString(8));
				user.setPassword(db.rs2.getString(9));
				user.setAddress(db.rs2.getString(10));
				user.setCity(db.rs2.getString(11));
				user.setCountry(db.rs2.getString(12));

				sql = "select cd.*, ud.user_full_name doctor_name from case_details cd, user_details ud where cd.doctor_id = ud.user_id and cd.user_id = ?";
				db.ps = db.getConnection().prepareStatement(sql);
				db.ps.setString(1, user.getUserId());
				db.rs1 = db.ps.executeQuery();

				while (db.rs1.next()) {
					CaseDetails caseD = new CaseDetails();

					caseD.setCaseId(db.rs1.getString("case_id"));
					caseD.setDoctorId(db.rs1.getString("doctor_id"));
					caseD.setDoctorName(db.rs1.getString("doctor_name"));
					caseD.setCaseDate(db.rs1.getString("case_date"));
					caseD.setCaseTitle(db.rs1.getString("case_title"));
					caseD.setCaseInfo(db.rs1.getString("case_info"));

					sql = "select * from prescription_details pd where pd.case_id = ?";
					db.ps = db.getConnection().prepareStatement(sql);
					db.ps.setString(1, caseD.getCaseId());
					db.rs2 = db.ps.executeQuery();

					while (db.rs2.next()) {
						PrescriptionDetails prsD = new PrescriptionDetails();

						prsD.setPrescriptionId(db.rs2.getString("prescription_id"));
						prsD.setCaseId(db.rs2.getString("case_id"));
						prsD.setPrescriptioDate(db.rs2.getString("prescription_date"));
						prsD.setPrescriptionRemarks(db.rs2.getString("prescription_remarks"));

						sql = "select * from course_details cod where cod.prescription_id = ?";
						db.ps = db.getConnection().prepareStatement(sql);
						db.ps.setString(1, prsD.getPrescriptionId());
						db.rs3 = db.ps.executeQuery();

						while (db.rs3.next()) {
							CourseDetails courseD = new CourseDetails();
							courseD.setPrescriptionId(db.rs3.getString("prescription_id"));
							courseD.setCourseId(db.rs3.getString("course_id"));
							courseD.setTabletId(db.rs3.getString("tablet_id"));
							courseD.setNoOfTimesDay(db.rs3.getString("no_times_day"));
							courseD.setStartDate(db.rs3.getString("start_date"));
							courseD.setEndDate(db.rs3.getString("end_date"));

							prsD.getCourses().add(courseD);
						}
						caseD.getPrescriptions().add(prsD);
					}
					user.getCases().add(caseD);
				}
			}
			System.out.println(user);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (db != null && db.rs2 != null)
					db.rs2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}

}
