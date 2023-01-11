package program2;
import java.util.Scanner;
public class returnss {

	public static void main(String[] args ) {
	 
		
	//* System.out.println(test(0,1));
		
	//public static int test(int a,int b)
	//{
		//int test=100;
	 //   int c=a+b;				
	 //   System.out.println(c);
	//	return test; */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		int sum=0;
		int a=n;
		int x=countdigit(n);
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+power(rem, x);
			n=n/10;
		}
		if (a==sum)
		{
			System.out.println(a+ " this is a armstrong no");
		}
		else
		{
			System.out.println(a+ " this is not a armstrong no");
		}

	}
	
	 public static int countdigit(int n)
	 {
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	 }
	 
	 public static int power(int a, int b)
	 {
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			    pow=pow*a;
		}
	 return pow;	 
	 
	 }
 	
	}


