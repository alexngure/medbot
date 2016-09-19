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
	
	// TODO: Add a method to return usage info if user doesn't provide params
	
	/**
	 * Gets the given disease's information -- definition, symptoms, causes, side effects, etc.
	 *
	 * @param condition -- the disease name
	 * @return a JSON tree with the info
	 */
	@GET()
	@Path("{condition}")
	@Produces("application/json")
	public HashMap<String, String> getDisease(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the disease's definition.
	 *
	 * @param condition -- the disease name
	 * @return a JSON tree with the definition
	 */
	@GET()
	@Path("/definition/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getDefinition(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the disease's symptoms.
	 *
	 * @param condition -- the disease name
	 * @return a JSON tree with the symptoms
	 */
	@GET()
	@Path("/symptoms/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getSymptoms(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the disease's cause.
	 *
	 * @param condition -- the disease name
	 * @return a JSON tree with the cause info
	 */
	@GET()
	@Path("/cause/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getCause(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	
}