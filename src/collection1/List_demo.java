package collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<String>();  //also ArrayList<>();
		str.add("sourav");
		str.add("Amit");
		str.add("Hari");
		System.out.println(str);
		System.out.println("***********************");
		for (int j = 0; j < str.size(); j++) {
			System.out.println(str.get(j));
		}
		System.out.println("***********************");
		for (String element : str) {
			System.out.println(element);
		}
		System.out.println("**********************");
		Iterator<String> itrs = str.iterator();
		while (itrs.hasNext()) {
			System.out.println(itrs.next());
		}
		System.out.println("***********************");
		List<String> str1 = new ArrayList<>(Arrays.asList("Raju", "Mark", "Peter"));
		List<String> str2 = new ArrayList<>(Arrays.asList("Sai", "Dipu", "Lipu"));
		System.out.println(str1.equals(str2));
		Collections.sort(str1);
		System.out.println(str1);
		str1.add(1, "OMM");
		System.out.println(str1);
		str1.remove(1);
		System.out.println(str1);
		System.out.println(str1.contains("Raju1"));

		str1.clear();
		System.out.println(str1.size());
		
		List<Integer> list = new ArrayList<>(Arrays.asList(14, 12, 11, 13, 11, 13));
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);  //sorted in reverse order
		

		// List<String> str2 = new ArrayList(List.of("Sai","Dipu","Lipu"));

	
	}

}
