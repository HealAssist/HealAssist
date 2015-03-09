package communication.module;

//Represents a group of classes that will be used to
//bind incoming data to
public interface IDataBinder {
	public IDatum BindData(Object data);
}
