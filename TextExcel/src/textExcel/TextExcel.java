package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet newSheet= new Spreadsheet();
		//System.out.println(newSheet.getGridText());
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		while(userInput.equals("quit") != true){
			System.out.print(newSheet.processCommand(userInput));	
			userInput = input.nextLine();
		}
	}
}
