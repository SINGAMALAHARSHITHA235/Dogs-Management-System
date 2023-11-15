/**
 * 
 */
package com.singamalaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.singamalaClasses.DMS.Models.Dog;

/**
 * author Harshitha Singamala
 */
public interface DogRepository extends CrudRepository<Dog , Integer> {
  
	List<Dog> findByName(String name);
}
