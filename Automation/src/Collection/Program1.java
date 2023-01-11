package Collection;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
        c.add(34);
        c.add(56.67);
        c.add("Mohan");
        c.add(true);
        c.add(34);
        c.add(56.67);
        
      /*  System.out.println(c);
        List l2=new ArrayList();
        l2.add(46);
        l2.add(56);
        l2.addAll(c); */
        
        Object o=12;
		Integer o1=(Integer)o;
		System.out.println(o1+20); 
	}
}
