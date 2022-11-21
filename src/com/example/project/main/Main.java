package com.example.project.main;

import java.util.HashMap;

import com.example.project.core.ICharacterRepo;
import com.example.project.models.CharacterModel;
import com.example.project.repos.CharacterRepo;

class Main {
	public static void main(String[] args) {
		ICharacterRepo characterRepo = new CharacterRepo();
		HashMap<Long, CharacterModel> characters = characterRepo.loadCharacters();
		characters.values().forEach(character -> {
			System.out.println(character);
		});
	}
}