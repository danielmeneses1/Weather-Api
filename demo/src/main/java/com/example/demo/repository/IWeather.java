package com.example.demo.repository;

import com.example.demo.model.WeatherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWeather extends JpaRepository<WeatherModel, Long> {}
