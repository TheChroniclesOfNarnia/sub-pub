package com.micro.service;

import com.micro.model.Command;
import com.micro.repository.CommandRepository;

import javax.inject.Singleton;

@Singleton
public class CommandService {

    private CommandRepository repository;

    public CommandService(CommandRepository repository) {
        this.repository = repository;
    }

    public void add(Command command) {
        repository.add(command);
    }
}
