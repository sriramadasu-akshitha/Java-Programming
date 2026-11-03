/*

A A A A A 
A A A A A 
A A A A A 
A A A A A 
A A A A A 
 
*/


package pattern_programming;

import java.util.Scanner;

public class Alphabet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		char ch='A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
