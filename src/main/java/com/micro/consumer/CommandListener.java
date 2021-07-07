package com.micro.consumer;

import io.micronaut.configuration.kafka.annotation.KafkaListener;

import java.util.Collection;


/**
 * Класс для описания работы консьюмера
 */
public class CommandListener {

    @KafkaListener
    public void consume(Collection<String> topics) {

    }
}
