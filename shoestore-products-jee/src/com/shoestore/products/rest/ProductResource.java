package com.shoestore.products.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shoestore.products.domain.Product;

@Path("products")
public class ProductResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Product[] list() {
        List<Product> products = new ArrayList<Product>();
        
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("iPhone X");
        products.add(product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Samsung 9");
        products.add(product2);        
        
        return products.toArray(new Product[products.size()]);
    }
	
}
