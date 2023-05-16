package collection1;

import java.util.Collections;
import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<String> stc=new Stack<String>();
      stc.push("Peter");
      stc.push("Alok");
      stc.push("Gourab");
      System.out.println(stc);
      stc.pop();
      System.out.println(stc);
      System.out.println(stc.peek());
      Collections.sort(stc);
      System.out.println(stc);
	}

}
