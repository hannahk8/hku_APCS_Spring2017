package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet newSheet = new Spreadsheet();
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		while(userInput.equals("quit") != true && userInput.equals("") != true){
				System.out.print(newSheet.processCommand(userInput));	
				userInput = input.nextLine();
		}
	}
}
