package com.example.project.repos;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import com.example.project.core.IUserRepo;
import com.example.project.models.UserModel;

public class UserRepo implements IUserRepo {
	private static HashMap<UUID, UserModel> users;

	public UserRepo() {
		users = new HashMap<>();
	}

	@Override
	public Collection<UserModel> getAllUsers() {
		return users.values();
	}

}
