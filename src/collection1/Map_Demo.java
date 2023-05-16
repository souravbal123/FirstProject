package collection1;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "peter");
		student.put(4, "mark"); // null allowed but multiple null not allow.one null allow
		student.put(5, "ram"); // ordering hashmap and tree map same--need to check
		student.put(2, "hari");
		student.put(3, "ram");
		System.out.println(student);

		Map<Integer, String> student1 = new LinkedHashMap<>();
		student1.put(1, "peter");
		student1.put(4, "mark");
		student1.put(5, "ram"); // null allowed but multiple null not allow.one allow
		student1.put(2, "hari");
		student1.put(3, "ram");
		System.out.println(student1);

		Map<Integer, String> student3 = new TreeMap<>();
		student3.put(1, "peter");
		student3.put(4, "mark"); // null value not allowed
		student3.put(5, "ram");
		student3.put(2, "hari");
		student3.put(3, "ram");
		System.out.println(student3);
     
		for(Map.Entry<Integer, String> m:student3.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	
	}

}
