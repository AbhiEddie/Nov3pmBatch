package Oops;

public class Program9 {
	static int i=14;
	static int j=test();
	static {
		
	i=demo();
	System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
	int p=test();
	System.out.println(i+" "+j+" "+p);
	}
	
	public static int test() {
	System.out.println("test method: "+i+" "+j);
	i=30;
	return i+12;
	}
	public static int demo() {
	System.out.println("demo method: "+i+" "+j);
	int j=36;
	return 100;
	}
}
