package com.example.project.models;

import java.util.List;
import java.util.UUID;

public class UserModel {

	private UUID id;
	private String firstName;
	private String lastName;
	private List<Role> roles;

	public UserModel(UUID id, String firstName, String lastName, List<Role> roles) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}
	
	public UUID getId() {
		return id;
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
	
	public String toString() {
		return String.format("{Id:%s, FirstName:%s, LastName:%s, Roles:%s}", id, firstName, lastName, roles);
	}
}
