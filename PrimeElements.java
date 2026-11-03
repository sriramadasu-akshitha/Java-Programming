package arrays;

public class PrimeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,7,8,9};
		System.out.println("Given elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Prime elements are ");
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println(arr[i]);
		}

	}

}
