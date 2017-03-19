
public class CashRegister
{
	private double purchase;
	private double payment;
	
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}
	
	public double getPurchase()
	{
		return purchase;
	}
	
	public double getPayment()
	{
		return payment;
	}
	
	
	
	public void recordPurchase(double amount)
	{
		purchase = purchase+amount;
	}
	
	public void receivePayment(double amount)
	{
		payment = amount;
		if (payment>0)
		{
			if (payment==purchase)
			{
				System.out.println("Bill paid");
			}
			else if(payment>purchase)
			{			
				double change = returnChange();
				System.out.println("Return change  - "+change);			
			}
			else
			{
				purchase = purchase - amount;
				System.out.println("Amount due - "+purchase);
			}
		}
		else
		{
			System.out.println("Invalid amount");
		}
		
	}
	
	public double returnChange()
	{
		return payment-purchase;
	}
}
