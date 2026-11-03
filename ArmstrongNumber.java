package programming_practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		while(num!=0) {
			num=num/10;
			count++;
		}
		int exp=count;
		num=temp;
		int sum=0;
		while(num!=0) {
			int base=num%10;
			int power=1;
			for(int i=1;i<=exp;i++) {
				power=power*base;
			}
			sum=sum+power;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		sc.close();

	}

}
