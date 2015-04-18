package database.access.tableobject;

public enum OfficesEnum {
	TABLE_NAME("OFFICES"),
	OFFICE_ID("OFFICE_ID"),
	NAME("OFFICE_NAME"),
	ADDRESS_ID("OFFICE_ADDRESS_ID"),
	PHYSICIAN_USERNAME("OFFICE_PHY_USERNAME"),
	PHONE_NUMBER("OFFICE_PHONE")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	OfficesEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;
}
