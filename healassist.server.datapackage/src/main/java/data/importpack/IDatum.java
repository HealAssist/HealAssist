package data.importpack;

import data.datatype.IDatumType;

public interface IDatum {	
	public IDatumType GetType();
	public boolean SetData(Object newData);
	public Object GetData();
}
