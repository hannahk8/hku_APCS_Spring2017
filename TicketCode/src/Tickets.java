abstract class Tickets {
	private int number;
	private int price;
	public Tickets(int num){
		this.number = num;
	}
	public int getPrice(){
		return 0;
	}
	public String toString(){
		return "Number: " + this.number + "Price: " + this.price;
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