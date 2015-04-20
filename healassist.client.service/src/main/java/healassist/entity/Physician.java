package healassist.entity;

import java.sql.ResultSet;

import healassist.client.service.misc.GlobalConstant;
import healassist.service.response.JsonFeedbackResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import database.access.tableobject.PhysicianInfoTable;

@Path("/physician")
public class Physician {
	private static final String CLASS_NAME = "Physician";	
	private static final String GET_PHYSICIAN = "getPhysician()";
	private static final String INSERT_PHYSICIAN = "insertPhysician()";
	private static final String UPDATE_PHYSICIAN = "updatePhysician()";
	private static final String DELETE_PHYSICIAN = "deletePhysician()";
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPhysician(@QueryParam("username") String username){		
		PhysicianInfoTable physician = new PhysicianInfoTable();
		physician.addUsername(username);
		try(ResultSet results = GlobalConstant.BusinessLogic.read(physician);){
			physician.addUsername(username);			
			
			if(!results.next()){
				return JsonFeedbackResponse.failure(GlobalConstant.REFINE_NEEDED);
			}else{
				return JsonFeedbackResponse.success().append("result", results.toString()).toString();
			}						
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, GET_PHYSICIAN, "Try Failure");
		}
	}
		
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String insertPhysician(@FormParam("username") String username, 
			@FormParam("password") String password, @FormParam("firstname") String firstname,
			@FormParam("middlename") String middlename, @FormParam("lastname") String lastname, 
			@FormParam("email") String email){
		// *** This service also needs to verify that user doesn't already exist and that
		// all usernames are unique in the db	
		// *** Do walk-through to guarentee errors associated with failure are handled
		// gracefully
		PhysicianInfoTable physician = new PhysicianInfoTable();
		try{												
			physician.addUsername(username);
			physician.addPassword(password);
			physician.addFirstName(firstname);
			physician.addMiddleName(middlename);
			physician.addLastName(lastname);
			physician.addEmail(email);			
												
			if(!GlobalConstant.BusinessLogic.create(physician)){
				return JsonFeedbackResponse.failure(GlobalConstant.REFINE_NEEDED);
			}else{
				return JsonFeedbackResponse.success().toString();
			}
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, INSERT_PHYSICIAN, "Try Failure");
		}		
	}
		
	@PUT
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String updatePhysician(){
		PhysicianInfoTable physician = new PhysicianInfoTable();
		try{
			
			return GlobalConstant.NOT_YET_IMPLEMENTED;
			
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, UPDATE_PHYSICIAN, "Try Failure");
		}		
	}
	
	@DELETE
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public String deletePhysician(@QueryParam("id") String id){		
		PhysicianInfoTable physician = new PhysicianInfoTable();
		try{
			
			return GlobalConstant.NOT_YET_IMPLEMENTED;
			
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, DELETE_PHYSICIAN, "Try Failure");
		}
	}
}

