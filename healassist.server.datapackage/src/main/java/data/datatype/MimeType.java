package data.datatype;

//Enumeration to hold type information related to data objects
public enum MimeType implements IDatumType {				
	BINARY(".bin"), JSON(".json");
			
	private String extension;
		
	public String GetExtension(){
		return this.extension;
	}
	
	private MimeType(String ext){
		this.extension = ext;
	}				
}
