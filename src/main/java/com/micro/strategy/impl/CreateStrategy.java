package com.micro.strategy.impl;

import com.micro.model.Command;
import com.micro.model.CommandResponse;
import com.micro.strategy.Strategy;

import javax.inject.Singleton;

@Singleton
public class CreateStrategy implements Strategy {
    @Override
    public String getStrategy() {
        return "CreateStrategy";
    }

    @Override
    public CommandResponse invoke(Command command) {
        return null;
    }
}
