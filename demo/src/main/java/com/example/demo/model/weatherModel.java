package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table
public class weatherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Enumerated
    @Column
    private weatherTypeStatus weatherTypeStatus;
}
