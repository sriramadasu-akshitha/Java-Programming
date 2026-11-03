package programming_practice;

import java.util.Scanner;

public class SumProductSame_spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;int prod=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
		if(sum==prod) {
			System.out.println("SPY number");
		}
		else {
			System.out.println("Not a SPY number");
		}
	}

}
