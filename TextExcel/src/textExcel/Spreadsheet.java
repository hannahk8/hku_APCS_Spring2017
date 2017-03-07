package textExcel;
import java.util.*;
// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] cellArray;
	private String firstRow = "";
	private int columnNumber;
	public Spreadsheet(){
		cellArray = new EmptyCell[20][12];
		//make first row (A - L)
		for(int i = 0; i < 12; i ++){
				firstRow += "|" + (char)i + "         ";
		}
		//set all values to empty cell objects
		for(int i = 1; i < cellArray.length; i++){
			for(int j = 0; j < cellArray[i].length; j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		
		if(command = "clear"){
			Spreadsheet clearedSpreadsheet = new Spreadsheet();
			return clearedSpreadsheet;
		}
		
		if(command.contains("=")){
			SpreadsheetLocation location = new SpreadsheetLocation(command);
	    	this.cellArray[location.getRow()][location.getCol()] = 
	    			new TextCell(command);
			return command;
		}
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
		// TODO Auto-generated method stub
		
		return null;
	}

}
