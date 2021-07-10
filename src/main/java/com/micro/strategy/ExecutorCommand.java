package com.micro.strategy;

import com.micro.config.ConfigurationCommand;
import com.micro.model.Command;
import com.micro.model.CommandResponse;
import com.micro.repository.CommandRepository;
import com.micro.strategy.impl.CreateStrategy;
import com.micro.strategy.impl.UpdateStrategy;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ExecutorCommand {
    ConfigurationCommand configurationCommand;
    CommandRepository commandRepository;

    public void execute(Command command) {
        String strategyName = configurationCommand.getStrategyMap().get(command.getName());
        Strategy strategy = strategies().get(strategyName);
        CommandResponse invoke = strategy.invoke(command);
        commandRepository.add(invoke);
    }

    public Map<String, Strategy> strategies(){
        HashMap<String, Strategy> strategiesMap = new HashMap<>();
        strategiesMap.put("CREATE", new CreateStrategy());
        strategiesMap.put("UPDATE", new UpdateStrategy());
        return strategiesMap;

    }
}
