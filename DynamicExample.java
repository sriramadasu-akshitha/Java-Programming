package arrays;

import java.util.Scanner;

public class DynamicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int [] arr=new int[sc.nextInt()];
		System.out.println("Default Values");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Initialized values");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
