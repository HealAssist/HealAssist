package healassist.service.response;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonHelper {
	public static JSONObject buildJson(HashMap<String, String> map){		 
		return new JSONObject(map);		
	}
}
