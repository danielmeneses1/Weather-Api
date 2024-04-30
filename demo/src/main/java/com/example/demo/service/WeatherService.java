package com.example.demo.service;

import com.example.demo.model.WeatherModel;
import com.example.demo.repository.IWeather;

import java.util.List;

public class WeatherService {
    private IWeather repository;

    public WeatherService(IWeather repository){
        this.repository = repository;
    }

    //get
    public List<WeatherModel> listWeather(){
        List <WeatherModel> list = repository.findAll();
        return list;
    }

    //post
    public WeatherModel addWeatherForecast(WeatherModel weather){
        WeatherModel newWeather = repository.save(weather);
        return newWeather;
    }

}
