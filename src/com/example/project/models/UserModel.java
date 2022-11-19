package com.example.project.models;

import java.util.List;

public class UserModel {

	private String firstName;
	private String lastName;
	private List<Role> roles;

	public UserModel(String firstName, String lastName, List<Role> roles) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
