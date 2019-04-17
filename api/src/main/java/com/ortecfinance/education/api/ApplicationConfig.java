package com.ortecfinance.education.api;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public abstract class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        resources.add(DummyResource.class);

        return resources;
    }
}
