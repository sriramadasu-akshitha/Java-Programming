package programming_practice;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
