package class10_method_basics;

public class Value_Of_method {

	public static void main(String[] args) {
		System.out.println(  (7 + 5 + 6 + 4) / 4.0  );
		System.out.println((7 + 5.0 + 6 + 4) / 4);
		System.out.println( (7 + 5 + 6 + 4) / 4 );
		double num = -42937737.9d;

		System.out.println(num);
//		
//		float num = 19.98f;
//		System.out.println(num);
//		//long num = -12332252626L;
//
//		System.out.println(num);
		
		//2.ValueOf() Method
		int p;
		p=405;
		String pp1=String.valueOf(p); //convert int to string
		System.out.println(100.23+pp1);
		
		double d = 31.02;
		String s = String.valueOf(d);// Convert double to String
		System.out.println( 0.02+s);// 0.02
		// char to String.
		char ch1 = 'A';
		char ch2 = 'B';
		String s1 = String.valueOf(ch1);
		String s2 = String.valueOf(ch2);
		System.out.println(s1+s2);
		System.out.println(String.valueOf(ch2));

	}

}
