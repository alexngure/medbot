package org.medbot;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@RequestScoped
@Path("/drug")
public class DrugResource{
	
	/**
	 * Gets the drug info.
	 *
	 * @param drugName the drug name
	 * @return a JSON tree with the drug info
	 */
	@GET()
	@Path("{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugInfo(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("test", "test"); // TODO: remove test 
		return result;
	}
	
	/**
	 * Gets the drug definition.
	 *
	 * @param drugName the drug name
	 * @return the drug definition (JSON tree)
	 */
	@GET()
	@Path("/definition/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugDefinition(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug side effects.
	 *
	 * @param drugName the drug name
	 * @return the drug side effects (JSON tree)
	 */
	@GET()
	@Path("/effects/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugSideEffects(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug usage.
	 *
	 * @param drugName the drug name
	 * @return the drug usage (JSON tree)
	 */
	@GET()
	@Path("/usage/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugUsage(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug precautions.
	 *
	 * @param drugName the drug name
	 * @return the drug precautions (JSON tree)
	 */
	@GET()
	@Path("/precautions/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugPrecautions(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug storage.
	 *
	 * @param drugName the drug name
	 * @return the drug storage instructions (JSON tree)
	 */
	@GET()
	@Path("/storage/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugStorage(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug's dietary restrictions.
	 *
	 * @param drugName the drug name
	 * @return the drug's associated dietary info (JSON tree)
	 */
	@GET()
	@Path("/diet/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugDiet(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug overdose info.
	 *
	 * @param drugName the drug name
	 * @return the drug overdose warnings
	 */
	@GET()
	@Path("/overdose/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugOverdoseInfo(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
}