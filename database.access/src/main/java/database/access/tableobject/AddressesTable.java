package database.access.tableobject;

public class AddressesTable extends DatabaseTable {
	public static final String TABLE_NAME = AddressesEnum.TABLE_NAME.toString();
	public static final String ADDRESS_ID = AddressesEnum.ADDRESS_ID.toString();
	public static final String STREET_NUM = AddressesEnum.STREET_NUM.toString();
	public static final String STREET_NAME = AddressesEnum.STREET_NAME.toString();
	public static final String UNIT = AddressesEnum.UNIT.toString();
	public static final String CITY = AddressesEnum.CITY.toString();
	public static final String STATE = AddressesEnum.STATE.toString();
	public static final String ZIPCODE = AddressesEnum.ZIPCODE.toString();
	
	public AddressesTable(){
		super();
		this.setTableName(TABLE_NAME);
	}
	public AddressesTable addAddressId(String newId){		
		this.addNumAttr(ADDRESS_ID, newId);
		return this;
	}
	public AddressesTable addStreetNum(String newStreetNum){		
		this.addNumAttr(STREET_NUM, newStreetNum);
		return this;
	}
	public AddressesTable addStreetName(String newStreetName){		
		this.addStrAttr(STREET_NAME, newStreetName);
		return this;
	}
	public AddressesTable addStreetUnit(String newStreetUnit){		
		this.addStrAttr(UNIT, newStreetUnit);
		return this;
	}
	public AddressesTable addCity(String newCity){		
		this.addStrAttr(CITY, newCity);
		return this;
	}
	public AddressesTable addState(String newState){		
		this.addStrAttr(STATE, newState);
		return this;
	}
	public AddressesTable addZipCode(String newZipCode){		
		this.addNumAttr(ZIPCODE, newZipCode);
		return this;
	}
}
