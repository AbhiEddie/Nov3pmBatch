package practice;

public class Power {

	public static void main(String[] args) {
		
        System.out.println("The power value is: "+findpower(10, 2));
        System.out.println("The power value is: "+findpower(15, 2));
		int x=findpower(6,2);
		System.out.println(x);
	}
	
	public static int findpower(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
			
		}
		    return pow;
	}

}
