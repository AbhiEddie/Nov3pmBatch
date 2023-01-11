package program;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int a=n;
		int x=countDigit(n);
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+findPower(rem, x);
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println(a+" is an Armstrong number");
		}
		else
		{
			System.out.println(a+" is not an Armstrong number");
		}
	}
	public static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
	return count;
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
