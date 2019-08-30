package com.ortecfinance.education.api;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        resources.add(DummyResource.class);

        return resources;
    }
}
