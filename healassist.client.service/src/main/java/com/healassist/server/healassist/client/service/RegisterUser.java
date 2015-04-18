package com.healassist.server.healassist.client.service;

import healassist.service.response.JsonFeedbackResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import database.access.facade.DatabaseInterface;
import database.access.tableobject.PhysicianInfoTuple;

@Path("/register-user")
public class RegisterUser {
	@GET
	@Path("/physician")
	@Produces(MediaType.APPLICATION_JSON)
	public String registerPhysician(@QueryParam("username") String username, 
			@QueryParam("password") String password, @QueryParam("firstname") String firstname,
			@QueryParam("middlename") String middlename, @QueryParam("lastname") String lastname, 
			@QueryParam("email") String email){
		// *** This service also needs to verify that user doesn't already exist and that
		// all usernames are unique in the db	
		// *** Do walk-through to garentee errors associated with failure are handled
		// gracefully
		PhysicianInfoTuple phyInfo = new PhysicianInfoTuple();
		try{												
			phyInfo.addUsername(username);
			phyInfo.addPassword(password);
			phyInfo.addFirstName(firstname);
			phyInfo.addLastName(lastname);
			phyInfo.addEmail(email);			
									
			DatabaseInterface db = new DatabaseInterface();
			if(!(db.insert(phyInfo))){
				return JsonFeedbackResponse.failure("Data Insertion Failure");
			}else{
				return JsonFeedbackResponse.success();
			}
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error("healassist.client.service",
					"RegisterUser", "registerPhysician", "catch invoked");
		}		
	}
	
	
}