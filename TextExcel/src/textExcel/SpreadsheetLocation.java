//Hannah Ku 4/1/17 2nd Period CompSci

package textExcel;


public class SpreadsheetLocation implements Location
{
	private int colNum;
	private int rowNum;
    @Override
    public int getRow()
    {
        return this.rowNum - 1;
    }

    @Override
    public int getCol()
    {
        return this.colNum;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	String capital = cellName.substring(0, 1).toUpperCase();
    	this.colNum = capital.charAt(0) - 'A';
    	this.rowNum = Integer.parseInt(cellName.substring(1));
    }

} 
