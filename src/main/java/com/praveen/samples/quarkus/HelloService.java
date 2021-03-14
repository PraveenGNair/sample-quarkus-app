package com.praveen.samples.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    @ConfigProperty(name = "greet-message")
    private String greetMessage;

    public String sayHello(String name) {
        return  greetMessage + name;
    }
}
