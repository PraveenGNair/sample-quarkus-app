package com.praveen.samples.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloResource {

    @Inject
    HelloService helloService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello/{name}")
    public String greeting(@PathParam("name") String name) {
        return helloService.sayHello(name);
    }
}