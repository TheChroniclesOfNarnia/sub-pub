package com.micro.listener;

import com.micro.model.Command;
import com.micro.service.CommandService;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.annotation.Body;

@KafkaListener(groupId = "workflowcommand")
public class CommandListener {

    private CommandService service;

    public CommandListener(CommandService service) {
        this.service = service;
    }

    @Topic("commands")
    public void receive(@Body Command command) {
        service.add(command);
    }
}
