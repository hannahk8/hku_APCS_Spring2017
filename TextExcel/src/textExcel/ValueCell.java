//Hannah Ku 3/19/17 2nd Period CompSci
//this is the ValueCell class that stores a double.
package textExcel;

public class ValueCell extends RealCell {
	private String stringDouble;
		
	public ValueCell(String doubleNum) {
		setCellText(doubleNum);
		stringDouble = getCellText();
	}

	public double getDoubleValue(){
		return Double.parseDouble(this.stringDouble);
	}

}
