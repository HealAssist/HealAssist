package communication.module;

public interface IFileObject {	
	public MimeType GetMimeType();
	public boolean SetData(Object newData);
	public Object GetData();
}
