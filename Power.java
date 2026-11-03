package programming_practice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int base=sc.nextInt();
		System.out.println("Enter exp value");
		int exp=sc.nextInt();
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		System.out.println("Power : "+power);
	}

}
