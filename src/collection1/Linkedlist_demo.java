package collection1;

import java.util.*;

public class Linkedlist_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>(Arrays.asList(100, 101, 102, 103, 104));
		System.out.println(list);
		System.out.println("***************");
		List<String> list1 = new ArrayList<>(Arrays.asList("sourav", "chiku", "lipu", "dipu"));
		System.out.println(list1);
		System.out.println("***************");
		System.out.println(list.equals(list1));
		list1.add(1, null);
		System.out.println(list1);
		list1.remove(null);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("*********************");
		for (String element : list1) {
			System.out.println(element);
		}
		System.out.println("********************");
		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************");
		
		
	}

}
