package database.access.tableobject;

public enum AddressesEnum {
	TABLE_NAME("ADDRESSES"),
	ADDRESS_ID("ADDRESS_ID"),
	STREET_NUM("ADDRESS_STREET_NUM"),
	STREET_NAME("ADDRESS_STREET_NAME"),
	UNIT("ADDRESS_UNIT"),
	CITY("ADDRESS_CITY"),
	STATE("ADDRESS_STATE"),
	ZIPCODE("ADDRESS_ZIPCODE")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	AddressesEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;
}
