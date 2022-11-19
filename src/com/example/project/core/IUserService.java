package com.example.project.core;

import java.util.Collection;

import com.example.project.models.UserModel;

public interface IUserService {
	Collection<UserModel> getAllUsers();
}
