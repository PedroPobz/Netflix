package com.gfttraining.netflix.title;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TitleService {

	
	@Autowired
	private TitleRepository titleRepository;
	
	public List<Title> getAll(){
		return titleRepository.findAll();
	}
	
	public Title getOne(int id){
		return titleRepository.findById(id).orElse(null);
	}
	
	public Title save(Title newTitle){
		Title title = titleRepository.save(newTitle);
		return newTitle;
	}
	
	public void deleteById(int id){
		titleRepository.deleteById(id);
	}
	
	
	
}
