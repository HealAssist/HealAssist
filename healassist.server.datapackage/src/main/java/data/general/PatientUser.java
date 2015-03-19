package data.general;

import java.util.LinkedList;
import router.IRouter;

public class PatientUser implements IUser {
	private IIdentification id;	
	
	public Boolean setId(Object newId){
		try{
			if(newId instanceof PatientID){
				this.id = (PatientID)newId;
				return true;
			}else{
				return false;
			}
		}catch(Exception PatientUser_setId){
			System.out.println(PatientUser_setId);
			return null;
		}
	}
	
}
