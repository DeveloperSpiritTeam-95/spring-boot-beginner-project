package com.springboot.beginner.service;

import com.springboot.beginner.entity.Animals;
import com.springboot.beginner.repositorie.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalsRepository repository;


    public String createAnimal(Animals animals) {
        this.repository.save(animals);
        return "Animal Created";
    }

    public List<Animals> getAllAnimals() {
        return (List<Animals>) this.repository.findAll();
    }
}
