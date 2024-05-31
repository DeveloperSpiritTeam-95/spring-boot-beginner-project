package com.springboot.beginner.controller;

import com.springboot.beginner.entity.Animals;
import com.springboot.beginner.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @GetMapping(value = "/getAnimal/{id}")
    public Optional<Animals> getAnimal(@PathVariable Long id){
        return this.service.getAnimal(id);
    }

    @PutMapping(value = "/updateAnimal/{id}")
    public String updateAnimal(@PathVariable Long id,@RequestBody Animals animals){
        return this.service.updateAnimal(id,animals);
    }

    @DeleteMapping(value = "/deleteAnimal/{id}")
    public String deleteAnimal(@PathVariable Long id){
        return this.service.deleteAnimal(id);
    }
}
