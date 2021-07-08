package com.micro.repository;

import com.micro.model.Command;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class CommandRepository {
    // репозиторий для начала просто в виде списка команд
    private List<Command> commands = new ArrayList<>();

    public Command add(Command command) {
        commands.add(command);
        return command;
    }

    public List findAll() {
        return commands;
    }
}
