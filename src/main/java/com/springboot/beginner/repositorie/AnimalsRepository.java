package com.springboot.beginner.repositorie;

import com.springboot.beginner.entity.Animals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends CrudRepository<Animals,Long> {

}
