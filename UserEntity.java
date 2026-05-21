package com.UserService.main.Entitylayer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

public class UserEntity {
	@Id
	private String emailId;
	private String password;
	private String fullName;

}
