package textExcel;

public class TestingCode {

	public static void main(String[] args) {
		Cell[][] array = new Cell[20][12];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 12; j++){
				array[i][j] = new EmptyCell();
			}
		}
		Cell nice = new TextCell("hi");
		array[1][1] = nice;
		//System.out.println((TextCell)array[0][0]);
		
		
		
		System.out.println(nice.abbreviatedCellText() + "hi");
		System.out.println(nice.fullCellText() + "hi");

	}

}
