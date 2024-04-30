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

    public WeatherModel(){
        this.weatherTypeStatus = weatherTypeStatus.SUNNY;
        this.date = new Date();
    }
}
