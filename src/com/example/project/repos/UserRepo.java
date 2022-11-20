package com.example.project.repos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.IntStream;

import com.example.project.core.IUserRepo;
import com.example.project.models.Role;
import com.example.project.models.UserModel;

public class UserRepo implements IUserRepo {
	private static HashMap<Integer, UserModel> users;

	public UserRepo() {
		users = new HashMap<Integer, UserModel>();
		
		IntStream.range(0, 5).forEachOrdered(i -> {
			UserModel user = new UserModel(
				i, 
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

	@Override
	public UserModel getUserById(int id) {
		return users.get(id);
	}

}
