package com.joaoaprendendojava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaoaprendendojava.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Stephanie", "StephanieGostosapereiraamoJoao@gmail.com","9999999", "12345");
		return ResponseEntity.ok().body(u);
		
		
	}
}
