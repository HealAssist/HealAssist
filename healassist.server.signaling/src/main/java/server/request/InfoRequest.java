package server.request;
import server.signaling.ISignal;

//Request object passed from information management component
//into the communication module
public class InfoRequest implements ISignal{
	public Object read() {
		return null;
	}

	public Boolean set(Object newSigVal) {
		try{
			if(){
				return true;
			}else{
				return false;
			}
		}catch(Exception InfoRequest_set){
			System.out.println(InfoRequest_set);
			return null;
		}
	}

}
