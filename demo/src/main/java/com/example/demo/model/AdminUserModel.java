package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table
public class AdminUserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome", length = 100, nullable = false)
    private String nome;

    @Column(name="senha", length = 100, nullable = false)
    private String senha;
}
