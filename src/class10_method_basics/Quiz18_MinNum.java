package class10_method_basics;

public class Quiz18_MinNum {

	public static void main(String[] args) {

        int min=findMaxNumber(4,6,3);
        System.out.println("min value = "+min);
	}
	static	int findMaxNumber(int a, int b, int c) {
		//System.out.println("I love Java Programming
		if((a<b)&&(a<c)) {
			return a;		
		}else if(b<c) {
			return b;
		}else {
			return c;
		}

	}

}
