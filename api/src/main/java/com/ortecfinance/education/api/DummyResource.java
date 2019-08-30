package com.ortecfinance.education.api;


import com.ortecfinance.education.dao.DummyDao;
import com.ortecfinance.education.dao.DummyService;
import com.ortecfinance.education.model.dummy.DummyTable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@RequestScoped
@Path("/dummy")
public class DummyResource {

    // only use the dao if you have succesfully configured JPA (the Persistence Unit)
    //@Inject
    //private DummyDao dummyDao;

    @Inject
    private DummyService dummyService;

    @GET
    public Response get() {

        if (Objects.equals("cdi-injected", dummyService.get())) {
            // only use the dao if you have succesfully configured JPA (the Persistence Unit)
            //Set<String> collect = dummyDao.getAll().stream().map(DummyTable::getDummyColumn).collect(Collectors.toSet());
            //return Response.ok(collect).build();
            return Response.ok(dummyService.get()).build();
        }

        return Response.ok("cdi-does-not-work").build();
    }
}
