package communication.module;

import javax.json.*;

//Router to read json file from file system
//Module output: JSON objects as strings
public class EMRSimRouter implements IRouter {

	private IDatum _datum;
	
	public EMRSimRouter(){
		this._datum = null;
	}	
	public EMRSimRouter(IDatum initDatum){
		this._datum = initDatum;
	}
	
	// In: URI of file in filesystem.
	//Out: JsonArray from file, or null.	
	public IDatum GetData(String url) {
		try{
			JsonHelper jHelper = new JsonHelper();								
			JsonObject jObj = jHelper.ConstructJsonObject(url);					
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
