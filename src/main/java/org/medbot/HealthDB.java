package org.medbot;

import java.net.UnknownHostException;

import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.util.Date;
import java.util.HashMap;

import com.mongodb.BasicDBObject;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

@RequestScoped
@Path("/db")
public class HealthDB {
//	private Mongo mongo;
//	private DB mongoDB;

//	public HealthDB() {
//		String username = System.getenv("MONGODB_USER");
//		String password = System.getenv("MONGODB_PASSWORD");
//		String dbName = System.getenv("MONGODB_DATABASE");
//		String host = "mongodb";//System.getenv("MONGODB_HOST");
//		String port_string = "27017";//System.getenv("MONGODB_PORT");
//		int port = Integer.decode(port_string);
//
//		try {
//			mongo = new Mongo(host, port);
//		} catch (UnknownHostException e) {
//			//mongo = null;
//			//System.out.println("unknown host exception");
//		}
//
//		mongoDB = mongo.getDB(dbName);
//
//		if (mongoDB.authenticate(username, password.toCharArray()) == false) {
//			//System.out.println("Couldn't authenticate MongoDB");
//		} else {
//			//System.out.println("Successfully accessed DB!");
//		}
//	}
	
	@GET()
	@Produces("application/json")
	public HashMap<String, String> getDB()
	{
		Mongo mongo;
		DB mongoDB;
		String username = System.getenv("MONGODB_USER");
		String password = System.getenv("MONGODB_PASSWORD");
		String dbName = System.getenv("MONGODB_DATABASE");
		String host = "mongodb";//System.getenv("MONGODB_HOST");
		String port_string = "27017";//System.getenv("MONGODB_PORT");
		int port = 27017;
		
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("username", username);
		result.put("password", password);
		result.put("database", dbName);
		
		try {
		mongo = new Mongo(host, port);
	} catch (UnknownHostException e) {
		
		mongo = null;
		//System.out.println("unknown host exception");
		result.put("unkown host", "failed");
	}
		
		mongoDB = mongo.getDB(dbName);

		if (mongoDB.authenticate(username, password.toCharArray()) == false) {
			result.put("failed!", ":(");
		} else {
			result.put("win!", ":)");
		}
		
		return result;
	}
	
	

}