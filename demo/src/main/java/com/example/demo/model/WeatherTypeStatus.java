package com.example.demo.model;

public enum WeatherTypeStatus {
    SUNNY("sunny"),
    CLOUDY("cloudy"),
    LIGHTRAIN("lightrain"),
    STORM("storm");

    private final String weatherType;

    WeatherTypeStatus(String weatherType) {
        this.weatherType = weatherType;
    }
    public String getWeatherType(){
        return weatherType;
    }
}
