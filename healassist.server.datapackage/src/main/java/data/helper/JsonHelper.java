package data.helper;

import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class JsonHelper {
	public JsonObject ConstructJsonObject(String uri){
		try{
			JsonReader rdr = this.CreateReader(uri); 				
			return rdr.readObject();			
		}catch(Exception JsonHelper_CreateJsonObject){
			System.out.println(JsonHelper_CreateJsonObject);			
		}
		return null;
	}
	
	public JsonArray ConstructJsonArray(String uri){
		try{
			JsonReader rdr = this.CreateReader(uri);
			return rdr.readArray();
		}catch(Exception JsonHelper_CreateJsonArray){
			System.out.println(JsonHelper_CreateJsonArray);
		}
		return null;
	}
	
	public JsonReader CreateReader(String uri){
		try{
			return Json.createReader(new FileReader(uri));
		}catch(Exception JsonHelper_CreateReader){
			System.out.println(JsonHelper_CreateReader);
		}
		return null;
	}
}
