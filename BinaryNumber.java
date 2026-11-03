package programming_practice;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int binary=0;int i=1;
		while(num!=0) {
			int rem=num%2;
			binary=binary+rem*i;
			i=i*10;
			num=num/2;
		}
		System.out.println("Binary of "+num+" : "+binary);
	}

}
