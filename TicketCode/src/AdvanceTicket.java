public class AdvanceTicket extends Tickets{
	private double price;
	private int numDaysBefore;
	public AdvanceTicket(int n, int daysBefore){
		super(n);
		this.numDaysBefore = daysBefore;
		this.price = getPrice();
	}
	public double getPrice(){
		if(this.numDaysBefore >= 10){
			this.price = 30.0;
			return this.price;
		}else{
			this.price = 40.0;
			return this.price;
		}
	}
	public String toString(){
		return super.toString() + ", Price: " + this.price;
	}
}
