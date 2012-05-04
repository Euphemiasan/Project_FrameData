package core;

import java.util.HashMap;

/**
 * Représente un Combattant
 * 
 * @author Joseph Nguyen & Alexandre Leblond
 * @param fighter_id / Id du combattant
 * @param fighter_name / Nom du combattant
 */

public class Fighter {
	private int fighter_id;
	private String fighter_name;
	
	private HashMap<String, Move> fighter_moves; //clé : nom du coup, valeur : frame data. //AL 4/5/12
	
	/*
	 * Manque : TopPlayers
	 */
	
	public Fighter(int id) { //utilisee par le db_mgr AL:4/5/12
		fighter_id = id ;
	}
	
	public Fighter (int id, String name) {
		fighter_id = id;
		fighter_name = name;
	}
	
	////////////////////////
	////	Getters		////
	////////////////////////
	
	public int getID () {
		return fighter_id;
	}
	
	public String getName () {
		return fighter_name;
	}

	public void addMove(Object object, Move move) { //Appelee par DB_Mgr AL 4/5/12
		// TODO Auto-generated method stub
		String s = (String) object;
		
		fighter_moves.put(s,move); //Ecrase anciennes valeurs !
		
	}
}
