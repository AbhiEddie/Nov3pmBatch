package practice;
import java.util.*;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
        int n=sc.nextInt();*/
        //prime no= 2,3,5,7,9,11,13
        int n=4;
        int temp=0;
        for(int i=2;i<=n-1;i++)
        {
        	
        if(n%i==0)
        {
        	temp=temp+1;
        }
        }
        if(temp<0)
        {
        	System.out.println("This is prime no");
        }
        else
        	System.out.println("This is not prime no");
        
        
        
        
        
	}

}
