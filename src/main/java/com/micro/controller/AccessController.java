package com.micro.controller;

import io.micronaut.http.annotation.Controller;

import java.util.concurrent.CompletableFuture;

/**
 Rest контроллер
 */
@Controller
public class AccessController {

    public String addCommand() {
        return "OK";
    }
}
