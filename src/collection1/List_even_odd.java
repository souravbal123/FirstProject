package collection1;

import java.util.*;

public class List_even_odd {

	public List<Integer> evenOdd(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list1.add(list.get(i) + 1);
			} else {
				list1.add(list.get(i) - 1);
			}
		}

		return list1;

	}

	public List<Integer> evenOdd1(List<Integer> list) {
		List<Integer> List1 = new ArrayList<Integer>();
		for (int element : list) {
			if (element % 2 == 0) {
				List1.add(element + 1);
			} else {
				List1.add(element - 1);

			}
		}

		return List1;
	}

	public List<Integer> evenodd2(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		int element = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			element = itr.next();
			if (element % 2 == 0) {
				list1.add(element + 1);
			} else {
				list1.add(element - 1);
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List_even_odd leo = new List_even_odd();
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16));
		System.out.println(leo.evenOdd(list));
		System.out.println(leo.evenOdd1(list));
		System.out.println(leo.evenodd2(list));

	}

}
