package com.example.project.core.races;

import com.example.project.core.ICharacterRace;

public class Ogre implements ICharacterRace {
	@Override
	public long getStrength() {
		return 7;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
