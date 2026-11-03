package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;int range=5;
		print(num,range);
	}
	public static void print(int num,int range) {
		if(num>=range) return;
		System.out.print(fib(num)+" ");
		print(++num,range);
	}
	public static int fib(int num) {
		if(num<=1) return num;
		return fib(num-2)+fib(num-1);
	}

}
