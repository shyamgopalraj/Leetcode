import java.util.Scanner;

public class CashRegisterDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CashRegister sample = new CashRegister();
		Scanner input = new Scanner(System.in);		
		System.out.print("enter purchase price and ZERO TO QUIT PURCHASING - ");
		double purchase=input.nextDouble();
		while(purchase>0)
		{ 
			sample.recordPurchase(purchase);
			System.out.println("payment recorded - "+sample.getPurchase());
			System.out.print("enter purchase price and ZERO TO QUIT PURCHASING - ");
			purchase=input.nextDouble();
		}
		
		System.out.print("enter amount to pay bills - ");
		double amount = input.nextDouble();
		sample.receivePayment(amount);
		input.close();
	}

}
