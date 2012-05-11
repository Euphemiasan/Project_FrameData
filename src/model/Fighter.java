package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Repr�sente un Combattant
 * 
 * @author Joseph Nguyen & Alexandre Leblond
 * @param fighter_id / Id du combattant
 * @param fighter_name / Nom du combattant
 */

public class Fighter 
{
	//
	private int fighter_id;
	private String fighter_name;
	private HashMap<String, Move> fighter_moves; //cl� : nom du coup, valeur : frame data. //AL 4/5/12
	
	public Fighter(int id, String name)
	{
		fighter_id = id;
		fighter_name = name;
	}
	
	public void addMoves(ArrayList<Move> list)
	{
		Iterator<Move> i = list.iterator();
		while(i.hasNext())
			this.fighter_moves.put(i.next().getName(), i.next());
	}

	public int getFighter_id() {
		return fighter_id;
	}

	public String getFighter_name() {
		return fighter_name;
	}

	public HashMap<String, Move> getFighter_moves() {
		return fighter_moves;
	}
	
}
