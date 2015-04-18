package database.access.tableobject;

public enum PatAppointmentsEnum {
	TABLE_NAME("PAT_APPOINTMENTS"),
	APPT_ID("APPT_ID"),
	PATIENT_CHART_ID("PAT_CHART_ID"),
	DATE("APPT_DATE"),
	TIME("APPT_TIME"),
	REASON("APPT_REASON"),
	NOTES("APPT_NOTES")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	PatAppointmentsEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;
}
