package com.micro.controller;

import com.micro.client.CommandClient;
import com.micro.model.Command;
import com.micro.model.CommandResponse;
import com.micro.repository.CommandRepository;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

/**
 Rest контроллер
 */
@Controller("/commands")
public class AccessController {

    @Inject
    CommandRepository repository;
    @Inject
    CommandClient commandClient;
    @Post
    public String addCommand(@Body Command command) {
        commandClient.send(command);
        return "OK";
    }

    @Get
    public CommandResponse getResponse() {
        return repository.get();
    }

    @Get
    public List findAll() {
        return repository.findAll();
    }
}
