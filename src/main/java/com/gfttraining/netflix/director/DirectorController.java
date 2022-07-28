package com.gfttraining.netflix.director;

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
@RequestMapping("/api/director")
public class DirectorController {

	@Autowired
	DirectorService directorService;

	@GetMapping

	public ResponseEntity<List<Director>> showAll() {

		List<Director> list = directorService.getAll();

		return list.size() == 0 
				? ResponseEntity.noContent().build() 
				: ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Director> showOne(@PathVariable int id) {

		Director item = directorService.getOne(id);

		return item == null 
				? ResponseEntity.notFound().build() 
				: ResponseEntity.ok().body(item);
	}

	@PostMapping
	public ResponseEntity<Director> save(@RequestBody Director item) {
		return ResponseEntity.ok().body(directorService.save(item));
	}

	@PutMapping
	public ResponseEntity<Director> edit(@RequestBody Director item) {
		return ResponseEntity.ok().body(directorService.save(item));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable int id) {
		directorService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}