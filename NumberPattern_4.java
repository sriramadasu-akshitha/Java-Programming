/*
 
1 2 3 4 5 
2 3 4 5   
3 4 5     
4 5       
5         
 
*/
package pattern_programming;

import java.util.Scanner;

public class NumberPattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int n=1;
			n+=i-1;
			for(int j=1;j<=num;j++) {
				if(i+j<=num+1) {
					System.out.print(n++ +" ");
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
