package com.example.project.core;

import java.util.HashMap;

import com.example.project.models.CharacterModel;

public interface ICharacterRepo {
	HashMap<Long, CharacterModel> loadCharacters();
}
