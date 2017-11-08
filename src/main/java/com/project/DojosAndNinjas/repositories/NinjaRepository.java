package com.project.DojosAndNinjas.repositories;

import com.project.DojosAndNinjas.models.Ninja;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface NinjaRepository extends CrudRepository<Ninja,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
