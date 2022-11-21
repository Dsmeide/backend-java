package com.example.project.core;

import java.util.Collection;

import com.example.project.models.CharacterModel;

public interface ICharacterService {
	Collection<CharacterModel> loadCharacters();
	void selectCharacter(int id);
}
