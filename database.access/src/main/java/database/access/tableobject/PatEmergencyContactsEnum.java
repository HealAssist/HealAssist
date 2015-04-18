package database.access.tableobject;

public enum PatEmergencyContactsEnum {
	TABLE_NAME("PAT_EMERGENCY_CONTACTS"),
	ID("EC_ID"),
	FIRSTNAME("EC_FNAME"),
	LASTNAME("EC_LNAME"),
	RELATIONSHIP("EC_RELATIONSHIP"),
	PHONE_NUMBER("EC_PHONE_NUM")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	PatEmergencyContactsEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;		
}
