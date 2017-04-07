//Hannah Ku 3/19/17 2nd Period CompSci
//this is the PercentCell class that stores a percent value.
package textExcel;
import java.math.*;

public class PercentCell extends RealCell {
	
	private String storedValue = "";

	public PercentCell(String percent){
		setCellText(percent);
		storedValue = getCellText();
	}

	public double getDoubleValue(){
		double doubleValue = Double.parseDouble(storedValue.substring(0, storedValue.length() - 1));
		doubleValue /= 100;
		return doubleValue;
	}
}
