package textExcel;

public class TestingCode {

	public static void main(String[] args) {
		Cell[][] array = new EmptyCell[20][12];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 12; j++){
				array[i][j] = new EmptyCell();
			}
		}
		array[0][0] = new TextCell("hi");
		//System.out.println((TextCell)array[0][0]);
		
		//System.out.println(array[0][0].abbreviatedCellText());
	}

}
