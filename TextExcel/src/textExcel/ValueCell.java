package textExcel;

public class ValueCell extends RealCell {
	double doubleValue;
	
	public ValueCell(double doubleNum) {
		doubleValue = doubleNum;
	}
	
	public String abbreviatedCellText(){
		return null;
	}
	
	public String fullCellText(){
		return null;
	}
	
	public double getDoubleValue(){
		return doubleValue;
	}

}
