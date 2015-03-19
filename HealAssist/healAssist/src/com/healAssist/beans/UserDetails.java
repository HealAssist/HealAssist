package com.healAssist.beans;

import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.healAssist.connection.DBConnection;
import com.healAssist.util.HealAssistUtil;

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
	private List<CaseDetails> cases = new ArrayList<CaseDetails>();

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

	public List<CaseDetails> getCases() {
		return cases;
	}

	public void setCases(List<CaseDetails> cases) {
		this.cases = cases;
	}
	private String md5(String c){
		try{
			MessageDigest digs=MessageDigest.getInstance("MD5");
			digs.update((new String(c).getBytes("UTF8")));
			String str = new String(digs.digest());
			 return str;
		}catch (Exception ex) {
			return "";
		}
	}
	public boolean InsertUser() {

		int userId = HealAssistUtil.getSequenceNextValue("user_id_seq");

		String sql = "INSERT INTO USER_DETAILS (USER_ID,USER_AGE,USER_PHONE,USER_EMAIL,USER_TYPE_ID,USER_GENDER,USER_NAME,USER_FULL_NAME,USER_PASSWORD,USER_ADDRESS,USER_CITY,USER_COUNTRY) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		DBConnection db = null;
		try {

			db = new DBConnection();

			db.ps = db.getConnection().prepareStatement(sql);
			int parameterIndex = 1;

			db.ps.setString(parameterIndex++, userId + "");
			db.ps.setString(parameterIndex++, getAge());
			db.ps.setString(parameterIndex++, getUserPhone());
			db.ps.setString(parameterIndex++, getUserEmail());
			db.ps.setString(parameterIndex++, getUserType());
			db.ps.setString(parameterIndex++, getGender());
			db.ps.setString(parameterIndex++, getUserName());
			db.ps.setString(parameterIndex++, getFullName());
			db.ps.setString(parameterIndex++, md5(getPassword()));
			db.ps.setString(parameterIndex++, getAddress());
			db.ps.setString(parameterIndex++, getCity());
			db.ps.setString(parameterIndex++, getCountry());

			if (db.ps.executeUpdate() > 0) {
				if (getCases() != null && getCases().size() > 0) {
					sql = "INSERT INTO CASE_DETAILS(CASE_ID,USER_ID,DOCTOR_ID,CASE_DATE,CASE_TITLE,CASE_INFO) VALUES (?,?,?,?,?,?)";
					db.ps = db.getConnection().prepareStatement(sql);
					Iterator<CaseDetails> casesItr = getCases().iterator();
					while (casesItr.hasNext()) {
						int caseId = HealAssistUtil.getSequenceNextValue("CASE_ID_SEQ");
						CaseDetails caseD = casesItr.next();
						parameterIndex = 1;
						db.ps.setString(parameterIndex++, caseId + "");
						db.ps.setString(parameterIndex++, userId + "");
						db.ps.setString(parameterIndex++, caseD.getDoctorId());
						db.ps.setString(parameterIndex++, caseD.getCaseDate());
						db.ps.setString(parameterIndex++, caseD.getCaseTitle());
						db.ps.setString(parameterIndex++, caseD.getCaseInfo());

						if (db.ps.executeUpdate() > 0) {
							if (caseD.getPrescriptions() != null && caseD.getPrescriptions().size() > 0) {
								sql = "INSERT INTO PRESCRIPTION_DETAILS (PRESCRIPTION_ID,CASE_ID,PRESCRIPTION_DATE,PRESCRIPTION_REMARKS) VALUES (?,?,?,?)";
								db.ps = db.getConnection().prepareStatement(sql);
								Iterator<PrescriptionDetails> presItr = caseD.getPrescriptions().iterator();
								while (presItr.hasNext()) {
									int presId = HealAssistUtil.getSequenceNextValue("PRESCRIPTION_ID_SEQ");
									PrescriptionDetails presD = presItr.next();
									parameterIndex = 1;
									db.ps.setString(parameterIndex++, presId + "");
									db.ps.setString(parameterIndex++, caseId + "");
									db.ps.setString(parameterIndex++, presD.getPrescriptioDate());
									db.ps.setString(parameterIndex++, presD.getPrescriptionRemarks());
									
									if (db.ps.executeUpdate() > 0) {
										if (presD.getCourses() != null && presD.getCourses().size() > 0) {
											sql = "INSERT INTO COURSE_DETAILS (COURSE_ID,PRESCRIPTION_ID,TABLET_ID,NO_TIMES_DAY,START_DATE,END_DATE) VALUES (?,?,?,?,?,?)";
											db.ps = db.getConnection().prepareStatement(sql);
											Iterator<CourseDetails> courseItr = presD.getCourses().iterator();
											while (courseItr.hasNext()) {
												int courseId = HealAssistUtil.getSequenceNextValue("COURSE_ID_SEQ");
												CourseDetails courseD = courseItr.next();
												parameterIndex = 1;
												db.ps.setString(parameterIndex++, courseId + "");
												db.ps.setString(parameterIndex++, presId + "");
												db.ps.setString(parameterIndex++, courseD.getTabletId());
												db.ps.setString(parameterIndex++, courseD.getNoOfTimesDay());
												db.ps.setString(parameterIndex++, courseD.getStartDate());
												db.ps.setString(parameterIndex++, courseD.getEndDate());
												
												db.ps.executeUpdate();
											}
										}

									}

								}

							}
						}

					}
				}
			}
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (db != null && db.con != null) {
				try {
					db.con.close();
					if (db.ps != null)
						db.ps.close();
					if (db.ps1 != null)
						db.ps1.close();
					if (db.ps2 != null)
						db.ps2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
