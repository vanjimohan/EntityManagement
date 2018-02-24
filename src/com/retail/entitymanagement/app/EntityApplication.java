package com.retail.entitymanagement.app;

import org.glassfish.jersey.server.ResourceConfig;

public class EntityApplication extends ResourceConfig {
    public EntityApplication() {
        // Define the package which contains the service classes.
        packages("com.retail.entitymanagement.services");
    }
}