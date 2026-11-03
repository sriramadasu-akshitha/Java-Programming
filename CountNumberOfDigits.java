package programming_practice;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Count : "+count);

	}

}
