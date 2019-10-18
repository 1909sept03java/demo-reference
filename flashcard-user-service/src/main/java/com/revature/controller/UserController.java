package com.revature.controller;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private UserRepository userRepository;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<User>> getAllUsers() {
		// this.rabbitTemplate.convertAndSend("flashcardAppQueue", "all users retrieved");
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<String> deleteUser(@RequestBody User user) {
		String response = "deleted user with id " + user.getId();
		try {
			this.userRepository.delete(user);
			this.rabbitTemplate.convertAndSend("deleteUserQueue", user);
		} catch (Exception e) {
			response = "failed to delete user";
			e.printStackTrace();
		}
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
