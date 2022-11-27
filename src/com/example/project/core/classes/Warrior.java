package com.example.project.core.classes;

import com.example.project.core.ICharacterClass;

public class Warrior implements ICharacterClass {
	@Override
	public long getStrength() {
		return 11;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
