package arrays;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,5,6,7};
		int [] res=new int[arr.length];
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user input");
		int userinput=sc.nextInt();
		for(int i=arr.length-userinput;i<arr.length;i++) {
			res[k]=arr[i];
			System.out.print(res[k]+" ");
			k++;
		}
		for(int j=0;j<arr.length-userinput;j++) {
			res[k]=arr[j];
			System.out.print(res[k]+" ");
			k++;
		}

	}

}
