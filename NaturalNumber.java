package programming_practice;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Natural Number");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
