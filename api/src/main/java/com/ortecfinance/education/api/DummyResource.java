package com.ortecfinance.education.api;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/dummy")
public class DummyResource {

    @GET
    public Response get() {
        return Response.noContent().build();
    }
}
