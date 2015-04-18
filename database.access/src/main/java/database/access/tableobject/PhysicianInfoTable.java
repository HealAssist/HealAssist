package database.access.tableobject;

public class PhysicianInfoTable extends DatabaseTable {
	public static final String TABLE_NAME = PhysicianInfoEnum.TABLE_NAME.toString();
	public static final String USERNAME = PhysicianInfoEnum.USERNAME.toString();
	public static final String PASSWORD = PhysicianInfoEnum.PASSWORD.toString();
	public static final String FIRSTNAME = PhysicianInfoEnum.FIRSTNAME.toString();
	public static final String MIDDLENAME = PhysicianInfoEnum.MIDDLENAME.toString();
	public static final String LASTNAME = PhysicianInfoEnum.LASTNAME.toString();
	public static final String EMAIL = PhysicianInfoEnum.EMAIL.toString();
	
	public PhysicianInfoTable(){
		super();
		this.setTableName(TABLE_NAME);
	}	
		
	public PhysicianInfoTable addUsername(String newUsername){		
		this.addStrAttr(USERNAME, newUsername);
		return this;
	}
	public PhysicianInfoTable addPassword(String newUserPassword){				
		this.addStrAttr(PASSWORD, newUserPassword);
		return this;
	}	
	public PhysicianInfoTable addFirstName(String newFirstName){		
		this.addStrAttr(FIRSTNAME, newFirstName);
		return this;
	}
	public PhysicianInfoTable addMiddleName(String newMiddleName){		
		this.addStrAttr(MIDDLENAME, newMiddleName);
		return this;
	}
	public PhysicianInfoTable addLastName(String newLastName){		
		this.addStrAttr(LASTNAME, newLastName);
		return this;
	}	
	public PhysicianInfoTable addEmail(String newEmail){		
		this.addStrAttr(EMAIL, newEmail);
		return this;
	}	
}
