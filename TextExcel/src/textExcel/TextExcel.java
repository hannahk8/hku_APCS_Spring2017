//Hannah Ku 3/19/17 2nd Period CompSci
//this is the TextExcel class that takes in user input as commands and updates the created spreadsheet.
package textExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet newSheet = new Spreadsheet();
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		//keep prompting for input until user types "quit"
		while(userInput.equals("quit") != true && userInput.equals("") != true){
				System.out.print(newSheet.processCommand(userInput));	
				userInput = input.nextLine();
		}
	}
	
}
