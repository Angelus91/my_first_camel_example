package cameltest.Camel1;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public class Message {

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/responsetest")
	public Response Mesg(String input) {
		// input.setVal2(input.getVal1());
		return Response.ok().entity(input).build();
	}
}
