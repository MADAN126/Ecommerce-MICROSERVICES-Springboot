package com.UserService.main.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserService.main.DTO.UserDTO;
import com.UserService.main.Entitylayer.UserEntity;
import com.UserService.main.RepositoryLayer.RepositoryLayer;

@Service
public class ServiceLayer {

	@Autowired
	RepositoryLayer repo;

	public String createUser(UserEntity userentity) {
		repo.save(userentity);
		return "saved succesfully";
	}

	public String findByID(String emailId) {
		if (repo.findById(emailId).isPresent()) {
			return "found";
		} else {
			return "not found";
		}
	}
}
