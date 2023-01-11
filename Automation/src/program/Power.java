package program;

public class Power {
	
	public static void main(String[] args)
	{
		System.out.println("The power value is: "+findPower(10, 2));
		System.out.println("The power value is: "+findPower(5, 3));
		int x=findPower(6, 3);
		System.out.println("the powr is: "+x);
		
	}
	public static int findPower(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
	return pow;
	}

}
