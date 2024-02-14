package class10_method_basics;

public class Quiz17_MaxNum {

	public static void main(String[] args) {

		//MyJava();
		//findAverage();
        int max=findMaxNumber(3,7,9);
        System.out.println("max="+max);
	}
	static	int findMaxNumber(int a, int b, int c) {
		//System.out.println("I love Java Programming
		if((a>b)&&(a>c)) {
			return a;		
		}else if(b>c) {
			return b;
		}else {
			return c;
		}		
	    
	}
}
