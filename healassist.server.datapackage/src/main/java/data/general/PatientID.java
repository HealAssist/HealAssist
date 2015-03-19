package data.general;

public class PatientID implements IIdentification {
	private int id;

	public Object getId() {
		return this.id;
	}
	public Boolean setId(Object newId) {
		try{
			if(newId instanceof Integer){
				this.id = (Integer)newId;
				return true;
			}else{
				return false;
			}
		}catch(Exception ID_setID){
			System.out.println(ID_setID);
			return null;
		}		
	}
}
