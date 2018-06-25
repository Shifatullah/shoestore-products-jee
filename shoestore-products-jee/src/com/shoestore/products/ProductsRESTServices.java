package com.shoestore.products;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api/v1")
public class ProductsRESTServices extends ResourceConfig {
    public ProductsRESTServices() {
        packages("com.fasterxml.jackson.jaxrs.json");
        packages("com.shoestore.products.rest");
    }
}