package org.ejemplosclases.smga.dto;

import lombok.Data;

@Data
public class DinosaurSensorData {
    private String sensorId;
    private int temperature;
    private int motionLevel;
}

