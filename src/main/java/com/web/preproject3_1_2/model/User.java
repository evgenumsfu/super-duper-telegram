package com.web.preproject3_1_2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name ="usersboot")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "age")
    private int age;
}

