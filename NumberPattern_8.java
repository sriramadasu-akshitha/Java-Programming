/*

    1     
  2 1 2   
3 2 1 2 3 
 
 */
package pattern_programming;

import java.util.Scanner;

public class NumberPattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int n=1;
			int m=i;
			for(int j=1;j<2*num;j++) {
				if(i+j>num && j-i<num) {
					if(j<num) {
						System.out.print(m-- +" ");
					}
					else {
						System.out.print(n++ +" ");
					}
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
