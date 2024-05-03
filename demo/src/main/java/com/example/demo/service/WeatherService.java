package com.example.demo.service;

import com.example.demo.model.WeatherModel;
import com.example.demo.repository.IWeather;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService {
    private IWeather repository;

    public WeatherService(IWeather repository){
        this.repository = repository;
    }

    public List<WeatherModel> filterValidWeather(List<WeatherModel> list){
        List<WeatherModel> filteredList = list.stream()
                .filter(weather -> !weather.isDelayed())
                .collect(Collectors.toList());
        return filteredList;
    }


    public void checkIsDelayed(WeatherModel weather){
            if (weather.getDate().before(new Date())){
                weather.setDelayed(true);
        }else {
            weather.setDelayed(false);
        }
    }

    //get
    public List<WeatherModel> listValidWeather(){
        List <WeatherModel> list = repository.findAll();
        for(WeatherModel weather : list){
            checkIsDelayed(weather);
        }
        List<WeatherModel> filteredList = filterValidWeather(list);
        return filteredList;
    }

    //getall
    public List<WeatherModel> listAllWeather(){
        List <WeatherModel> list = repository.findAll();
        for(WeatherModel weather : list){
            checkIsDelayed(weather);
        }
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
        checkIsDelayed(weather);
        repository.save(weather);
        return weather;
    }

    //deleteAll
    public void deleteAllWeather(){
        repository.deleteAll();
    }


}
