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
		String[] formulaArrayValues = formulaValue.split(" ");
		for(int i = 1; i < formulaArrayValues.length; i += 2){
			double currentNum = Double.parseDouble(formulaArrayValues[i]);
			double nextNum = Double.parseDouble(formulaArrayValues[i + 2]);
			
			if(formulaArrayValues[i + 1].equals("+")){
				nextNum = currentNum + nextNum;
			}
		}
		
		
		
		return 0.0;
	}
}
