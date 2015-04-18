package database.access.tableobject;

public class OfficesTable extends DatabaseTable {
	public static final String TABLE_NAME = OfficesEnum.TABLE_NAME.toString();
	public static final String OFFICE_ID = OfficesEnum.OFFICE_ID.toString();
	public static final String NAME = OfficesEnum.NAME.toString();
	public static final String ADDRESS_ID = OfficesEnum.ADDRESS_ID.toString();
	public static final String PHYSICIAN_USERNAME = OfficesEnum.PHYSICIAN_USERNAME.toString();
	public static final String PHONE_NUMBER = OfficesEnum.PHONE_NUMBER.toString();
	
	public OfficesTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public OfficesTable addOfficeId(String newId){		
		this.addNumAttr(OFFICE_ID, newId);
		return this;
	}
	public OfficesTable addOfficeName(String newName){		
		this.addStrAttr(NAME, newName);
		return this;
	}
	public OfficesTable addAddressId(String newId){		
		this.addStrAttr(ADDRESS_ID, newId);
		return this;
	}
	public OfficesTable addPhysicianUsername(String newUsername){		
		this.addStrAttr(PHYSICIAN_USERNAME, newUsername);
		return this;
	}
	public OfficesTable addPhoneNumber(String newPhoneNumber){		
		this.addNumAttr(PHONE_NUMBER, newPhoneNumber);
		return this;
	}
}
