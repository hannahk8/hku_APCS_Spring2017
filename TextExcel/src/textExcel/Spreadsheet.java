//Hannah Ku 3/19/17 2nd Period CompSci
//this is the spreadsheet class that creates a spreadsheet as a long string.
package textExcel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
import java.io.*;

public class Spreadsheet implements Grid
{
	private Cell[][] cellArray = new Cell[20][12];
	private String firstRow = "   ";
	public Spreadsheet(){
		//make array with empty cell objects
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 12; j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
		//make first row (A - L)
		for(int i = 0; i < 12; i ++){
				firstRow += "|" + ((char)(i + 65)) + "         ";
		}
		firstRow += "|\n";
	}
	@Override
	public String processCommand(String command)
	{  	
		//if there is no command
		if(command.length() == 0){
			return "";
		}
		//if command is clear
		if(command.toLowerCase().equals("clear")){
			clearEntireSheet();
			return getGridText();
			
		}
		//if command is for example "clear A1"
		if(command.toLowerCase().contains("clear ")){
			clearSpecificCell(command);
			return getGridText();
		}
		//if command is for example "A1 = "hello""
		if(command.contains("=")){
			changeCellValue(command);
	    	return getGridText();
			
		}
		
		/*if(command.equals("save myData.csv")){
			writeFile(myFile);
		}*/
		
		//if command is only the location, for example "A1"
		SpreadsheetLocation location = new SpreadsheetLocation(command);
		return this.cellArray[location.getRow()][location.getCol()].fullCellText();
	}

	
	public void clearEntireSheet(){
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 12; j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
	}
	
	public void clearSpecificCell(String input){
		String[] splitCommand = input.split(" ");
		String locationToChange = splitCommand[1];
		SpreadsheetLocation location = new SpreadsheetLocation(locationToChange);
		this.cellArray[location.getRow()][location.getCol()] = new EmptyCell();
	}
	
	public void changeCellValue(String input){
		// split command into location and value
		String[] splitCommand = input.split(" = ");
		String commandLocation = splitCommand[0];
		String commandValue = splitCommand[1];
		// in case there are two equal signs
		if(splitCommand.length > 2){
			commandValue += " = " + splitCommand[2];
			System.out.println(commandValue);
		}
		
		//gets the location that was passed in
		SpreadsheetLocation location = new SpreadsheetLocation(commandLocation);
		int row = location.getRow();
		int col = location.getCol();
		
		//remove quotes so value in cell will not be quoted
		if(commandValue.contains("\"")){
			commandValue = commandValue.replace("\"", "");
			this.cellArray[row][col] = new TextCell(commandValue);
		//if contains percent sign, make percent cell
		}else if(commandValue.contains("%")){
			this.cellArray[row][col] = new PercentCell(commandValue);
		//if contains parenthesis, make formula cell
		}else if(commandValue.contains("(")){
			this.cellArray[row][col] = new FormulaCell(commandValue);
		//if none of the above tests pass it is a value cell
		}else{
			this.cellArray[row][col] = new ValueCell(commandValue);
		}
	}
	
	@Override
	public int getRows()
	{
		return this.cellArray.length;
	}

	@Override
	public int getCols()
	{
		return this.cellArray[0].length;
	}

	@Override
	public Cell getCell(Location loc)
	{
		return this.cellArray[loc.getRow()][loc.getCol()];
	}
	
	public String getCellType(Location loc){
		String cellValue = this.cellArray[loc.getRow()][loc.getCol()].fullCellText();
		if(cellValue.contains("\"")){
			return "TextCell";
		}else if(cellValue.contains("%")){
			return "PercentCell";
		}else if(cellValue.contains("(")){
			return "FormulaCell";
		}else{
			return "ValueCell";
		}
	}
	
	public String getLocation(Cell value){
		for(int i = 0; i < 20; i ++){
			for(int j = 0; j < 12; j ++){
				
			}
		}
	}

	@Override
	public String getGridText()
	{
		String SpreadsheetString = "";
		SpreadsheetString += firstRow;
		SpreadsheetString += "1  |";
		for(int i = 0; i < this.cellArray.length; i++){
			for(int j = 0; j < this.cellArray[i].length; j++){
				SpreadsheetString += (cellArray[i][j].abbreviatedCellText());
				SpreadsheetString += "|";
				if(j == 11){
						SpreadsheetString += "\n";
					if(i != 19){
						if(i >= 8){
							SpreadsheetString += (i + 2) + " |"; 
						}else{
							SpreadsheetString += (i + 2) + "  |";
						}
					}
					
				}
			}
		}
		
		return SpreadsheetString;
	}
	
	private String writeFile(String filename){
		PrintStream outputFile;
		try{
			outputFile = new PrintStream(new File(filename));
		}
		catch (FileNotFoundException e){
			return "File not found: " + filename;
		}
		
		for(int i = 0; i < 20; i ++){
			for(int j = 0; j < 12; j ++){
				outputFile.println(getLocation(cellArray[i][j]), getCellType(getLocation(cellArray[i][j])), )
			}
		}
		
		
		
		
		outputFile.println(location, )
		outputFile.close();
		return "hi";
	}
	
	private String readFile(String filename){
		Scanner inputFile;
		try{
			inputFile = new Scanner(new File(filename));
		}
		catch (FileNotFoundException e ){
			return "File not found: " + filename;
		}
		inputFile.nextLine();
		inputFile.close();
		return "hi";
	}

}
