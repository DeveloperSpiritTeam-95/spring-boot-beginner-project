package com.springboot.beginner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Animals {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(length=4)
    private Long id;
    @Column(length=14)
    private String name;
    @Column(length=4)
    private int age;
    @Column(length=20)
    private String bread;
    @Column(length=10)
    private double price;
}
