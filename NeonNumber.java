package programming_practice;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;int prod=num*num;
		while(prod!=0) {
			int rem=prod%10;
			sum=sum+rem;
			prod=prod/10;
		}
		if(num==sum) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
	}

}
