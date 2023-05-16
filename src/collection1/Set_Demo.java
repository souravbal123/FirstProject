package collection1;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(14, 12, 11, 13, 11, 13));
		System.out.println(list);

		Set<Integer> set = new HashSet<>(Arrays.asList(11, 12, 13, 14, 11, 12, 12, 11));
		System.out.println(set);
		Set<Integer> set1 = new HashSet<>(); // no duplicates can be taken in set
		set1.add(11);
		set1.add(11);
		set1.add(12);
		set1.add(12);
		System.out.println(set1);
		//----------------------------------------------
		Set<Integer> set2 = new HashSet<>(list);
		System.out.println(set2);
		//---------------------------------------------
		List<String> list1 = new ArrayList<>(Arrays.asList("Ram", "Shyam", null, "Peter", null, "Mark"));
		System.out.println(list1);
		//--------------------------------------------
		List<String> list2 = new ArrayList<>(Arrays.asList("Hari", "Raju", "Lipu"));
		Set<String> set3 = new HashSet<>(list1);
		System.out.println(set3); // max 1 null value can take in hashset.
		//----------------------------------------------------------
		Set<String> set4 = new LinkedHashSet<>(list1);
		System.out.println(set4);
		//------------------------------------------------------------
		Set<String> set5 = new TreeSet<>(list2);
		System.out.println(set5); // null value not allowed and ascending sorted order
		//-------------------------------------------------------------------------
		Set<Integer> set6 = new LinkedHashSet<>(set2); // hashset---linkedhashset
		System.out.println(set6);
		//-------------------------------------------------------------------
		Set<Integer> set7 = new TreeSet<>(set2); // hashset---treeset also inherit from list
		System.out.println(set7);
		//-----------------------------------------------------------------
		Set<Integer> set8 = new LinkedHashSet<>();
		set8.add(100);
		set8.add(110);
		set8.add(120);
		set8.add(130);
		set8.add(140);
		set8.add(150);
		set8.add(160);
		set8.add(170);
		set8.add(180);
		set8.add(190);
		set8.add(200);
		set8.add(210);
		set8.add(220);
		set8.add(230);
		set8.add(240);
		set8.add(250);
		set8.add(260);
		set8.add(270);

		System.out.println(set8);

	}

}
