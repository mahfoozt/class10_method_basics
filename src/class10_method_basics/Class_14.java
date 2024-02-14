package class10_method_basics;

public class Class_14 {
//	Input	Result
//	Method Return
//	Hints: 
//	generateAddress(“123 Test St”, “Irving”, “TX”, “75062”);
//	123 Test St
//	Irving
//	TX 75062

	public static void main(String[] args) {// length of string
		String name;// here string is a non-primitive data type
		// index 012345678

		name = "Karim Ali";
		int SizeOfName = name.length();
		System.out.println("Length of name " + SizeOfName);

		// position of any char
		// find char by index number
		char value = name.charAt(6);
		System.out.println("the char which index 6, is " + value);

		// find index number using char
		int indexNum = name.indexOf('i');
		System.out.println("last i index is " + name.lastIndexOf('i'));
		System.out.println("first i index is " + indexNum);

		// Concat another string
		String newNAME = name.concat(" USA");
		System.out.println(newNAME);

		// replace chars
		String replaceName = name.replace('i', 'e');
		System.out.println(replaceName);

		// subString
		// index 01234567890123456
		name = "karim Ali Bhuyian";
		String partOfName = name.substring(5);
		System.out.println(partOfName);
		// begindex ,endindex-1
		String x = name.substring(6, 16);
		System.out.println(x);

		// startswith // True and false
		boolean X = name.startsWith("kar");
		boolean c=name.contains("karim");
		System.out.println("******************");
		System.out.println(X);
		System.out.println("-----------");
		System.out.println(c);

		// Endswith
		boolean y = name.endsWith("ian");
		System.out.println(y);

		// remove space
		String removespace = name.replace(" ", "");
		System.out.println(removespace);

		String s = "";
		boolean a = s.isBlank();// for Blank string return true
		// for white spaces return true
		System.out.println("is Blank with empty string " + a);

		// isEmpty()
		String s1 = "";
		boolean a1 = s1.isEmpty();
		System.out.println("isEmpty with empty string " + a1);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		String text = "Java, is a fun, Programming";
		String[] result = text.split(",");
		// System.out.println(result);
		for (String abc : result) {
			System.out.println(abc);
		}

		// Syntax for each loop
		// for (type variable: arrayName)
//
//		String result=generateAddress("123 Test St ", " Irving ", " TX ", " 75062 ");
//		System.out.println(result);		
	}
//	public static String generateAddress(String address1, String city, String state, String zip) {
//		String genaddress=address1+city+state+zip;
//		return genaddress;
//		
//		
//		//return address1;  
//		//return city;
//		//return state;
		//return zip;
	//}

}
//public class Quiz_Method {
//
//	public static void main(String[] args) {
//		//MyJava();
//		generateAddress();
//
//	}
//	static	void generateAddress() {
//		//System.out.println("I love Java Programming!");
//		System.out.println("123 Test St");
//		System.out.println("Irving");
//		System.out.println("TX 75062");
//				 
//	}
//
//}
