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
			String requete;
			
			requete = "CREATE TABLE Fighters " +
						"(" +
						"fighter_id numeric(2) NOT NULL, " +
						"fighter_name varchar(20), " +
						"PRIMARY KEY (fighter_id)" +
						")";
			localStat.executeUpdate(requete);
			
			requete = "CREATE TABLE SpecialMoves " +
						"(" +
						"move_id numeric(5) NOT NULL, " +
						"fighter_id numeric(2) NOT NULL, " +
						"move_name varchar(25), " +
						"move_input varchar(25), " +
						"move_type char(1), " +
						"move_armor_break boolean, " +
						"move_ex_possible boolean, " +
						"move_note varchar(100), " +
						"PRIMARY KEY (move_id), " +
						"FOREIGN KEY (fighter_id) REFERENCES Fighters(fighter_id)" +
						")";
			localStat.executeUpdate(requete);
			
			requete = "CREATE TABLE FrameData " +
						"(" +
						"move_id numeric(5) NOT NULL, " +
						"fighter_id numeric(2) NOT NULL, " +
						"move_name varchar(25), " +
						"move_input varchar(25), " +
						"move_type char(1), " +
						"move_damage varchar(25), " +
						"move_block varchar(2), " +
						"move_stun varchar(25), " +
						"move_meter varchar(25), " +
						"move_startup varchar(25), " +
						"move_active varchar(25), " +
						"move_recovery varchar(25), " +
						"move_hit_adv varchar(25), " +
						"move_block_adv varchar(25), " +
						"move_iframes varchar(25), " +
						"move_chain boolean, " +
						"move_special boolean, " +
						"move_super boolean, " +
						"move_note varchar(100), " +
						"PRIMARY KEY (move_id), " +
						"FOREIGN KEY(fighter_id) REFERENCES Fighters(fighter_id)" +
						")";
			localStat.executeUpdate(requete);
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
