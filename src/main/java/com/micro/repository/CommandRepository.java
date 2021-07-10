package com.micro.repository;

import com.micro.model.Command;
import com.micro.model.CommandResponse;
import lombok.Getter;

import javax.inject.Singleton;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Getter
@Singleton
public class CommandRepository {
    // репозиторий для начала просто в виде списка команд
    private List<Command> commands = new ArrayList<>();
    private ArrayDeque<CommandResponse> commandResponses = new ArrayDeque<>();

    public CommandResponse add(CommandResponse command) {
        commandResponses.add(command);
        return command;
    }

    public CommandResponse get() {
        try{
            CommandResponse last = commandResponses.getLast();
            return last;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Not found elements in deque");
        }
    }

    public List findAll() {
        return commands;
    }
}
