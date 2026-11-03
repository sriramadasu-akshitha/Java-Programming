package arrays;

public class PalindromeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {121,324,585,145,252,361};
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int rev=0;
			while(num!=0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(arr[i]==rev)
				System.out.println(arr[i]);
		}

	}

}
