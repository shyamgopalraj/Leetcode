
import java.util.Scanner;

public class TicketSeller {
	
	int total_number_of_buyers = 0;
	int total_tickets = 50;
	Scanner input = new Scanner(System.in);
	
	public void buyTicket()
	{
		while(total_tickets>0)
		{
			System.out.println("total number of tickets - "+total_tickets);
			System.out.print("enter the number of tickets you want to buy(maximum of 5 tickets can be purchased) - ");
			int num_of_tickets = input.nextInt();
			while(num_of_tickets <= 0)
			{
				System.out.println("enter a value greater than ZERO - ");
				num_of_tickets = input.nextInt();
			}
			while(num_of_tickets > total_tickets)
			{
				System.out.print("enter a value less than equal to "+total_tickets+" - ");
				num_of_tickets = input.nextInt();
			}
			while(num_of_tickets > 5)
			{
				System.out.print("Re-enter value less than or equal to max tickets purchase(5) - ");
				num_of_tickets = input.nextInt();
			}
			total_tickets = total_tickets - num_of_tickets;			
			total_number_of_buyers++;
		}
		
		input.close();
		System.out.println("All tickets sold");
		System.out.println("total number of buyers - "+total_number_of_buyers);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TicketSeller sample = new TicketSeller();
		sample.buyTicket();
	}
}
