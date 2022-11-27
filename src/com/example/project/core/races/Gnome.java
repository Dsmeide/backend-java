package com.example.project.core.races;

import com.example.project.core.ICharacterRace;

public class Gnome implements ICharacterRace {
	@Override
	public long getStrength() {
		return 3;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
