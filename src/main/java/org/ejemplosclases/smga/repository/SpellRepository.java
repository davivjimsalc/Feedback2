package org.ejemplosclases.smga.repository;

import org.ejemplosclases.smga.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellRepository extends JpaRepository<Spell, Long> {}


