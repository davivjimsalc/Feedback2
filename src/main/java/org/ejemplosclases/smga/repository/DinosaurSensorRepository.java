package org.ejemplosclases.smga.repository;

import org.ejemplosclases.smga.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinosaurSensorRepository extends JpaRepository<SensorData, String> {}


