package com.gfttraining.netflix.title;

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
@RequestMapping("/api/title")
public class TitleController {

	@Autowired
	TitleService titleService;

	@GetMapping

	public ResponseEntity<List<Title>> showAll() {

		List<Title> list = titleService.getAll();

		return list.size() == 0 
				? ResponseEntity.noContent().build() 
				: ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Title> showOne(@PathVariable int id) {

		Title item = titleService.getOne(id);

		return item == null 
				? ResponseEntity.notFound().build() 
				: ResponseEntity.ok().body(item);
	}

	@PostMapping
	public ResponseEntity<Title> save(@RequestBody Title item) {
		return ResponseEntity.ok().body(titleService.save(item));
	}

	@PutMapping
	public ResponseEntity<Title> edit(@RequestBody Title item) {
		return ResponseEntity.ok().body(titleService.save(item));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable int id) {
		titleService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}