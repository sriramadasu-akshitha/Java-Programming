package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,3,5,2,1,7};
		int largest=arr[0];
		int seclargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				seclargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>seclargest || largest==seclargest) {
				if(arr[i]!=largest) {
					seclargest=arr[i];
				}
			}
		}
		System.out.println("Largest : "+largest);
		System.out.println("Second Largest : "+seclargest);
	}

}
