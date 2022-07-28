package com.gfttraining.netflix.actor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ActorService {

	
	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> getAll(){
		return actorRepository.findAll();
	}
	
	public Actor getOne(int id){
		return actorRepository.findById(id).orElse(null);
	}
	
	public Actor save(Actor newActor){
		Actor actor = actorRepository.save(newActor);
		return newActor;
	}
	
	public void deleteById(int id){
		actorRepository.deleteById(id);
	}
	
	
	
}
