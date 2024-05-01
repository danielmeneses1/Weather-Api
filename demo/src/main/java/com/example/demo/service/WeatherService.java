package com.example.demo.service;

import com.example.demo.model.WeatherModel;
import com.example.demo.repository.IWeather;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public WeatherModel getWeatherForecastById(long id){
        WeatherModel weather = repository.findById(id).orElse(null);
        if (weather == null){
            return null;
        }
        return weather;
    }

    //post
    public WeatherModel addWeatherForecast(WeatherModel weather){
        WeatherModel newWeather = repository.save(weather);
        return newWeather;
    }


}
