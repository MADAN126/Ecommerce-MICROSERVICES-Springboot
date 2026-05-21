package com.UserService.main.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserService.main.Entitylayer.UserEntity;

public interface RepositoryLayer extends JpaRepository<UserEntity, String>{

}
