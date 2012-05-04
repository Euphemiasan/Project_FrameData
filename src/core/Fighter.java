package core;

/**
 * Représente un Combattant
 * 
 * @author Joseph Nguyen
 * @param fighter_id / Id du combattant
 * @param fighter_name / Nom du combattant
 */

public class Fighter {
	private int fighter_id;
	private String fighter_name;
	
	/*
	 * Manque : MoveList et TopPlayers
	 */
	
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
}
