public class TicketsClientCode {
	public static void main (String[]args){
		WalkUpTicket sameDayTicket = new WalkUpTicket(2);
		System.out.println(sameDayTicket);
		
		AdvanceTicket earlyTicket = new AdvanceTicket(18, 10);
		System.out.println(earlyTicket);
		
		StudentAdvanceTickets studentTicket = new StudentAdvanceTickets(9, 30);
		System.out.println(studentTicket);
	}
}
