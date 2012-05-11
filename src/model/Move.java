package model;

/**
 * Repr�sente un Coup
 * 
 * @author Joseph Nguyen 
 * @author Alexandre Leblond
 * 
 */
public class Move 
{
	
	private int move_id;
	private int fighter_id;	
	private String name;
	private char type;
	private String input;
	private String note;
	
	public Move(int id, int f_id, String n, char t, String inp, String no) 
	{
		move_id = id;
		fighter_id = f_id;
		name = n;
		type = t;
		input = inp;
		note = no;
	}
	
	public int getMove_id() {
		return move_id;
	}
	public int getFighter_id() {
		return fighter_id;
	}
	public String getName() {
		return name;
	}
	public char getType() {
		return type;
	}
	public String getInput() {
		return input;
	}
	public String getNote() {
		return note;
	}
	
}
