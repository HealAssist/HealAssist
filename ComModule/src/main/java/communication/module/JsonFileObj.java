package communication.module;

import javax.json.JsonObject;

public class JsonFileObj implements IFileObject {
	
	//Constructors
	public JsonFileObj(){
		this.SetJsonMimeType();
		this.SetData(null);
	}	
	public JsonFileObj(JsonObject initData){
		this.SetJsonMimeType();
		this.SetData(initData);
	}
	
	private void SetJsonMimeType(){
		this.mimeType = MimeType.JSON;
	}	
	public MimeType GetMimeType() {
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
