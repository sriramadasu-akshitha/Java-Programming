package programming_practice;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		System.out.println("Enter Month");
		int month=sc.nextInt();
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println("31-Days");
			break;
		case 4,6,9,11:
			System.out.println("30-Days");
			break;
		case 2:
			if((year%400==0)||(year%4==0 && year%100!=0)) {
				System.out.println("29-Days");
			}
			else {
				System.out.println("28-Days");
			}
			
		}

	}

}
