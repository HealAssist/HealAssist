package database.access.tableobject;

public class PatEmergencyContactsTable extends DatabaseTable{
	public static final String TABLE_NAME = PatEmergencyContactsEnum.TABLE_NAME.toString();
	public static final String ID = PatEmergencyContactsEnum.ID.toString();
	public static final String FIRSTNAME = PatEmergencyContactsEnum.FIRSTNAME.toString();
	public static final String LASTNAME = PatEmergencyContactsEnum.LASTNAME.toString();
	public static final String RELATIONSHIP = PatEmergencyContactsEnum.RELATIONSHIP.toString();
	public static final String PHONE_NUMBER = PatEmergencyContactsEnum.PHONE_NUMBER.toString();
	
	public PatEmergencyContactsTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public PatEmergencyContactsTable addEmergencyContactId(String newId){		
		this.addNumAttr(ID, newId);
		return this;
	}
	public PatEmergencyContactsTable addContactFirstName(String newFirstName){		
		this.addStrAttr(FIRSTNAME, newFirstName);
		return this;
	}
	public PatEmergencyContactsTable addContactLastName(String newLastName){		
		this.addStrAttr(LASTNAME, newLastName);
		return this;
	}
	public PatEmergencyContactsTable addContactRelationship(String newRelationship){		
		this.addStrAttr(RELATIONSHIP, newRelationship);
		return this;
	}
	public PatEmergencyContactsTable addContactPhoneNumber(String newPhoneNumber){		
		this.addNumAttr(PHONE_NUMBER, newPhoneNumber);
		return this;
	}
}
