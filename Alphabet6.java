/*
 
A B C D E 
B C D E   
C D E     
D E       
E

*/

package pattern_programming;

import java.util.Scanner;

public class Alphabet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			char ch='A';
			ch+=i-1;
			for(int j=1;j<=num;j++) {
				if(i+j<=num+1) {
					System.out.print(ch++ +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
