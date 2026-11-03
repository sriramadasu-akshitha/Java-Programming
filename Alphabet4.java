/*

A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E

*/

package pattern_programming;

import java.util.Scanner;

public class Alphabet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			char ch='A';
			for(int j=1;j<=num;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		sc.close();


	}

}
