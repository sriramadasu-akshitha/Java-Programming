package recursion;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		System.out.println(sum(num));
	}
	public static int sum(int num) {
		if(num<=1) return num;
		return num+sum(--num);
	}

}
