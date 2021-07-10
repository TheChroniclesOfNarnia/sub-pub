package com.micro.strategy;

import com.micro.model.Command;
import com.micro.model.CommandResponse;

public interface Strategy {
    String getStrategy();

    CommandResponse invoke(Command command);
}

