package com.example.project.repos;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.project.core.ICharacterClass;
import com.example.project.core.ICharacterRace;
import com.example.project.core.ICharacterRepo;
import com.example.project.core.classes.Mage;
import com.example.project.core.classes.Warrior;
import com.example.project.core.races.Gnome;
import com.example.project.core.races.Ogre;
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
            long str = (long) character.get("strength");
            
            ICharacterClass charClass = null;
            String strClass = ((String) character.get("class")).toLowerCase();
            switch(strClass) {
	        	case "mage": 
	        		charClass = new Mage();
	        		break;
	        	case "warrior": 
	        		charClass = new Warrior();
	        		break;
            }
            
            ICharacterRace charRace = null;
            String strRace = ((String) character.get("race")).toLowerCase();
            switch(strRace) {
	        	case "gnome": 
	        		charRace = new Gnome();
	        		break;
	        	case "ogre": 
	        		charRace = new Ogre();
	        		break;
            }
            
            CharacterModel model = new CharacterModel(id, firstName, lastName, str, charClass, charRace);
            results.put(id, model);

        }
        
		return results;
	}

}
