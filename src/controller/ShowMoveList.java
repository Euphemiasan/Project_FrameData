package controller;

import java.util.ArrayList;

public class ShowMoveList 
{

	public ArrayList<String> moveAnalyzer(String move)
	{
		int index = 0;
		char current = move.charAt(index);
		ArrayList<String> picture = new ArrayList<String>();	
		StringBuilder namePic = new StringBuilder();		
		boolean end = false;
		int state = 0;
		
		while(!end)
		{
			switch(state)
			{
				case 0:
						switch(current)
						{
							case '1':
								state = 1;
								namePic.append(current);
								index++;
								current = move.charAt(index);							
								break;
							case '2':
								state = 2;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '3':
								state = 6;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '4':
								state = 7;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '6':
								state = 11;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '8':
								state = 17;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '9':
								state = 18;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'L':
								state = 20;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'M':
								state = 23;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'H':
								state = 26;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'S':
								state = 29;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '|':
								state = 30;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'N':
								state = 31;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'C':
								state = 32;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case '>':
								state = 33;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'P':
								state = 34;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
							case 'K':
								state = 39;
								namePic.append(current);
								index++;
								current = move.charAt(index);
								break;
						}
						break;
				case 1:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 2:
						if(current == '1')
						{
							state = 3;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else if (current == '3')
							{
								state = 4;
								namePic.append(current);
								index++;
								current = move.charAt(index);
							}
							else
								state = 5;
						break;
				case 3:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 4:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 5:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 6:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 7:
						if (current == '1')
						{
							state = 8;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else if (current == '2')
							{
								state = 9;
								namePic.append(current);
								index++;
								current = move.charAt(index);
							}
							else
								state = 10;
						break;
				case 8:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 9:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 10:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length()-1);
						break;
				case 11:
						if (current == '3')
						{
							state = 12;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else if (current == '2')
							{
								state = 15;
								namePic.append(current);
								index++;
								current = move.charAt(index);
							}
							else
								state = 16;
						break;
				case 12:
						index = index + 4;
						if (current == '7')
						{
							state = 13;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
							state = 14;
						break;
			}
			
		}
				
		return null;
	}
	
}
