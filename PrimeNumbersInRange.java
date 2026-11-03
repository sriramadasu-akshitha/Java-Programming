package programming_practice;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower range");
		int lowerrange=sc.nextInt();
		System.out.println("Enter Upper range");
		int upperrange=sc.nextInt();
		for(int num=lowerrange;num<=upperrange;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println(num);
			}
		}
		sc.close();
		
	}

}
