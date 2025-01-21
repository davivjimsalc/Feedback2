package org.ejemplosclases.smga.controller;

import org.ejemplosclases.smga.service.MagicEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magic-events")
public class MagicEventController {

    private final MagicEventService magicEventService;

    public MagicEventController(MagicEventService magicEventService) {
        this.magicEventService = magicEventService;
    }

    @GetMapping("/cast/{spell}")
    public ResponseEntity<String> castSpell(@PathVariable String spell) {
        return ResponseEntity.ok(magicEventService.castSpell(spell));
    }
}

