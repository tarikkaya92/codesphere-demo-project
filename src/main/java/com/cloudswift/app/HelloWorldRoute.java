package com.cloudswift.app;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class HelloWorldRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:hello")
                .setBody(constant("{\"message\": \"Hello, Worldd!\"}"))
                .setHeader("Content-Type", constant("application/json"));
    }
}
