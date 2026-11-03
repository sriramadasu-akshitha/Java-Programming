/*
 
5 1 2 3 4 
4 5 1 2 3 
3 4 5 1 2 
2 3 4 5 1 
1 2 3 4 5 
 
*/
package pattern_programming;

import java.util.Scanner;

public class NumberPattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int n=num;
			n=num-i+1;
			int m=1;
			for(int j=1;j<=num;j++) {
				if(i>=j) {
					System.out.print(n++ +" ");
				}
				else {
					System.out.print(m++ +" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
