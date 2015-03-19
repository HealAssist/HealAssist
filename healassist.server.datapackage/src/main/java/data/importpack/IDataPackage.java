package data.importpack;

public interface IDataPackage {
	//Store data item in data package
	// IN: Data object.
	//OUT: True = Storage successful, False = storage unsuccessful
	public boolean StoreData();
	public IDatum GetData();
}
