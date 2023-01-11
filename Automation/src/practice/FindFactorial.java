package practice;
import java.util.Scanner;
public class FindFactorial {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		while(n!=0)
		{    //5*4*3*2
			int rem=n%10;
			int a=findfact(rem);
			System.out.println(rem+"!= "+a);
			n=n/10;
		}
	
	}
	public static int findfact(int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact; 
		
		
	}

}
