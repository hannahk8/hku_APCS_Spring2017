package textExcel;

public class EmptyCell implements Cell {
	private String emptyValue = "";
	public EmptyCell(){
	}

	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		emptyValue.substring(0, 9);
		return null;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return emptyValue;
	}

}
