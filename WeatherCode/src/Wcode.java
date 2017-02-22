import java.io.*;
import java.util.*;
public class Wcode {
	public static void main(String[]args) throws FileNotFoundException{
		File f = new File("./resources/weather.txt");
		Scanner input = new Scanner(f);
		double curDayTemp = input.nextDouble();
		while(input.hasNextDouble()){
			double nextDayTemp = input.nextDouble();
			double change = nextDayTemp - curDayTemp;
			System.out.println(curDayTemp + " to "  + nextDayTemp
					+ ", change = " + change);
			curDayTemp = nextDayTemp;
		}
	}
}