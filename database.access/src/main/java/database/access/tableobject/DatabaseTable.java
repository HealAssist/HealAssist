package database.access.tableobject;

import java.util.HashMap;

public class DatabaseTable {
	private String tableName;
	private HashMap<String, String> attributeList;	
	
	public DatabaseTable(){
		this.tableName = "";
		this.attributeList = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getAttributeMap(){
		return this.attributeList;
	}
	protected void addAttribute(String attrKey, String attrValue){
		this.attributeList.put(attrKey, attrValue);
	}
	
	public String getTableName(){
		return this.tableName;
	}
	protected void setTableName(String newTableName){
		this.tableName = newTableName;
	}

	protected String formatStringAttr(String attrValue){
		return "'" + attrValue + "'";
	}
	
	public Boolean hasAttributes(){
		if( this.attributeList.size() <= 0 ){
			return false;
		}else{
			return true;
		}
	}
	
}