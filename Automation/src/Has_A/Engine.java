package Has_A;

public class Engine {

	int hp;
	int strokes;
	String type;
	
	public Engine ()
	{
			
	}
	public Engine (int hp,int strokes,String type)
	{
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void start()
	{
		System.out.println("Engine is starting");
	}
	public void displayengine ()
	{
		System.out.println("Engine hp is: "+hp);
		System.out.println("Engine strokes is: "+strokes);
		System.out.println("Engine type is: "+type);
	}
	
	
	
}
