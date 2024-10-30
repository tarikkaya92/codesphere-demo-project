package com.cloudswift.app;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.apache.camel.ProducerTemplate;

@Path("/hello")
public class HelloWorldResource {
    @Inject
    ProducerTemplate producerTemplate;

    @GET
    public Response getHelloMessage() {
        String result = producerTemplate.requestBody("direct:hello", null, String.class);
        return Response.ok(result).build();
    }
}
