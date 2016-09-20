package org.medbot;

import java.net.UnknownHostException;
import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.mongodb.BasicDBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientURI;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;

@RequestScoped
@Path("/")
public class HealthDB {
	private MongoClient mongo;
	private MongoDatabase mongoDB;

	public void openDBSession(){
		String username = System.getenv("MONGODB_USER");
		String password = System.getenv("MONGODB_PASSWORD");
		String dbName = System.getenv("MONGODB_DATABASE");

		String uriString = "mongodb://" + username + ":" + password + "@mongodb/" + dbName;
		mongo = new MongoClient(new MongoClientURI(uriString));
		mongoDB = mongo.getDatabase(dbName);
	}
	

	@GET()
	@Produces("application/json")
	public HashMap<String, String> getDB() {
		HashMap<String, String> result = new HashMap<String, String>();
		mongo.close();
		return result;
	}
	
	/**
	 * Gets the given disease's information -- definition, symptoms, causes, side effects, etc.
	 *
	 * @param condition -- the disease name
	 * @return a JSON tree with the info
	 */
	@GET()
	@Path("/disease/{condition}")
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
	@Path("/disease/definition/{condition}")
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
	@Path("/disease/symptoms/{condition}")
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
	@Path("/disease/cause/{condition}")
	@Produces("application/json")
	public HashMap<String, String> getCause(@PathParam("condition") String condition)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}
	
	/**
	 * Gets the drug info.
	 *
	 * @param drugName the drug name
	 * @return a JSON tree with the drug info
	 */
	@GET()
	@Path("/drug/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugInfo(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		return result;
	}
	
	/**
	 * Gets the drug definition.
	 *
	 * @param drugName the drug name
	 * @return the drug definition (JSON tree)
	 */
	@GET()
	@Path("/drug/definition/{drugname}")
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
	@Path("/drug/effects/{drugname}")
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
	@Path("/drug/usage/{drugname}")
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
	@Path("/drug/precautions/{drugname}")
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
	@Path("/drug/storage/{drugname}")
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
	@Path("/drug/diet/{drugname}")
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
	@Path("/drug/overdose/{drugname}")
	@Produces("application/json")
	public HashMap<String, String> getDrugOverdoseInfo(@PathParam("drugname") String drugName)
	{
		HashMap<String, String> result = new HashMap<String, String>();
		
		return result;
	}

}