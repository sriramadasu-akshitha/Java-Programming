package programming_practice;

import java.util.Scanner;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num!=0) {
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
		sc.close();
	}

}
