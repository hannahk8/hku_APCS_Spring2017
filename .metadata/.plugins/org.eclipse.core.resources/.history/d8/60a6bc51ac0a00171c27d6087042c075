package textExcel;

public class ValueCell extends RealCell {
	private String stringDouble;
		
	public ValueCell(String doubleNum) {
		this.stringDouble = doubleNum;
	}
	
	public String abbreviatedCellText(){
		if(this.stringDouble.length() > 10){
			return this.stringDouble.substring(0,10);
		}
		if(this.stringDouble.length() < 10){
			int difference = 10 - this.stringDouble.length();
			for(int k = 0; k < difference; k++){
				stringDouble += " ";
			}
		}
			return this.stringDouble;
	}
	
	public String fullCellText(){
		return this.stringDouble.replaceAll("\"", "");
	}
	
	public double getDoubleValue(){
		return Double.parseDouble(this.stringDouble);
	}

}
