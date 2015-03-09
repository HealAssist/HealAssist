package communication.module;

import java.io.FileReader;
import javax.json.*;

//Router to read json file from file system
//Module output: JSON objects as strings
public class EMRSimRouter implements IRouter {
	
//	public static void main(String[] args){
//		//Read in json object from file
//		IFileObject jObj = (JsonFileObj)GetData("C:/1-dev/1-mock-data/data.json");							
//		
//		//Test code *** Output result			
//		System.out.println(jObj.GetData().toString() + "\n");
//		System.out.println(jObj.GetMimeType().GetExtension());
//	}
	
	
	// In: URI of file in filesystem.
	//Out: JsonArray from file, or null.
	private JsonObject ConstructJsonObject(String uri){
		try{
			JsonReader rdr = Json.createReader(new FileReader(uri));				
			return rdr.readObject();			
		}catch(Exception EMRSim_ConJsonArray){
			System.out.println(EMRSim_ConJsonArray);			
		}
		return null;
	}


	
	public IFileObject GetData(String url) {
		try{
			JsonObject jObj = ConstructJsonObject(url);					
			if(jObj.size() >= 1){
				//Each object must be packaged in JsonFileObject
				JsonFileObj datum = new JsonFileObj(jObj);
				return datum;
			}						
		}catch(Exception EMRSim_GetData){
			System.out.println(EMRSim_GetData);			
		}	
		return null;
	}
	
}
