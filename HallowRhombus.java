/* 
* * * * * 
* *   * * 
*       * 
* *   * * 
* * * * * 
*/


package pattern_programming;

import java.util.Scanner;

public class HallowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<2*num;i++) {
			for(int j=1;j<2*num;j++) {
				if(i+j>num+1 && j-i<num-1 && i-j<num-1 && i+j<3*num-1) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
