package database.access.tableobject;

public enum MedicalSpecialtiesEnum {
	TABLE_NAME("MEDICAL_SPECIALTIES"),
	SPECIALTY_ID("SPEC_ID"),
	SPECIALTY_TITLE("SPEC_TITLE"),
	SPECIALTY_DESCRIPTION("SPEC_DESC"),
	OFFICE_ID("OFFICE_ID"),
	PHYSICIAN_USERNAME("PHY_USERNAME")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	MedicalSpecialtiesEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;
}
