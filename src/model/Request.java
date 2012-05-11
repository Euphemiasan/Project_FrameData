package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Request 
{

	private Connection local;
	private Statement localStat;
	
	public Request() 
	{
		try 
		{			
			local = DriverManager.getConnection("jdbc:hsqldb:file:SSFIV", "sa", "");
			localStat = local.createStatement();			
		} 
		catch(Exception e) 
		{			
			e.printStackTrace();			
		}	
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
