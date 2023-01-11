package Has_A;

public class Car {

	String name;
	int price;
	Engine e=new Engine(74,6,"petrol");

	public  Car()
	{
		
	}
	public Car(String name,int price,Engine e)
	{
		this.name=name;
		this.price=price;
		this.e=e;
	}
	public void run()
	{
		System.out.println("Car is Running");
	}
	public void displayCar()
	{
		System.out.println("Car is a name: "+name);
		System.out.println("Car is a price: "+price);
		System.out.println("Car engine hp : "+e.hp);
		System.out.println("Car engine strokes : "+e.strokes);
		System.out.println("Car engine type : "+e.type);
		e.displayengine();
		
	}
	
	
	
	
	
	
	
	
	
	
}
