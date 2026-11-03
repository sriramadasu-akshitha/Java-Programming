/*
 
    A     
  B B B   
C C C C C 
  D D D   
    E
    
*/
package pattern_programming;

import java.util.Scanner;

public class Alphabet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<2*num;i++) {
			char ch=(char)('A'+i-1);
			for(int j=1;j<2*num;j++) {
				if((i+j>num && j-i<num) && (i-j<num && i+j<3*num)) {
					System.out.print(ch +" ");	
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
