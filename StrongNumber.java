package programming_practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong number");
		}
	}

}
