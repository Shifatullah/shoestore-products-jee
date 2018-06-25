package com.shoestore.products.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public class ProductResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] searchByCategory() {
        List<String> products = new ArrayList<String>();
        products.add("iPhone X");
        products.add("Samsung 9");
        return products.toArray(new String[products.size()]);
    }
	
}
