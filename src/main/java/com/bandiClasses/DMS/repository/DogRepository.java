package com.bandiClasses.DMS.repository;

/*********
Abhilash Gadiparthi
S564188
919639195
*********/


import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
}