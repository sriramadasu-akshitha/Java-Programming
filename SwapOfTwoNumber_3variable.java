package programming_practice;

import java.util.Scanner;

public class SwapOfTwoNumber_3variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("After Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		sc.close();
	}

}
