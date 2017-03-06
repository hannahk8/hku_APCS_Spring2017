package textExcel;

public class EmptyCell implements Cell {
	private String emptyValue = "";
	public EmptyCell(){
	}

	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return this.emptyValue.substring(0, 9);
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return emptyValue;
	}

}
