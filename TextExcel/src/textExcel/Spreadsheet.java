package textExcel;
import java.util.*;
// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] cellArray;
	public Spreadsheet(){
		cellArray = new EmptyCell[20][12];
		for(int i = 0; i < cellArray.length; i++){
			for(int j = 0; j < cellArray[i].length; j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return command;
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
