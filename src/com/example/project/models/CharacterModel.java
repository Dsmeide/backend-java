package com.example.project.models;

public class CharacterModel {
	private long id;
	private String firstName;
	private String lastName;
	private CharacterClass characterClass;
	// TODO: Add race

	public CharacterModel(long id, String firstName, String lastName, CharacterClass characterClass) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.characterClass = characterClass;
		// TODO: take race as a parameter and set it
	}
	
	public long getId() {
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

	public CharacterClass getCharacterClass() {
		return characterClass;
	}
	
	// TODO: Allow getting Race
	
	// TODO: Update method to print race
	public String toString() {
		return String.format("{Id: %s, FirstName: %s, LastName: %s, Class: %s}", 
				id, firstName, lastName, characterClass);
	}
}
