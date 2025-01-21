package org.ejemplosclases.smga.dto;

import lombok.Data;

@Data
public class ProcessedSensorData {
    private String sensorId;
    private boolean alert;
}

