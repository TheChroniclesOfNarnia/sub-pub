package com.micro.model;

import java.util.List;

/**
 * Базовый бин для команд
 */
public class Command {
    private String name;
    private List<String> requiredParams;

    public Command() {
    }

    public Command(String name, List<String> requiredParams) {
        this.name = name;
        this.requiredParams = requiredParams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRequiredParams() {
        return requiredParams;
    }

    public void setRequiredParams(List<String> requiredParams) {
        this.requiredParams = requiredParams;
    }
}
