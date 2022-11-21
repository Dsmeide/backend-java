package com.example.project.repos;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.project.core.ICharacterRepo;
import com.example.project.models.ClassEnum;
import com.example.project.models.CharacterModel;

public class CharacterRepo implements ICharacterRepo {

	@Override
	public HashMap<Long, CharacterModel> loadCharacters() {
		HashMap<Long, CharacterModel> results = new HashMap<Long, CharacterModel>();
		
		JSONParser parser = new JSONParser();
        JSONArray jsonArray = null;
        
		try {
			InputStream is = CharacterRepo.class.getResourceAsStream("/characters.json");
			jsonArray = (JSONArray) parser.parse(new InputStreamReader(is));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		if (jsonArray == null) {
			return results;
		}

        for (Object o : jsonArray) {
            JSONObject character = (JSONObject) o;
            
            long id = (long) character.get("id");
            String firstName = (String) character.get("firstName");
            String lastName = (String) character.get("lastName");
            ClassEnum charClass = ClassEnum.valueOf((String) character.get("class"));
            // TODO: load race value
            
            CharacterModel model = new CharacterModel(id, firstName, lastName, charClass);
            results.put(id, model);

        }
        
		return results;
	}

}
