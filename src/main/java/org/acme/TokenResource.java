package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.Domain.Token;
import org.acme.service.TokenManagementServices;

import java.util.List;

@Path("/")
public class GreetingResource {
TokenManagementServices tokenManagementServices = new TokenManagementServices();
    @Path("/token/generate")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Token> getTokenSet(Token token) {
        return tokenManagementServices.generateTokens(token);
    }
}
