package programming_practice;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=1;int dec=0;
		while(num!=0) {
			int rem=num%10;
			dec=dec+rem*i;
			num=num/10;
			i=i*2;
		}
		System.out.println("Decimal : "+dec);
		sc.close();
	}

}
