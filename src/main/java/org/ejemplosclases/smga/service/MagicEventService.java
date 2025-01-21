package org.ejemplosclases.smga.service;

import org.springframework.stereotype.Service;

@Service
public class MagicEventService {

    public String castSpell(String spellName) {
        return "Casting spell: " + spellName;
    }
}

