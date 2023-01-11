package program;

import java.util.Scanner;

public class StrongNumber {

	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n=sc.nextInt();
			int a=n;
			int sum=0;
			while(n!=0)
			{
				int rem=n%10;
				int x=findFactorial(rem);
				sum=sum+x;
				n=n/10;
			}
			if(a==sum)
			{
				System.out.println(a+" is a strong number");
			}
			else
			{
				System.out.println(a+" is not a strong number");
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

