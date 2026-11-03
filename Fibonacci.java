package programming_practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int a=0;int b=1;int sum=0;
		for(int i=1;i<=num;i++) {
			System.out.println(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
