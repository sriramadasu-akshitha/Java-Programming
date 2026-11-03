package arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,5,6,7};
		int [] res=new int[arr.length];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Input");
		int userinput=sc.nextInt();
		int k=0;
		for(int i=userinput;i<arr.length;i++) {
			res[k]=arr[i];
			System.out.print(res[k]+" ");
			k++;
		}
		for(int j=0;j<userinput;j++) {
			res[k]=arr[j];
			System.out.print(res[k]+" ");
			k++;
		}
	}

}
