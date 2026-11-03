package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,3,5,2,1,7};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest Element : "+smallest);

	}

}
