/*

A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 

*/



package pattern_programming;

import java.util.Scanner;

public class Alphabet2 {

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
			ch++;
		}
		sc.close();

	}

}
