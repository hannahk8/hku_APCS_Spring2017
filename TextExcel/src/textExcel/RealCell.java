//Hannah Ku 3/19/17 2nd Period CompSci
//this is the abstract RealCell class that has methods that will be inherited or overridden.
package textExcel;

public abstract class RealCell implements Cell {
	private String doubleCellValue;
	private String stringDouble;
	
	@Override
	public String abbreviatedCellText() {
			return this.stringDouble;
	}
	


	@Override
	public String fullCellText() {
		return doubleCellValue;
	}
	
	public void setCellText(String value){
		this.doubleCellValue = value;
	}
	 
	public String getCellText(){
		return doubleCellValue;
	}
	
	public abstract double getDoubleValue();

}
