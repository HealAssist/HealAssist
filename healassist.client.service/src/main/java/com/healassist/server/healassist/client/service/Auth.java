package com.healassist.server.healassist.client.service;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("authenticate")
public class Auth {
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public String Authenticate(@QueryParam("username") String username, 
			@QueryParam("password") String password){
		try{		
			JsonObject jo = Json.createObjectBuilder().add("success", JsonValue.TRUE).build();
			return jo.toString();
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
}