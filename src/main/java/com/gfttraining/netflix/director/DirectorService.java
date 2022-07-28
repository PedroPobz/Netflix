package com.gfttraining.netflix.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfttraining.netflix.title.Title;
import com.gfttraining.netflix.title.TitleRepository;



@Service
public class DirectorService {

	
	@Autowired
	private DirectorRepository directotRepository;
	
	public List<Director> getAll(){
		return directotRepository.findAll();
	}
	
	public Director getOne(int id){
		return directotRepository.findById(id).orElse(null);
	}
	
	public Director save(Director newDirector){
		Director director = directotRepository.save(newDirector);
		return newDirector;
	}
	
	public void deleteById(int id){
		directotRepository.deleteById(id);
	}
	
	
	
}
