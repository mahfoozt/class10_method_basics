package class10_method_basics;

public class Extract_Substring {

	public static void main(String[] args) {
//		012345678901234567890123456789012345678901234567890
//		1234 Test Drive, Dallas, TX 75623
//		012345678901234567890123456789012345678901234567890
//		34-23 Flower Road, New York, NY 10001
//		012345678901234567890123456789012345678901234567890
//		739 Kingston Lane, Apt 3E, New Hapshire, NH 14005
//
//		Q: Extract zip, state, city, Address, Street Address, Apt
//		---------------------------
//		Street Address
//		Apt
//		city, state zip
		String a;
		   //012345678901234567890123456789012345678901234567890
		a = "1234 Test Drive, Dallas, TX 75623";
		String zip = a.substring(28, 33);
		System.out.println("The zip code is " + zip);
		String state = a.substring(25, 27);
		System.out.println("The state code is " + state);
		String city = a.substring(17, 23);
		System.out.println("The city code is " + city);
		String Address = a.substring(0, 15);
		System.out.println("The StreetAddress code is " + Address);
		
		String b1;
		    //012345678901234567890123456789012345678901
		b1 = "34-23 Flower Road, New York, NY 10001";
		String zip1 = b1.substring(32, 37);
		System.out.println("The zip code is " + zip1);
		String state1 = b1.substring(29, 31);
		System.out.println("The state code is " + state1);
		String city1 = b1.substring(19, 27);
		System.out.println("The city code is " + city1);
		String Address1 = b1.substring(0, 17);
		System.out.println("The StreetAddress code is " +Address1);
			
		String c1;
		 	//012345678901234567890123456789012345678901234567890
		c1 = "739 Kingston Lane, Apt 3E, New Hapshire, NH 14005";
		String zip2 = c1.substring(44, 49);
		System.out.println("The zip code is " + zip2);
		String state2 = c1.substring(41, 43);
		System.out.println("The state code is " + state2);
		String city2 = c1.substring(27, 39);
		System.out.println("The city code is " + city2);
		String APT1 = c1.substring(19, 25);
		System.out.println("The Apt code is " + APT1);
		String Address2 = c1.substring(0, 17);
		System.out.println("The StreetAddress code is " +Address2);
		   //0123456789

	}

}
