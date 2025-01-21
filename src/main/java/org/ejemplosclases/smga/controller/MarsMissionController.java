package org.ejemplosclases.smga.controller;

import org.ejemplosclases.smga.model.service.MarsMissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mars-mission")
public class MarsMissionController {

    private final MarsMissionService marsMissionService;

    public MarsMissionController(MarsMissionService marsMissionService) {
        this.marsMissionService = marsMissionService;
    }

    @PostMapping
    public ResponseEntity<String> processMissionBatch() {
        marsMissionService.processBatch();
        return ResponseEntity.ok("Batch processed successfully");
    }
}

