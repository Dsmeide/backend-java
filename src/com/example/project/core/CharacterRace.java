package com.example.project.core;

public abstract class CharacterRace implements ICharacterStats {
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}