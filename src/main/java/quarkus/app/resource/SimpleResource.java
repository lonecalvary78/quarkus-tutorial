package quarkus.app.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import quarkus.app.model.Salutation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class SimpleResource {
    @ConfigProperty(name = "salutation.message")
    private String salutationMessage;

    @GET
    public Salutation hello() {
        return new Salutation(salutationMessage);
    }
}
