
public class BalloonDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Balloon b1 = new Balloon();
		Balloon b2 = new Balloon();
		System.out.println("default radius - "+b1.getRadius());
		System.out.println("default radius - "+b2.getRadius());
		b1.inflate(8.5);
		b2.inflate(11.5);
		System.out.println("b1 radius - "+b1.getRadius());
		System.out.println("b2 radius - "+b2.getRadius());
		double v1 = b1.getVolume();
		double v2 = b2.getVolume();
		System.out.println("volume of balloon b1 - "+v1);
		System.out.println("volume of balloon b2 - "+v2);		
	}

}
