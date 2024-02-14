package class10_method_basics;

public class String_Method_Practice {

	public static void main(String[] args) {
		String e1="MY NAME, IS, RosY";
		String e2="my name is rosy";
		String new22=e1.toLowerCase();	//quiz 22 String panipulation
		System.out.println(new22);
		
		String newName=e1.concat("USA");
		System.out.println(newName);
		
		System.out.println(e1.equalsIgnoreCase(e2));
		String[] word=e1.split(",", 3);
		for(String w: word) {
			System.out.println(w);
		}
		
		
		//String name=" "; 
		String name="MicroTech NA, Jamaica, TX USA";
		System.out.println("-----------------");
		System.out.println(name.contains("MicroTech"));
		boolean s1=name.isBlank();
		System.out.println("aaaaaaaaaa"+(s1));
		System.out.println("(last)index of C is"+name.lastIndexOf('c'));
		String address="    MicroTech NA, Jamaica, TX USA    ";
		address=address.stripLeading();
		boolean value = name.endsWith("SA");
		System.out.println("----------------");
		System.out.println(value);
		String aaa="	Me and my hubby 	";
		
		String aa1=aaa.stripTrailing();
		String aa2=aaa.strip();
		System.out.println("<"+address+">");
		System.out.println("<"+aa1+">");
		System.out.println(aa2);
		String s;
		//	 0123456789012345678
		s ="MicroTech NA"; 
		boolean value2=s.startsWith("M");
		System.out.println(value2);
		System.out.println("Result after Comparing the characters: "+s.compareToIgnoreCase("MicroTech NA"));
		System.out.println("Result after Comparing the characters: "+s.compareToIgnoreCase("ppppp"));
		String p="ABCDEFGHKFDFKGJNBFB";
		System.out.println(s);
		char n =s.charAt(5);
		System.out.println(n);		
		System.out.println(s.length());
		int length11=s.length();
		System.out.println(length11);
		
	// FIND index number using indexOf method
		int indexnum=s.indexOf('a'); 	//E index number is 4 
		System.out.println("Index number of a is :\t" +indexnum);
		
		int indexnum1=p.indexOf('J');
		System.out.println("Index number of J is :\t" +indexnum1); 	//J index number is 14
		
		int indexlast = p.lastIndexOf('F');
		System.out.println("Last index number of F is :"+indexlast); //F Last index num 17
		
		//using replace method
		String new_s=p.replace('C', 'T');	// as char
		System.out.println("after replace new p is: " +new_s);  //new s=ABPDEFGHKFDFKGJNBFB
		
		String new_s1=p.replace("CDE", "PPP");	// as string 
		System.out.println("after replace new p is: " +new_s1);  //new s=ABPPPFGHKFDFKGJNBFB
		//find the index number from the long sentence
				 //0123456789012345
		String S1="Lord of the ring";
		int ind =S1.indexOf("the");
		System.out.println("the index is:\t"+ind); // the index is 8
		
		String S2;	
		//extract York from the New York Lovers
				 //0123456789012345
		S2="New York Lovers";
		String W = S2.substring(4);
		System.out.println( W);   // W = York Lovers
		double d=31.02;
		String A1=String.valueOf(d);
		System.out.println(d+0.02);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		

	}

}
