package data.binder;

import javax.json.JsonObject;

import data.importpack.IDatum;
import data.importpack.JsonDatum;

// In: A JsonObject to be bound to a data item
//Out: A JsonDataObj if input correct, else null
public class JsonBinder implements IDataBinder {
	public IDatum BindData(Object jObj){
		try{
			if(jObj instanceof JsonObject){
				JsonDatum jDatum = new JsonDatum((JsonObject)jObj);
				return jDatum;	
			}			
		}catch(Exception jsonBinder_BindData){
			System.out.println(jsonBinder_BindData);
		}
		return null;
	}
	
}
