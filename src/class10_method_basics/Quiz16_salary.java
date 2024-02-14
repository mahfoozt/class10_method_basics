package class10_method_basics;

public class Quiz16_salary {

	public static void main(String[] args) {
	
		double total1=calculateNetIncome();
		System.out.println("your net income is "+total1);
	}
	static	double calculateNetIncome() {

		double salary =90000.00;
		double tax=salary*0.26;
		double total=salary-tax;
		return total;
		    
		//System.out.println("your net income is "+total);
	}

}
