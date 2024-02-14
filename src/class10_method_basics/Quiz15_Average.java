package class10_method_basics;

public class Quiz15_Average {

	public static void main(String[] args) {

				//MyJava();
		String ave= findAverage(15,19,175);
				System.out.println("the average is "+ave);
				//System.out.format("The average is: %.3f", ave);
			}
	static	String findAverage(int a, int b, int c) {
		//System.out.println("I love Java Programming
//		int a =5;
//		int b=6;
//		int c=7;
		double sum=a+b+c;
	    double	ave=sum/3;
	    return String.format("%.2f", ave);
	  
		//System.out.println("the average is "+ave);
			 
	}

		

	

}
