abstract class Tickets {
	private int number;
	private double price;
	public Tickets(int num){
		this.number = num;
	}
	public abstract double getPrice();
	public String toString(){
		return "Number: " + this.number;
	}
}