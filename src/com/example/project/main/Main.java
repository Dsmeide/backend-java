package com.example.project.main;

import com.example.project.core.IUserRepo;
import com.example.project.core.IUserService;
import com.example.project.repos.UserRepo;
import com.example.project.services.UserService;

class Main {
	public static void main(String[] args) {
		IUserRepo userRepo = new UserRepo();
		IUserService userService = new UserService(userRepo);
		System.out.println("Hello World!"); // Display the string.
	}
}