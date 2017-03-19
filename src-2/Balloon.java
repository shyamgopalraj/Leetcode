import java.lang.Math;

public class Balloon 
{
	
	private double radius;
	
	public Balloon()
	{
		radius = 0;
	}
	
	public void setRadius(double r)
	{
		this.radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void inflate(double amount)
	{
		radius = radius + amount;
	}
		
	public double getVolume()
	{
		return (4*(Math.PI)*(Math.pow(radius, 3))/3);		
		
	}
}
