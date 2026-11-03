package arrays;

public class OddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,5,6,7,8,9};
		System.out.println("Given array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println("Odd elements are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
