package textExcel;

public abstract class RealCell implements Cell {
	private String doubleCellValue;
	
	@Override
	public String abbreviatedCellText() {
		return doubleCellValue.substring(0, 10);
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
