package org.ejemplosclases.smga.model;

import lombok.Data;

@Data
public class SensorData {
    private String sensorId;
    private int temperature;
    private int motionLevel;

    public SensorData() {
    }

    public SensorData(String sensorId, int temperature, int motionLevel) {
        this.sensorId = sensorId;
        this.temperature = temperature;
        this.motionLevel = motionLevel;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMotionLevel() {
        return motionLevel;
    }

    public void setMotionLevel(int motionLevel) {
        this.motionLevel = motionLevel;
    }
}

