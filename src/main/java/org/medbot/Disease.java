package org.medbot;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/disease")
public class Disease {
	@GET()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("definition",
				"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit");
		return result;

	}
}