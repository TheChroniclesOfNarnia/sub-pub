package com.micro.controller;

import com.micro.model.Command;
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

    @Post
    public String addCommand(@Body Command command) {
        repository.add(command);
        return "OK";
    }

    @Get
    public List findAll() {
        return repository.findAll();
    }
}
