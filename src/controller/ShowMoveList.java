package controller;

import java.util.ArrayList;
import java.util.Iterator;

public class ShowMoveList 
{

	public ArrayList<String> moveAnalyzer(String move)
	{
		int index = 0;
		char current = move.charAt(index);
		move = move.concat("~");
		System.out.println(move);
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
							case '7':
									state = 44;
									namePic.append(current);
									index++;
									current = move.charAt(index);
									break;
							case '~':
								end = true;
								break;
						}
						break;
				case 1:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 2:
						if(current == '1')
						{
							state = 3;
							namePic.append(current);
							index = index+2;
							current = move.charAt(index);
						}
						else if (current == '3')
							{
								state = 4;
								namePic.append(current);
								index=index+2;
								current = move.charAt(index);
							}
							else
								state = 5;
						break;
				case 3:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 4:
						picture.add(namePic.toString());				
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 5:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 6:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 7:
						if (current == '1')
						{
							state = 8;
							namePic.append(current);
							index=index+4;
							current = move.charAt(index);
						}
						else if (current == '2')
							{
								state = 9;
								namePic.append(current);
								index=index+2;
								current = move.charAt(index);
							}
							else
								state = 10;
						break;
				case 8:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 9:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 10:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
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
								index=index+2;
								current = move.charAt(index);
							}
							else
								state = 16;
						break;
				case 12:
						index = index + 2;
						current = move.charAt(index);
						if (current == '4')
						{
							index++;
							current = move.charAt(index);
							if (current =='7')
							{
								state = 13;
								namePic.append(current);
								index=index+3;
								current = move.charAt(index);
							}
							else
							{
								state = 14;
							}
						}
						break;
				case 13:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 14:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 15:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 16:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 17:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 18:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 20:
						if (current == 'P')
						{
							state = 21;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
						{
							state = 22;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
				case 21:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 22:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 23:
						if (current == 'P')
						{
							state = 24;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
						{
							state = 25;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
				case 24:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 25:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 26:
						if (current == 'P')
						{
							state = 27;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
						{
							state = 28;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
				case 27:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 28:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 29:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 30:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 31:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 32:
						if (current == '1')
						{
							state = 45;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else if (current == '2')
							{
							state = 46;
							namePic.append(current);
							index++;
							current = move.charAt(index);
							}
							else
							{
								state = 47;
								namePic.append(current);
								index++;
								current = move.charAt(index);
							}
					/*
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;*/
				case 33:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 34:
						if (current == 'P')
						{
							state = 35;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
							state = 38;
						break;
				case 35:
						if (current == 'P')
						{
							state = 36;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
							state = 37;
						break;
				case 36:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 37:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 38:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 39:
						if (current == 'K')
						{
							state = 40;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
							state = 43;
						break;
				case 40:
						if (current == 'K')
						{
							state = 41;
							namePic.append(current);
							index++;
							current = move.charAt(index);
						}
						else
							state = 42;
						break;
				case 41:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 42:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 43:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 44:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 45:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 46:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
				case 47:
						picture.add(namePic.toString());
						state = 0;
						namePic.delete(0, namePic.length());
						break;
			}
			
		}
				
		return picture;
	}
	
	public static void main (String args[])
	{
		ShowMoveList sml = new ShowMoveList();
		ArrayList<String> test = sml.moveAnalyzer("C28K>7|8|9>2");
		Iterator<String> i = test.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	
}
