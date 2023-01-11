package program;

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {
		
		int no=11;
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
	    if(no%i==0)
	    {
	    	temp=temp+1;
	    }
		}
		if(temp>0)
		{
			System.out.println("This is not a prime number");
		}
		else
			System.out.println("This is prime a number");
	
		
	}

}
