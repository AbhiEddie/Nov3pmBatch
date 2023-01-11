package practice;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("This number is even number");  	
		}
		else
		System.out.println("This number is odd number");	

	}

}
