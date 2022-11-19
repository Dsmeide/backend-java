package com.example.project.repos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.stream.IntStream;

import com.example.project.core.IUserRepo;
import com.example.project.models.Role;
import com.example.project.models.UserModel;

public class UserRepo implements IUserRepo {
	private static HashMap<UUID, UserModel> users;

	public UserRepo() {
		users = new HashMap<>();
		
		IntStream.range(0, 5).forEachOrdered(i -> {
			UserModel user = new UserModel(
				UUID.randomUUID(), 
				"FirstName" + i, 
				"LastName" + i,
				new ArrayList<Role>() {
		            private static final long serialVersionUID = 1L;
		            private Role role = i % 2 == 0 ? Role.Admin : Role.Guest;
					{
		                add(role);
		            }
				}
			);
			users.put(user.getId(), user);
		});
		
	}

	@Override
	public Collection<UserModel> getAllUsers() {
		return users.values();
	}

}
