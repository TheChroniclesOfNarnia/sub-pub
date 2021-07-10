package com.micro.config;


import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;

import java.util.Map;

@Getter
@ConfigurationProperties("commands.type")
public class ConfigurationCommand {
    public Map<String, String> strategyMap;
}
