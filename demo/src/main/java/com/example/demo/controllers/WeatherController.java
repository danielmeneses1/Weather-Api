package com.example.demo.controllers;

import com.example.demo.model.WeatherModel;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;


    @GetMapping("/get")
    public ResponseEntity<List<WeatherModel>> getWeather(){
        return ResponseEntity.ok(weatherService.listValidWeather());
    }
    @GetMapping("/getall")
    public ResponseEntity<List<WeatherModel>> getAllWeather(){
        return ResponseEntity.ok(weatherService.listAllWeather());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<WeatherModel> getWeatherById(@PathVariable long id){
        WeatherModel weather = weatherService.getWeatherForecastById(id);
        if(weather == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(weather);
    }

    @PostMapping("/add")
    public ResponseEntity<WeatherModel> addWeather(@RequestBody WeatherModel weather){
        return ResponseEntity.ok(weatherService.addWeatherForecast(weather));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteWeather(@PathVariable long id){
        if(weatherService.deleteEspecifcWeather(id) == true){
            return ResponseEntity.ok("Weather "+ id + "deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
