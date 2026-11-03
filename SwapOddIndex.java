package arrays;

public class SwapOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,7,8,9,10,1};
		int i=1;
		while(i+2<arr.length) {
			int temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
			i+=4;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
