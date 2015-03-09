package communication.module;

import java.io.FileReader;
import javax.json.*;

//Router to read json file from file system
//Module output: JSON objects as strings
public class EMRSimRouter implements IRouter {
	
//	public static void main(String[] args){
//		//Read in json object from file
//		IDatum jObj = (JsonDatum)GetData("C:/1-dev/1-mock-data/data.json");							
//		
//		//Test code *** Output result			
//		System.out.println(jObj.GetData().toString() + "\n");		
//	}
	
	
	// In: URI of file in filesystem.
	//Out: JsonArray from file, or null.
	private JsonObject ConstructJsonObject(String uri){
		try{
			JsonReader rdr = Json.createReader(new FileReader(uri));				
			return rdr.readObject();			
		}catch(Exception EMRSim_ConstructJsonArray){
			System.out.println(EMRSim_ConstructJsonArray);			
		}
		return null;
	}
	
	public IDatum GetData(String url) {
		try{
			JsonObject jObj = ConstructJsonObject(url);					
			if(jObj.size() >= 1){
				//Each object must be packaged in JsonFileObject
				JsonBinder jBinder = new JsonBinder();
				JsonDatum jDatum = (JsonDatum)jBinder.BindData(jObj);
				return jDatum;
			}						
		}catch(Exception EMRSim_GetData){
			System.out.println(EMRSim_GetData);			
		}	
		return null;
	}
	
}
