package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class Request 
{

	private Connection local;
	private Statement localStat;
	
	public Request() 
	{
		try 
		{			
			local = DriverManager.getConnection("jdbc:hsqldb:file:data/ssfivae", "sa", "");
			localStat = local.createStatement();			
		} 
		catch(Exception e) 
		{			
			e.printStackTrace();			
		}	
	}
	
	public ArrayList<Move> returnMoveList(int id)
	{
		ArrayList<Move> result = new ArrayList<Move>();
		StringBuilder request = new StringBuilder();
		
		try
		{
			request.append("Select move_id, fighter_id, move_name, move_input, move_type, move_armor_break, move_ex_possible, move_note from SpecialMoves where fighter_id='").append(id).append("'");
			ResultSet res = localStat.executeQuery(request.toString());
			while(res.next())
			{
				result.add((new Move(res.getInt(1),res.getInt(2),res.getString(3),res.getString(4),(res.getString(5)).charAt(0),res.getBoolean(6),res.getBoolean(7),res.getString(8))));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public Fighter returnFighter(String n)
	{
		StringBuilder request = new StringBuilder();
		int id = 0;
		String name = null;
		
		try
		{
			request.append("Select fighter_id, fighter_name from Fighters where fighter_id = '").append(n).append("'");
			ResultSet res = localStat.executeQuery(request.toString());
			while(res.next())
			{
				id = res.getInt(1); 
				name = res.getString(2);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new Fighter(id,name);
	}
	
	public void showChar(String n)
	{
		StringBuilder s = new StringBuilder();
		StringBuilder resultat = new StringBuilder();
		try {
			s.append("Select fighter_name from Fighters where fighter_id = '").append(n).append("'");
			ResultSet res = localStat.executeQuery(s.toString());
			ResultSetMetaData m = res.getMetaData();
			while(res.next())
			{			
				for(int i = 1; i <=  m.getColumnCount(); i++)
					resultat.append(res.getString(i));
				
				resultat.append(",");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(resultat.toString());
	}
	
	public void showMove(String n)
	{
		StringBuilder s = new StringBuilder();
		StringBuilder resultat = new StringBuilder();
		try {
			s.append("Select* from SpecialMoves where fighter_id = '").append(n).append("'");
			ResultSet res = localStat.executeQuery(s.toString());
			ResultSetMetaData m = res.getMetaData();
			while(res.next())
			{			
				for(int i = 1; i <=  m.getColumnCount(); i++)
					resultat.append(res.getString(i));
				
				resultat.append(",");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(resultat.toString());
	}
	
}
