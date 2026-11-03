/*

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
 
*/
package pattern_programming;

import java.util.Scanner;

public class NumberPattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
