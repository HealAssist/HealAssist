package database.access.tableobject;

public enum PatAllergiesEnum {
	TABLE_NAME("PAT_ALLERGIES"),
	ALLERGY_ID("ALLERGY_ID"),
	ALLERGY_TYPE("ALLERGY_TYPE"),
	ALLERGY_REACTION("ALLERGY_REACTION"),
	ALLERGY_STATUS("ALLERGY_STATUS"),
	PATIENT_CHART_ID("PAT_CHART_ID")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	PatAllergiesEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;
}
