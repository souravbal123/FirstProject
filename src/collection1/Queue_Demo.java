package collection1;

import java.util.*;

public class Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qu = new PriorityQueue<>(Arrays.asList(10, 11, 14, 12, 17, 16));
		System.out.println(qu);
		for (Integer element : qu) {
			System.out.println(element); // null not allowed
		}
		qu.remove(10);
		System.out.println(qu);
		Queue<String> qu1 = new PriorityQueue<>(Arrays.asList("sourav", "lipu", "dipu"));
        //Collections.sort(qu);
	}

}
