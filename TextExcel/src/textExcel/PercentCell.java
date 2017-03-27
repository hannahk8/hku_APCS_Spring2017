//Hannah Ku 3/19/17 2nd Period CompSci
//this is the PercentCell class that stores a percent value.
package textExcel;

public class PercentCell extends RealCell {
	
	private String percentValue;
	private String storedValue;

	public PercentCell(String percent){
		this.percentValue = percent;
		this.storedValue = percent;
	}
	
	public String abbreviatedCellText(){
		//take out percent sign
		percentValue = percentValue.substring(0, percentValue.length());
		//if has decimal, get index of decimal and substring the string from 0 to decimal index.
		if(percentValue.contains(".")){
			int decimalIndex = percentValue.indexOf(".");
			this.percentValue = percentValue.substring(0, decimalIndex);			
		}
		// if percent length is more than ten spaces, substring from 0 to 10
		if(percentValue.length() > 10){
			return percentValue.substring(0, 10);
		}else{
			int difference = 10 - this.percentValue.length();
			percentValue += "%";
			for(int k = 0; k < difference; k++){
				percentValue += " ";
			}
			return percentValue.substring(0,percentValue.length() -1);
		}
	}
	
	public String fullCellText(){
		storedValue = storedValue.substring(0, storedValue.length() - 1);
		//divide by 100 to get decimal form of percent
		return Double.toString(getDoubleValue()/100);
	}

	public double getDoubleValue(){
		String noPercent = this.storedValue.substring(0, this.storedValue.length());
		double doubleValue = (Double.parseDouble(noPercent))/100.0;
		return doubleValue;
	}
}
