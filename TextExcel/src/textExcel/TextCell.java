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
		cellText = value;
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see textExcel.Cell#fullCellText()
	 */
	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return null;
	}

}
