package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		EmptyCell[][] cellArray = new EmptyCell[12][20];
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		while(userInput != "quit"){			
			userInput = input.nextLine();
			Spreadsheet.processCommand(userInput);	
		}
	}
}
