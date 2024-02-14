package class10_method_basics;

public class quiz26_AddressPrint {

	public static void main(String[] args) { 
//			generateAddress("123 Test St", "Irving", "TX", "75062");
//			123 Test St
//			Irving
//			TX 75062
		generateAddress();
			
	}
	public static void generateAddress() {
		String streetAddress="123 Test St";
		String city="Irving";
		String state="TX";
		String zip="75062";
		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
		
	}
	
	

}
