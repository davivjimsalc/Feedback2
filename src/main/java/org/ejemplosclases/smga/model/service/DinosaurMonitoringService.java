package org.ejemplosclases.smga.model.service;

import org.ejemplosclases.smga.util.LoggingUtil;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class DinosaurMonitoringService {

    public Flux<Integer> getDinosaurData() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> {
                    try {
                        return (int) (Math.random() * 100);
                    } catch (Exception e) {
                        LoggingUtil.logError("Error generating dinosaur data: " + e.getMessage());
                        return 0;
                    }
                });
    }

}

