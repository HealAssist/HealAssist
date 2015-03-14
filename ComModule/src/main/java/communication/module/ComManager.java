package communication.module;

public class ComManager implements ICommunicationModule {
	public static void main(String[] args){
		
		//***Straight forward implementation. This will change later
		
		//***Instatiate necessary objects using factory pattern (no switch statements, etc)
		IRouter router = new EMRSimRouter();
		
		//Initialize data collection process
		
		
		//Collect desired data
		
		//Package received data in data package
		
		//Return data package
		
		//***Print contents of the data package for verification
		
	}
	
	public ComManager(){
		
	}
	
	
}
