package com.springboot.beginner.controller;

import com.springboot.beginner.entity.Animals;
import com.springboot.beginner.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/animals")
public class AnimalsController {

    @Autowired
    private AnimalService service;

    @PostMapping(value = "/createAnimal")
    public String createAnimal(@RequestBody Animals animals){
        return this.service.createAnimal(animals);
    }

    @GetMapping(value = "/getAllAnimals")
    public List<Animals> getAllAnimals(){
        return this.service.getAllAnimals();
    }

}
