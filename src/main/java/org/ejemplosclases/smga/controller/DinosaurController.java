package org.ejemplosclases.smga.controller;

import org.ejemplosclases.smga.model.service.DinosaurMonitoringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/dinosaur-data")
public class DinosaurController {

    private final DinosaurMonitoringService dinosaurMonitoringService;

    public DinosaurController(DinosaurMonitoringService dinosaurMonitoringService) {
        this.dinosaurMonitoringService = dinosaurMonitoringService;
    }

    @GetMapping
    public Flux<Integer> getDinosaurData() {
        return dinosaurMonitoringService.getDinosaurData();
    }
}

