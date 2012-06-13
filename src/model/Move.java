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
	private boolean armor_break;
	private boolean ex;
	private String note;
	
	public Move(int id, int f_id, String n,  String inp, char t, boolean ab, boolean e, String no) 
	{
		move_id = id;
		fighter_id = f_id;
		name = n;
		type = t;
		input = inp;
		note = no;
		armor_break = ab;
		ex = e;
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
	
	public boolean isArmor_break() {
		return armor_break;
	}

	public boolean isEx() {
		return ex;
	}
	
}
