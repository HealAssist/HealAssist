package database.access.tableobject;

public enum PhoneNumbersEnum {
	TABLE_NAME("PHONE_NUMBERS"),
	NUMBER_ACCESSIBILITY("PHONE_NUMBER_ACC"),
	NUMBER_RELIABILITY("PHONE_NUMBER_REL"),
	NUMBER_LOCATION("PHONE_NUMBER_LOC"),
	PHONE_NUMBER("PHONE_NUMBER")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	PhoneNumbersEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;		
}
