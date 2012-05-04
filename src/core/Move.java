package core;

/**
 * Repr�sente un Coup
 * 
 * @author Joseph Nguyen
 * 
 */
public class Move {
	private int move_id;
	
	private String move_name;
	private char move_type;
	private String move_input;
	
	private int move_damage;
	private char move_block;
	private int move_stun;
	private int move_meter;
	private char move_cancel_ability;
	
	private int move_startup;
	private int move_active;
	private int move_recovery;
	private int move_adv_block;
	private int move_adv_hit;
	
	/*
	 * Manque : move_note;
	 */
	
	public Move (int id) {
		move_id = id;
	}
	
	public int getId () {
		return move_id;
	}
	
	
	////////////////////////
	////	Getters		////
	////////////////////////
	
	public String getName () {
		return move_name;
	}
	
	public char getType () {
		return move_type;
	}
	
	public String getInput () {
		return move_input;
	}
	
	public int getDamage () {
		return move_damage;
	}
	
	public char getBlock () {
		return move_block;
	}
	
	public int getStun () {
		return move_stun;
	}
	
	public int getMeter () {
		return move_meter;
	}
	
	public char getCancelAbility () {
		return move_cancel_ability;
	}
	
	public int getStartup () {
		return move_startup;
	}

	public int getActive () {
		return move_active;
	}
	
	public int getRecovery () {
		return move_recovery;
	}
	
	public int getAdvBlock () {
		return move_adv_block;
	}
	
	public int getAdvHit () {
		return move_adv_hit;
	}
}