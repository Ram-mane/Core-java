package com.basics;

public class WrapperClassConversions {

	public static void main(String[] args) {


		// converting primitive  boolean to boolean object (Autoboxing)
		boolean b= true;
		Boolean obj1 = Boolean.valueOf(b);
		System.out.println(b+" "+obj1);
		
		// unboxing reverse
		Boolean obj2 = Boolean.valueOf(false);
		boolean b1 = obj2.booleanValue();
		System.out.println(obj2+" "+b1);
		
		
		// converting char primitive   to char object (Autoboxing)
				char c= 'r';
				Character ch = Character.valueOf(c);
				System.out.println(c+" "+ch);
				
				// unboxing reverse
				Character char1 = Character.valueOf('a');
				char b11 = char1.charValue();
				System.out.println(char1+" "+b11);
				
	   // converting float primitive to Float object 
				
				float f = 10.2f;
				Float f1 = Float.valueOf(f);
				System.out.println(f+" "+f1);
				
				// unboxing
				Float f2 = Float.valueOf(50.26f);
				float f11 = f2.floatValue();
				System.out.println(f2+" "+f11);
				
				
				
		// converting double primitive to Double obect
				
				double d= 40.0215698;
				Double dbl = Double.valueOf(d);
				System.out.println(d+" "+dbl);
				
				//unboxing
				Double dbl1 = Double.valueOf(56.032148);
				double d1 = dbl1.doubleValue();
				System.out.println(dbl1+" "+d1);
				
				
		// converting long primitive to Long obect
				
				long l= 400215698;
				Long lng = Long.valueOf(l);
				System.out.println(l+" "+lng);
				
				//unboxing
				Long lng1 = Long.valueOf(56032148);
				long l1 = lng1.longValue();
				System.out.println(lng1+" "+l1);
				
	  // converting byte primitive to Byte obect
				
				byte b111= 40;
				Byte byt = Byte.valueOf(b111);
				System.out.println(b111+" "+byt);
				
				//unboxing
				Byte byt1 = Byte.valueOf(b111);
				byte bt = byt1.byteValue();
				System.out.println(byt1+" "+bt);
				
	}

}
