package textExcel;
import java.util.*;
// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] cellArray;
	private String firstRow = "   ";
	public Spreadsheet(){
		//make array with empty cell objects
		cellArray = new EmptyCell[20][12];
		//make first row (A - L)
		for(int i = 0; i < 12; i ++){
				firstRow += "|" + ((char)(i + 65)) + "         ";
		}
		firstRow += "\n";
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		
		//if command is clear
		if(command.equals("clear")){
			Spreadsheet cellArray = new Spreadsheet();
			return getGridText();
			
		}
		//if command is for example "clear A1"
		if(command.contains("clear ")){
			String[] splitCommand = command.split(" ");
			String locationToChange = splitCommand[1];
			SpreadsheetLocation location = new SpreadsheetLocation(locationToChange);
			this.cellArray[location.getRow()][location.getCol()] = new EmptyCell();
			return getGridText();
		}
		//if command is for example "A1 = "hello""
		if(command.contains("=")){
			// split command into location and value
			String[] splitCommand = command.split("=");
			String commandLocation = splitCommand[0];
			String commandValue = splitCommand[1];
			SpreadsheetLocation location = new SpreadsheetLocation(commandLocation);
	    	this.cellArray[location.getRow()][location.getCol()] = 
	    			new TextCell(commandValue);
	    	return getGridText();
			
		}
		//if command is only the location, for example "A1"
		SpreadsheetLocation location = new SpreadsheetLocation(command);
		return this.cellArray[location.getRow()][location.getCol()].fullCellText();
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return this.cellArray.length;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return this.cellArray[0].length;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		String SpreadsheetString = "";
		SpreadsheetString += firstRow;
		SpreadsheetString += "1  |";
		for(int i = 0; i < this.cellArray.length; i++){
			for(int j = 0; j < this.cellArray[i].length; j ++){
				//SpreadsheetString += cellArray[i][j].abbreviatedCellText();
				SpreadsheetString += "hello ";
				if(j == 11){
					SpreadsheetString += "\n";
					SpreadsheetString += (i + 2) + "  |";
				}
			}
		}
		
		return SpreadsheetString;
	}

}
