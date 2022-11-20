package com.example.project.services;

import java.util.ArrayList;
import java.util.Collection;

import com.example.project.core.IUserRepo;
import com.example.project.core.IUserService;
import com.example.project.models.Role;
import com.example.project.models.UserModel;

public class UserService implements IUserService {
	private final IUserRepo userRepo;

	public UserService(IUserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public Collection<UserModel> getAllUsers() {
		return userRepo.getAllUsers();
	}

	@Override
	public UserModel getUserById(int id) {
		if (id == 1) {
			return null;
		}
		return userRepo.getUserById(id);
	}

}
