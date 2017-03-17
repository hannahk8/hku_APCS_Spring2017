package textExcel;

public class PercentCell extends RealCell {
	
	private String percentValue;

	public PercentCell(String percent){
		this.percentValue = percent;
	}
	
	public String abbreviatedCellText(){
		if(percentValue.contains(".")){
			int decimalIndex = percentValue.indexOf(".");
			this.percentValue = percentValue.substring(0, decimalIndex);
		}
		if(percentValue.length() > 10){
			return percentValue.substring(0, 9) + "hi";
		}
		if(percentValue.length() < 10){
			int difference = 10 - percentValue.length();
			percentValue += "%";
			for(int k = 0; k < 8; k++){
				percentValue += " ";
			}
		}
		return this.percentValue;
	}
	
	public String fullCellText(){
		int decimalIndex = percentValue.indexOf(".");
		String roundedPercent = percentValue.substring(0, decimalIndex);
		return roundedPercent;
	}

	public double getDoubleValue(){
		double doubleValue = Double.parseDouble(percentValue);
		return doubleValue;
	}
}