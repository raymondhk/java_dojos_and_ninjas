package com.project.DojosAndNinjas.repositories;

import com.project.DojosAndNinjas.models.Dojo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface DojoRepository extends CrudRepository<Dojo,Long>{
	// Query methods go here.
	List<Dojo> findAll();
	// Example:
	// public YourModelHere findByName(String name);
}
