package com.example.project.services;

import java.util.Collection;

import com.example.project.core.ICharacterRepo;
import com.example.project.core.ICharacterService;
import com.example.project.models.CharacterModel;

public class CharacterService implements ICharacterService {
	private final ICharacterRepo characterRepo;
	
	private static CharacterModel selectedCharacter;
	
	public CharacterService(ICharacterRepo characterRepo) {
		this.characterRepo = characterRepo;
	}

	@Override
	public Collection<CharacterModel> loadCharacters() {
		return characterRepo.loadCharacters().values();
	}

	@Override
	public void selectCharacter(int id) {
		selectedCharacter = null;
	}

}
