package textExcel;

public class FormulaCell extends RealCell{
	private String formulaValue;

	public FormulaCell(String formula) {
		this.formulaValue = formula;
	}
	
	public String abbreviatedTextCell(){
		return this.formulaValue.substring(0, 10);

	}
	
	public String fullCellText(){
		return this.formulaValue;
	}
	
	public double getDoubleValue(){
		return 0.0;
	}
}
