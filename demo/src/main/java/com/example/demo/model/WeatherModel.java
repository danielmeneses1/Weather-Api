package com.example.demo.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class WeatherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Enumerated
    @Column
    private WeatherTypeStatus weatherTypeStatus;

    @Column
    private Date date;

    @Column
    private boolean isDelayed;

    public WeatherModel() {
    }

    public WeatherModel(Integer id, WeatherTypeStatus weatherTypeStatus, Date date) {
        this.id = id;
        this.weatherTypeStatus = weatherTypeStatus;
        this.date = date;
    }

    public WeatherTypeStatus getWeatherTypeStatus() {
        return weatherTypeStatus;
    }

    public void setWeatherTypeStatus(WeatherTypeStatus weatherTypeStatus) {
        this.weatherTypeStatus = weatherTypeStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }
}
