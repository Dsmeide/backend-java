package com.example.project.core.classes;

import com.example.project.core.ICharacterClass;

public class Mage implements ICharacterClass {
	@Override
	public long getStrength() {
		return 5;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}