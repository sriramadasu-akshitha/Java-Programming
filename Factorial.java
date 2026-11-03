package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		System.out.println(fact(num));
	}
	public static int fact(int num) {
		if(num<=1) return num;
		return num*fact(--num);
	}

}
