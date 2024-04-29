package com.example.demo.model;

public enum weatherTypeStatus {
    SUNNY("sunny"),
    CLOUDY("cloudy"),
    LIGHTRAIN("lightrain"),
    STORM("storm");

    private final String weatherType;

    weatherTypeStatus(String weatherType) {
        this.weatherType = weatherType;
    }
    public String getWeatherType(){
        return weatherType;
    }
}
