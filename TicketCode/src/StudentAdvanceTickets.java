
public class StudentAdvanceTickets extends AdvanceTicket {
	public StudentAdvanceTickets(int n, int days){
		super(n, days);
	}
	public int getPrice(){
		if(number >= 10){
			return 15;
		}else{
			return 20;
		}
	}
}
