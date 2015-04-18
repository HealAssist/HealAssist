package database.access.tableobject;

public enum PhyPatientsEnum {			
	TABLE_NAME("PHY_PATIENTS"),
	PHYSICIAN_USERNAME("PHY_USERNAME"),
	PATIENT_CHART_ID("PAT_CHART_ID")
	;			
	public String toString(){
		return this.stringRepresentation;
	}
	
	PhyPatientsEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;			
}
