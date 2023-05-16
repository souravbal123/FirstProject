package wrapperclass;

public class DifferentDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		byte a = 1;
		short s = 100;
		long l = 90;
		float f = 3.6f;
		double d = 12.34;
		char ch = 'A';
		boolean result = true;
   
		Integer in= new Integer(x);
		System.out.println(in);
		Byte a1=new Byte(a);
		System.out.println(a1);
	    Short s1=new Short(s);
	    System.out.println(s1);
	    Long l1=new Long(l);
	    System.out.println(l1);
	    Float f1=new Float(f);
	    System.out.println(f1);
	    Double d1=new Double(d);
	    System.out.println(d1);
	    Character ch1=new Character(ch);
	    System.out.println(ch1);
	    Boolean b=new Boolean(result);
	    System.out.println(b);
	    
	
	}

}
