package collection1;

import java.util.*;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> vec = new Vector<>();
		vec.add(10);
		vec.add(11);
		System.out.println(vec);
		System.out.println("******************");
		List<Integer> vec1 = new Vector<>(Arrays.asList(100,101,102));
		System.out.println(vec1);
		System.out.println("***********************");
		System.out.println(vec.equals(vec1));
	    vec.add(1, null);
	    System.out.println(vec);
	    System.out.println("*******************");
	    for(Integer element:vec) {
	    	System.out.println(element);
	    }
	    System.out.println("******************");
	    Iterator itr=vec.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println("**********************");
	    List<String> vec2=new Vector<>(Arrays.asList("sourav","dipu","lipu"));
	    Collections.sort(vec2);
	    System.out.println(vec2);
	    System.out.println(vec2.contains("hari"));
	}

}
