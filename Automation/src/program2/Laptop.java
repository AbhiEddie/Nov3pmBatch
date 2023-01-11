package program2;
import java.util.Scanner;
public class Laptop {

 private  static String userId= "ad101";
 private String userName;
 private int Password;
 
 public String getuserName()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter username to access the laptop");
	 String x=sc.nextLine();
	 
	 if (userId==x)
	 {
		 return userName;
	 }
	 else 
	 {
		 return null;
	 }
 }
	 public int getpassword() 
	 {                  
		 return Password;
	 }
	 
	 public void setuserName(String userName)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the username to access laptop");
		 String x=sc.nextLine();
		 
		 if(userId==x)
		 {
			 System.out.println("Validation is successful and username is okay");
			 this.userName=userName;
		 }
		 else
		 {
			 System.out.println("username is not valid. ");
		 }
	 }
		 public void password(int Password)
		 {
			 this.Password=Password;
		 }
	 
	  }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

