package com.springboot.beginner.service;

import com.springboot.beginner.entity.Animals;
import com.springboot.beginner.repositorie.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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

    public Optional<Animals> getAnimal(Long id) {
        return this.repository.findById(id);
    }

    public String updateAnimal(Long id, Animals animals) {
        Optional<Animals> animal = this.repository.findById(id);
        if (animal.isPresent()){
            animal.get().setName(animals.getName());
            animal.get().setAge(animals.getAge());
            animal.get().setBread(animals.getBread());
            animal.get().setPrice(animals.getPrice());
            this.repository.save(animal.get());
            return "Animal updated";
        }
        return "Animal Id Not Found";
    }

    public String deleteAnimal(Long id) {
        if (this.repository.findById(id).isPresent()){
            this.repository.deleteById(id);
            return "deleted";
        }
        return "Animal Id Not Found";
    }


}
