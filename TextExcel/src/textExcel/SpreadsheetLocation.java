package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int colNum;
	private int rowNum;
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return this.rowNum;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return this.colNum;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	this.colNum = cellName.charAt(0) - 'A';
    	this.rowNum = Integer.parseInt(cellName.substring(1));
    }

}
