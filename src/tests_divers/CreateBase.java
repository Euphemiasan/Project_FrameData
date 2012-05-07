package tests_divers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateBase 
{

	private Connection local;
	private Statement localStat;

	/*
	 * Table 
	 */
	
	public CreateBase() 
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
	
	public void create() 
	{
		try 
		{
			String requete = "CREATE TABLE Fighters " +
								"(" +
								"fighter_id num(2) NOT NULL, " +
								"fighter_name varchar(20) NOT NULL," +
								"PRIMARY KEY (fighter_id)" +
								")";
			localStat.executeUpdate(requete);
			localStat.executeUpdate("CREATE TABLE Move (Id_move char(5) NOT NULL, Nom_move varchar(20) NOT NULL, Input_move varchar(20), Id_characters char(5), PRIMARY KEY (Id_move), FOREIGN KEY(Id_characters) REFERENCES Characters(Id_characters))");
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void insert()
	{
		try
		{
			localStat.executeUpdate("INSERT INTO Characters values('15','Juri')");
			localStat.executeUpdate("INSERT INTO Move values('1','Fuhajin','236k','15')");
			localStat.executeUpdate("INSERT INTO Move values('2','Shikusen','214K','15')");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void close() throws Exception 
	{
		localStat.execute("SHUTDOWN");
		localStat.close();
	}
	
}
