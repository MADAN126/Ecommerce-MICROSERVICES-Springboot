package com.UserService.main.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserService.main.DTO.UserDTO;
import com.UserService.main.Entitylayer.UserEntity;
import com.UserService.main.ServiceLayer.ServiceLayer;

@RestController
public class ControllerLayer {

	@Autowired
	ServiceLayer service;
	
	@PostMapping("/create")
	public String createUser(@RequestBody UserEntity user) {
		return service.createUser(user); 
	}
	
	@GetMapping("/{emailId}")
	public String getUserInfo(@PathVariable	String emailId) {
		return service.findByID(emailId);
	}
}
