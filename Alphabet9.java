package pattern_programming;

import java.util.Scanner;

public class Alphabet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		char ch='A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if((i+j<=num +1 && i<=j) || (i+j>=num+1 && i>=j)) {
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
