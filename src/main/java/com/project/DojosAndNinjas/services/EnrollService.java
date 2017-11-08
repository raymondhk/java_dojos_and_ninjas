package com.project.DojosAndNinjas.services;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.project.DojosAndNinjas.models.Dojo;
import com.project.DojosAndNinjas.models.Ninja;
import com.project.DojosAndNinjas.repositories.DojoRepository;
import com.project.DojosAndNinjas.repositories.NinjaRepository;

@Service
public class EnrollService {
	// Member variables / service initializations go here
	private NinjaRepository ninjaRepo;
	private DojoRepository dojoRepo;
	public EnrollService(NinjaRepository ninjaRepo, DojoRepository dojoRepo){
		this.ninjaRepo = ninjaRepo;
		this.dojoRepo = dojoRepo;
	}

	// Crud methods to act on services go here.
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	public void createDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Dojo getOneDojo(Long id) {
		return dojoRepo.findOne(id);
	}
}
