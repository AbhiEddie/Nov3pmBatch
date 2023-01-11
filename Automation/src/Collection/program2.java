package Collection;

import java.util.*;

public class program2 {

	public static void main(String[] args) {
		
	Collection c=new ArrayList();
	c.add(12);
	c.add(14);
	c.add(17);
	c.add(20);
	c.add(25);
	c.addAll(c);
	
	
	Object o=12;
	Integer o1=(Integer)o;
	System.out.println(o1+20);
	
	
	
	}

}
