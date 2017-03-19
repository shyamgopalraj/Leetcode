import java.util.Scanner;


public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		System.out.print("Enter an integer: - ");
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();
		input.close();
		if(userInput%2==0 && userInput%3==0)
		{
			System.out.println("Number "+userInput+" is divisible by both 2 and 3");
		}
		else if(userInput%2==0)
		{
			System.out.println("Number "+userInput+" is divisible by 2, but not by 3");
		}
		else if(userInput%3==0)
		{
			System.out.println("Number "+userInput+" is divisible by 3, but not by 2");
		}
		else
		{
			System.out.println("Number "+userInput+" is divisible neither by 2 nor by 3");
		}
	}

}
