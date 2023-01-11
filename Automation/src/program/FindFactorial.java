package program;

import java.util.Scanner;

public class FindFactorial {
	
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int n=sc.nextInt();
	while(n!=0)
	{
		int rem=n%10;
		int x=findFactorial(rem);
		System.out.println(rem+" != "+x);
		n=n/10;
	}
	
}
    public static int findFactorial(int a)
{
	    int fac=1;
	  for(int i=1;i<=a;i++)
	{
		fac=fac*i;
	}
return fac;
}
}




