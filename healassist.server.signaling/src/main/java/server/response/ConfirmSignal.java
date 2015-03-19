package server.response;

import server.signaling.ISignal;

//Simple true/false signal
public class ConfirmSignal implements ISignal{
	public Object read(){
		return this.sigVal;
	}	
	public Boolean set(Object newSigVal){
		try{
			if(newSigVal instanceof Boolean){
				this.sigVal = (Boolean)newSigVal;
				return true;
			}else{
				return false;
			}			
		}catch(Exception ConfirmSignal_setSignal){
			System.out.println(ConfirmSignal_setSignal);	
			return null;
		}		
	}
	
	private Boolean sigVal;
}
