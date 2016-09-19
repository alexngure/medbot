package org.medbot;

import java.net.UnknownHostException;
import javax.servlet.ServletException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class HealthDB {
	private Mongo mongo;
	private DB mongoDB;

	public HealthDB() {
		String username = System.getenv("MONGODB_USER");
		String password = System.getenv("MONGODB_PASSWORD");
		String dbName = System.getenv("MONGODB_DATABASE");
		String host = System.getenv("MONGODB_HOST");
		String port_string = System.getenv("MONGODB_PORT");
		int port = Integer.decode(port_string);

		try {
			mongo = new Mongo(host, port);
		} catch (UnknownHostException e) {
			//mongo = null;
			//System.out.println("unknown host exception");
		}

		mongoDB = mongo.getDB(dbName);

		if (mongoDB.authenticate(username, password.toCharArray()) == false) {
			//System.out.println("Couldn't authenticate MongoDB");
		} else {
			//System.out.println("Successfully accessed DB!");
		}
	}

}