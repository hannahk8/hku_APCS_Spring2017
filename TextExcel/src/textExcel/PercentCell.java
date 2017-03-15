package textExcel;

public class PercentCell extends RealCell {
	
	private double percentValue;

	public PercentCell(String percent){
		String noPercentSign = percent.substring(0, percent.length()); 
		percentValue = Double.parseDouble(noPercentSign);
	}
	
	public String abbreviatedCellText(){
		return null;
	}
	
	public String fullCellText(){
		return null;
	}

	public double getDoubleValue(){
		return 0.0;
	}
}
