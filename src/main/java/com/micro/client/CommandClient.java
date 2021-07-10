package com.micro.client;

import com.micro.model.Command;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.annotation.Body;

@KafkaClient
public interface CommandClient {

    @Topic(value = "${kafka.topics.requestTopic}")
    void send(@Body Command command);
}
