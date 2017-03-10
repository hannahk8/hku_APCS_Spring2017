/**
 * 
 */
package textExcel;

/**
 * @author APCS2
 *
 */
public class TextCell implements Cell {
	private String cellText;
	/* (non-Javadoc)
	 * @see textExcel.Cell#abbreviatedCellText()
	 */
	public TextCell(String value){
		this.cellText = value;
	}
	@Override
	public String abbreviatedCellText() {
		return "          |";
		//return this.cellText.substring(0, 9);
	}

	/* (non-Javadoc)
	 * @see textExcel.Cell#fullCellText()
	 */
	@Override
	public String fullCellText() {
		return this.cellText;
	}

}
