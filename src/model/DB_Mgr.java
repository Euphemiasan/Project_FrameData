/*package model;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Fait le lien entre bdd et classes
 * Cette classe ecrit les requetes et instantie les objets demandes avant de les renvoyer
 * 
 * @author Alexandre Leblond
 * edit AL 4/5/12
 

//Il faudra revoir pas mal de choses une fois la bdd prete comme les requetes, drivers, appels sur les colonnes

public class DB_Mgr {
	//Classe qui g�re la connexion et les requ�tes de la base de donn�es
	
	//Attributs
	private Connection db_connection;
	private String db_query;	//Il n'est peut etre pas necessaire de le garder en attribut
	
	public DB_Mgr() {
		
		db_query = new String();
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:base_de_donnees"; //a modifier avec le nom de la bdd
			db_connection = DriverManager.getConnection(url);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO connexion � la base de donn�e par singleton.
	}
	
	/**
	 * Return a Fighter from database avec sa move list incluse
	 * @param id du Fighter
	 * @return object fighter
	 
	public Fighter getFighter(int id) {
		ResultSet results;
		Fighter fighter;
		Move move;
		
		fighter = null;
		move = null;
		
		db_query = "Select * FROM table_fighter"; // A modifier selon l'architecture de la bdd
		
		try{
			Statement statement = db_connection.createStatement();
			
			results = statement.executeQuery(db_query);
			
			ResultSetMetaData rsmd;
			rsmd = results.getMetaData();
			
			//int column_count = rsmd.getColumnCount();
			
			fighter = new Fighter(id);
			
			for(Field field : fighter.getClass().getDeclaredFields())
				if(field.getName() != "fighter_id" && field.getName() != "fighter_moves")
					field.set(fighter, results.getObject(field.getName()));
			
			results.close();
			
			//Ajout des moves			
			db_query = "SELECT * FROM moves WHERE fighter_id = " + id;
			
			results = statement.executeQuery(db_query);
			
			rsmd = results.getMetaData();
			
			results.beforeFirst(); //Etre sur de ne pas louper le premier move
			
			while(results.next()) {
				move = new Move(results.getInt("id"));
				for(Field field : move.getClass().getDeclaredFields())
					if(field.getName() != "id")
						field.set(move, results.getObject(field.getName()));
				
				fighter.addMove(results.getObject("Input"), move);
			}
				
			results.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return fighter;
	}
	
}
*/