package encapsulation;
import java.util.Scanner;
public class Employ {

	private static int pin=1234;
	private String name;
    private int empId;
    
    public String getName()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Password to access the name: ");
    	int x=sc.nextInt();
    	if(pin==x)
    	{
    		return name;
    	}
    	else 
    	{
    		return null;
    	}
    	  }
    public int getEmpId()
    {
    	return empId;
    }
    public void setName(String name )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Password to set name: ");
    	int x=sc.nextInt();
         
    	if(pin==x)
    	{
    		System.out.println("Validation is successful and name is set");
    		this.name=name;
    	}
    	else
    	{
    		System.out.println("password is not valid. Name is not set.");
    	}
    }
        public void setEmpId()
        {
    	     this.empId=empId;
        }
    
    
    
    
    
    
    
    
    


}
