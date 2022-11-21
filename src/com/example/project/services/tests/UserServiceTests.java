package com.example.project.services.tests;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.project.core.IUserRepo;
import com.example.project.models.Role;
import com.example.project.models.UserModel;
import com.example.project.services.UserService;


class UserServiceTests {
	//Class to be tested
	private UserService userService;

	//Dependencies
	private IUserRepo userRepoMock;


	@BeforeEach
	public void setup(){
		userRepoMock = mock(IUserRepo.class);
		userService = new UserService(userRepoMock);
	}
	
	@Test
	void UserService_GetAllUsers_ReturnsAllUsers() {
		ArrayList<UserModel> users = new ArrayList<UserModel>() {
			private static final long serialVersionUID = 1L;

			{
				add(new UserModel(anyInt(), anyString(), anyString(), anyList()));
			}
		};
		when(userRepoMock.getAllUsers()).thenReturn(users);
		
		Collection<UserModel> results = userService.getAllUsers();
		
		assertArrayEquals(users.toArray(), results.toArray());
	}
	
	@Test
	void UserService_GetUserById_Id_1_ReturnsNull() {
		UserModel expected = new UserModel(1, "First", "Last", new ArrayList<Role>());
		
		when(userRepoMock.getUserById(1)).thenReturn(expected);
		
		UserModel result = userService.getUserById(1);
		
		assertNull("It should be null", result);
	}
	
	@Test
	void UserService_GetUserById_Id_2_ReturnsGivenUser() {
		UserModel expected = new UserModel(2, "First", "Last", new ArrayList<Role>());
		
		when(userRepoMock.getUserById(2)).thenReturn(expected);
		
		UserModel result = userService.getUserById(2);
		
		assertEquals(2, result.getId(), "Id didn't match");
	}

}
