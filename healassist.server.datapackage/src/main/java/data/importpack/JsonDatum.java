package data.importpack;

import javax.json.JsonObject;

import data.datatype.IDatumType;
import data.datatype.MimeType;

public class JsonDatum implements IDatum {
	
	//Constructors
	public JsonDatum(){
		this.SetType();
		this.SetData(null);
	}	
	public JsonDatum(JsonObject initData){
		this.SetType();
		this.SetData(initData);
	}
	
	private void SetType(){
		this.mimeType = MimeType.JSON;
	}	
	public IDatumType GetType() {
		return this.mimeType;
	}		

	public boolean SetData(Object newData){
		if (newData instanceof JsonObject){
			this.data = (JsonObject)newData;
			return true;
		}else {
			return false;
		}			
	}
	public Object GetData(){
		return this.data;
	}			
	
	private MimeType mimeType;	
	private JsonObject data;
}
