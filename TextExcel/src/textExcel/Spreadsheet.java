package textExcel;
import java.util.*;
// Update this file with your own code.

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
		//remove quotes so value in cell will not be quoted
		if(commandValue.contains("\"")){
			commandValue = commandValue.replace("\"", "");
		}
		//gets the location that was passed in
		SpreadsheetLocation location = new SpreadsheetLocation(commandLocation);
		
		if(commandValue.contains("%")){
			this.cellArray[location.getRow()][location.getCol()] = new PercentCell(commandValue);
		}else if(commandValue.contains("(")){
			
		}else{
			
		}
		
		SpreadsheetLocation location = new SpreadsheetLocation(commandLocation);
		this.cellArray[location.getRow()][location.getCol()] = new TextCell(commandValue);
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

}
