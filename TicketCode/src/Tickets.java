abstract class Tickets {
	private int number;
	private int price;
	private int numDaysBefore;
	public Tickets(int num){
		this.number = num;
	}
	public abstract int getPrice();
	public abstract void toString();
}

public class WalkupTicket extends Tickets{
	public WalkupTicket(){}
	public int getPrice(){
		return 50;
	}
	public void toString(){
		System.out.println("Number: " + number + "Price: " + 50);
	}
}

public class AdvanceTicket extends Tickets{
	public AdvanceTicket(){}
	public int getPrice(){
		if(number >= 10){
			return 30;
		}else{
			return 40;
		}
	}
	public void toString(){
		System.out.println("Number: " + getPrice());
	}
}

public class StudentAdvanceTicket extends AdvanceTicket{
	public StudentAdvanceTicket(){}
	public int getPrice(){
		if(number >= 10){
			return 15;
		}else{
			return 20;
		}
	}
}