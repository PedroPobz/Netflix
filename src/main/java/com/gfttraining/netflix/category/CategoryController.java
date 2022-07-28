package com.gfttraining.netflix.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@GetMapping

	public ResponseEntity<List<Category>> showAll() {

		List<Category> list = categoryService.getAll();

		return list.size() == 0 
				? ResponseEntity.noContent().build() 
				: ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> showOne(@PathVariable int id) {

		Category item = categoryService.getOne(id);

		return item == null 
				? ResponseEntity.notFound().build() 
				: ResponseEntity.ok().body(item);
	}

	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category item) {
		return ResponseEntity.ok().body(categoryService.save(item));
	}

	@PutMapping
	public ResponseEntity<Category> edit(@RequestBody Category item) {
		return ResponseEntity.ok().body(categoryService.save(item));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable int id) {
		categoryService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}