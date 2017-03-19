import java.util.Scanner;
import java.lang.Math;

public class Volume {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter value for h1 - ");
		Scanner input = new Scanner(System.in);
		double h1 = input.nextDouble();
		System.out.println("enter value for h2 - ");
		double h2 = input.nextDouble();
		System.out.println("enter value for h3 - ");
		double h3 = input.nextDouble();
		System.out.println("enter value for r1 - ");		
		double r1 = input.nextDouble();
		System.out.println("enter value for r2 - ");
		double r2 = input.nextDouble();		
		input.close();
		double v1 = Math.PI*Math.pow(r1, 2)*h1;
		double v2 = Math.PI*Math.pow(r2, 2)*h2;
		double coneVolume = Math.PI*(Math.pow(r1, 2)+(r1*r2)+Math.pow(r2, 2))*h3/3;
		double bottleVolume = coneVolume+v1+v2;
		System.out.println("volume of the bottle - "+bottleVolume);		
	}
}
