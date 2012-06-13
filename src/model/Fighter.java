package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
	private HashMap<Integer, Move> fighter_moves; //cl� : nom du coup, valeur : frame data. //AL 4/5/12
	
	public Fighter(int id, String name)
	{
		fighter_id = id;
		fighter_name = name;
		fighter_moves = new HashMap<Integer, Move>();	
	}
	
	public void addMoves(Move move)
	{
		fighter_moves.put(new Integer(move.getMove_id()), move);
	}
	
	public int getFighter_id()
	{
		return fighter_id;
	}

	public String getFighter_name()
	{
		return fighter_name;
	}

	public HashMap<Integer, Move> getFighter_moves()
	{
		return fighter_moves;
	}
	
	public void printMoves()
	{
		Iterator it = fighter_moves.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        Move m = (Move) pairs.getValue();
	        System.out.println(m.getName() + " : " + m.getInput());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
}
