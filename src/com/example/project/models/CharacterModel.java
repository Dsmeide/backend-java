package com.example.project.models;

import com.example.project.core.ICharacterClass;
import com.example.project.core.ICharacterRace;
import com.example.project.core.ICharacterStats;

// Race
// Class
// Character
//   Race
//   Class
// Main
// character.attack = Character.attack { return race.attack + class.attack + char.stats }

public class CharacterModel implements ICharacterStats {
	private long id;
	private String firstName;
	private String lastName;
	private long strength;
	private ICharacterClass characterClass;
	private ICharacterRace characterRace;

	public CharacterModel(long id, String firstName, String lastName, long strength, ICharacterClass characterClass, ICharacterRace characterRace) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.strength = strength;
		this.characterClass = characterClass;
		this.characterRace = characterRace;
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
	
	@Override
	public long getStrength() {
		return this.strength + this.characterClass.getStrength() + this.characterRace.getStrength();
	}

	@Override
	public String toString() {
		return String.format("{Id: %s, FirstName: %s, LastName: %s, Class: %s, Race: %s, Str: %s}", 
				id, firstName, lastName, characterClass, characterRace, this.getStrength());
	}

}
