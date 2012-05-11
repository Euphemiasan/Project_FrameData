package others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateBase 
{
	private static String current_line;
	public static void main (String[] args) 
	{
		try 
		{
			Connection local = DriverManager.getConnection("jdbc:hsqldb:file:data/ssfivae", "sa", "");
			Statement localStat = local.createStatement();	
			
			//*/
			BufferedReader import_reader = new BufferedReader(new FileReader("data/imports.txt"));
			
			while ((current_line = import_reader.readLine()) != null)
			{
				if ( (current_line.length() > 0) && (!current_line.substring(0, 2).equals("//")) )
					localStat.execute(current_line);
			}
			//*/
			
			localStat.execute("SHUTDOWN");
			localStat.close();
			System.out.println("FIN IMPORTS");
		}
		catch(Exception e) 
		{
			System.out.println(current_line);
			e.printStackTrace();
			System.exit(0);
		}	
	}
}
