package com.gfttraining.netflix.actor;

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
@RequestMapping("/api/actor")
public class ActorController {

	@Autowired
	ActorService actorService;

	@GetMapping

	public ResponseEntity<List<Actor>> showAll() {

		List<Actor> list = actorService.getAll();

		return list.size() == 0 
				? ResponseEntity.noContent().build() 
				: ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Actor> showOne(@PathVariable int id) {

		Actor item = actorService.getOne(id);

		return item == null 
				? ResponseEntity.notFound().build() 
				: ResponseEntity.ok().body(item);
	}

	@PostMapping
	public ResponseEntity<Actor> save(@RequestBody Actor item) {
		return ResponseEntity.ok().body(actorService.save(item));
	}

	@PutMapping
	public ResponseEntity<Actor> edit(@RequestBody Actor item) {
		return ResponseEntity.ok().body(actorService.save(item));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable int id) {
		actorService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}