package communication.module;

public interface IDatum {	
	public IDatumType GetType();
	public boolean SetData(Object newData);
	public Object GetData();
}
