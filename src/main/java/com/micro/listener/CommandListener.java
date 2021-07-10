package com.micro.listener;

import com.micro.model.Command;
import com.micro.service.CommandService;
import com.micro.strategy.ExecutorCommand;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.annotation.Body;

import java.util.concurrent.Executor;

@KafkaListener(groupId = "workflowcommand", clientId = "")
public class CommandListener {

    private CommandService service;
    private ExecutorCommand executorCommand;

    public CommandListener(CommandService service) {
        this.service = service;
    }

    @Topic(value = "${kafka.topics.requestTopic}")
    public void receive(@Body Command command) {
        executorCommand.execute(command);
    }

}
