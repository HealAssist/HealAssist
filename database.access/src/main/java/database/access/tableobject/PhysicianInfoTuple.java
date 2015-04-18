package database.access.tableobject;

public class PhysicianInfoTuple extends DatabaseTable {			
	public PhysicianInfoTuple(){
		super();
		this.setTableName(PhysicianInfoTableEnum.TABLE_NAME.attrName());
	}	
		
	public void addUsername(String newUsername){ // *** Create abstraction for all objects (i.e, UserId)?
		String formStrUsername = this.formatStringAttr(newUsername);
		this.addAttribute(PhysicianInfoTableEnum.USERNAME.attrName(), formStrUsername);		
	}
	public void addPassword(String newUserPassword){		
		String formStrPassword = this.formatStringAttr(newUserPassword);
		this.addAttribute(PhysicianInfoTableEnum.PASSWORD.attrName(), formStrPassword);
	}	
	public void addFirstName(String newFirstName){
		String formStrFName = this.formatStringAttr(newFirstName);
		this.addAttribute(PhysicianInfoTableEnum.FIRSTNAME.attrName(), formStrFName);
	}
	public void addMiddleName(String newMiddleName){
		String formStrMName = this.formatStringAttr(newMiddleName);
		this.addAttribute(PhysicianInfoTableEnum.MIDDLENAME.attrName(), formStrMName);
	}
	public void addLastName(String newLastName){
		String formStrLName = this.formatStringAttr(newLastName);
		this.addAttribute(PhysicianInfoTableEnum.LASTNAME.attrName(), formStrLName);
	}	
	public void addEmail(String newEmail){
		String formStrEmail = this.formatStringAttr(newEmail);
		this.addAttribute(PhysicianInfoTableEnum.EMAIL.attrName(), formStrEmail);
	}	
}