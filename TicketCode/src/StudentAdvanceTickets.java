
public class StudentAdvanceTickets extends AdvanceTicket {
	private int numDaysBefore;
	public StudentAdvanceTickets(int n, int days){
		super(n, days);
		n = numDaysBefore;
	}
	public double getPrice(){
		if(this.numDaysBefore >= 10){
			return super.getPrice()/2;
		}else{
			return super.getPrice()/2;
		}
	}
	public String toString(){
		return super.toString() + " (ID required)";
	}
}
