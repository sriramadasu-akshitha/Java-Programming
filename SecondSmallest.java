package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,4,3,2,5,2,1,7};
		int smallest=arr[0];
		int secsmallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secsmallest || smallest==secsmallest) {
				if(arr[i]!=smallest) {
					secsmallest=arr[i];
				}
			}
		}
		System.out.println("Second Smallest : "+secsmallest);

	}

}
