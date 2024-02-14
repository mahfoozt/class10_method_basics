package class10_method_basics;

public final class Replace_string_01 {

	public static void main(String[] args) {
		
//		String str = "oooooo-hhhh-oooooo";
//		String rs = str.replace("h","s"); // Replace 'h' with 's'
//		System.out.println(rs);
//		rs = rs.replace("s","h"); // Replace 's' with 'h'
//		System.out.println(rs);
		/////////////////////////////////////
		String abc="i-------love-----3226666666666666";
		System.out.println(abc);
		String ref=abc.replace("-", "*");
		System.out.println(ref);
		String ref1=ref.replace("2", "4");
		String ref2=ref.replace("6", "9");
		System.out.println(ref1+'\n'+ref2);
	}

}
