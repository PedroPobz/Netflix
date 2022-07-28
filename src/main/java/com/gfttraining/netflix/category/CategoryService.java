package com.gfttraining.netflix.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService {

	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAll(){
		return categoryRepository.findAll();
	}
	
	public Category getOne(int id){
		return categoryRepository.findById(id).orElse(null);
	}
	
	public Category save(Category newCategory){
		Category actor = categoryRepository.save(newCategory);
		return newCategory;
	}
	
	public void deleteById(int id){
		categoryRepository.deleteById(id);
	}
	
	
	
}
