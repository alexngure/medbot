package org.medbot;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/disease")
public class DiseaseResource {
	@GET()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("definition",
				"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit");
		return result;
	}
	
	@GET()
	@Path("{condition}")
	@Produces("application/json")
	public HashMap<String, String> getDisease(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	@GET()
	@Path("/definition/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getDefinition(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	@GET()
	@Path("/symptoms/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getSymptoms(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	@GET()
	@Path("/cause/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getCause(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	
}